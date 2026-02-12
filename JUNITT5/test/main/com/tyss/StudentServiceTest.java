package main.com.tyss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentServiceTest {

    private StudentService service;

    @BeforeEach
    void setUp() {
        service = new StudentService();
    }

    @Test
    void testAssertTrue() {
        assertTrue(service.isEligible(18));
    }

    @Test
    void testAssertFalse() {
        assertFalse(service.isEligible(17));
    }

    @Test
    void testAssertEquals() {
        assertTrue(service.isEligible(25));
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(true, service.isEligible(10));
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(service.isEligible(30));
    }

    @Test
    void testAssertSame() {
        Boolean expected = Boolean.TRUE;
        Boolean actual = service.isEligible(20);
        assertSame(true, actual);
    }

    @Test
    void testAssertNotSame() {
        Boolean result1 = service.isEligible(19);
        Boolean result2 = Boolean.FALSE;
        assertNotSame(result1, result2);
    }

    @Test
    void testAssertAll() {
        assertAll(
            () -> assertTrue(service.isEligible(18)),
            () -> assertFalse(service.isEligible(5)),
            () -> assertTrue(service.isEligible(40))
        );
    }

    @Test
    void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Age cannot be negative");
        });
    }

    @Test
    void testFail() {
        try {
            service.isEligible(18);
        } catch (Exception e) {
            fail("No exception should be thrown");
        }
    }
}
