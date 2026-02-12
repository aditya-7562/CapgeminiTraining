/*
 * Junit Assesment:

Q1.You are developing a Student Eligibility Service for an educational institution.
The service must decide whether a student is eligible based on age rules.

Create a Java class named StudentService
Implement the method:
public boolean isEligible(int age)


Eligibility Rule:
Age 18 or above → Eligible
Age below 18 → Not eligible

Create a JUnit 5 test class named:
StudentServiceTest


Write 10 unit test cases using the following assertion types:

assertTrue
assertFalse
assertEquals
assertNotEquals
assertNotNull
assertSame
assertNotSame
assertAll
assertThrows
fail

Note: Do NOT use main() method
	  Do NOT print output
	  All tests must pass successfully
 */

package main.com.tyss;

public class StudentService {
	public boolean isEligible(int age) {
        return age >= 18;
    }
}
