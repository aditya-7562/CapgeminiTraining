package main.com.tyss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoanServiceTest {
    private LoanService service;

    @BeforeEach
    void setUp() {
        service = new LoanService();
    }

    @Test
    void testValidEigibility() {
        assertTrue(service.isEligible(21, 26000));
    }@Test
    void testInValidAge() {
        assertFalse(service.isEligible(16, 36000));
    }@Test
    void testInValidSalary() {
        assertFalse(service.isEligible(21, 34000));
    }

    @Test
    void testValidEmi(){
        assertEquals(500, service.calculateEMI(12000, 2));
    }
    @Test
    void testValidLoanAmount(){
        assertThrows(IllegalArgumentException.class, () -> service.calculateEMI(0, 12));
    }@Test
    void testValidLoanTenure(){
        assertThrows(IllegalArgumentException.class, () -> service.calculateEMI(12, 0));
    }

    @Test
    void testCreditCategories(){
        assertEquals("Premium", service.getLoanCategory(760));
        assertEquals("Standard", service.getLoanCategory(660));
        assertEquals("Standard", service.getLoanCategory(600));

        assertEquals("Premium", service.getLoanCategory(750));
        assertEquals("Standard", service.getLoanCategory(749));
        assertEquals("High Risk", service.getLoanCategory(599));
    }

    @Test
    void testBoundaryAgeAndSalary() {
        assertAll(
                () -> assertTrue(service.isEligible(21, 25000)),
                () -> assertTrue(service.isEligible(60, 25000))
        );
    }

}
