package main.com.tyss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	
	Calculator calc;
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

	
	@Test
	void testAdd() {
//		Calculator calc = new Calculator();
		Assertions.assertEquals(2, calc.add(1,1));
	}
	
	@Test
	void testSubtract() {
//		Calculator calc = new Calculator();
		Assertions.assertEquals(2, calc.sub(5, 3));
		assertSame(2, calc.sub(5, 3));
	}
	
	@Test
	void testIsEven() {
//		Calculator calc = new Calculator();
		Assertions.assertTrue(calc.isEven(4));
		Assertions.assertFalse(calc.isEven(5));
	}
	
	@Test
	void testIsOdd() {
//		Calculator calc = new Calculator();
		Assertions.assertTrue(calc.isOdd(5));
		Assertions.assertFalse(calc.isOdd(4));
	}
	
	@Test
	void testDivide() {
		Assertions.assertEquals(2, calc.divide(6, 3));
		assertThrows(ArithmeticException.class, () -> calc.divide(6, 0));
	}
	
	@Test
	void nameCheck() {
		Assertions.assertNull(calc.name(""), (String) null);
		Assertions.assertNotNull(calc.name("Aditya"), "Aditya");
		assertSame("Aditya", calc.name("Aditya"));
	}

	// Parameterized Tests with CSV Source

	@ParameterizedTest
	@CsvSource({
			"2, 3, 5",
			"0, 0, 0",
			"-5, 10, 5"
	})
	public void testAddParameterized(int a, int b, int expected){
		Assertions.assertEquals(expected, calc.add(a, b));
	}

    // Parameterized Tests with Method Source

	@ParameterizedTest
	@MethodSource("provideDivisionTestCases")
	public void testDivisionMethodSource(int a, int b, int expected){
		assertEquals(expected, calc.divide(a, b));
	}

	private static Stream<Arguments> provideDivisionTestCases(){
		return Stream.of(
				Arguments.of(20, 4, 5),
				Arguments.of(15, 5, 3),
				Arguments.of(0, 7, 0),
				Arguments.of(100, 25, 4)
		);
	}

    // Parameterized Tests with Value Source
	@ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    public void testEven(int a){
        assertTrue(calc.isEven(a));

    }

    // Parameterized Tests with CSV File Source
    @ParameterizedTest
    @CsvFileSource(files = "test-data/add.csv", numLinesToSkip = 1)
    public void simpleAddTest(int a, int b, int expected){
        System.out.println("Simple @CsvFileSource test: " + a + " + " + b);
        assertEquals(expected, calc.add(a, b));
    }
}
