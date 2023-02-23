import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTesterTest {

    @Test
    public void validateNameValidTest1()
    {

        assertTrue(new Employee("John Travolta", 45000.0, 45).getName(), true);
    }

    @Test
    public void validateNameInValidTest1(){


        assertFalse(new Employee("Jonathan", 45000.0, 45).getName(), false);

    }

    @Test
    public void validateAgeValidTest1(){

        Employee employee = new Employee("Jonathan", 45000.0, 18);
        Validator valid = new Validator();

        Assert.assertTrue( valid.validateAge(employee.getAge()));
    }

    @Test
    public void validateAgeInvalidTest1(){

        Employee employee = new Employee("Jonathan", 45000.0, 17);
        Validator valid = new Validator();

        Assert.assertFalse( valid.validateAge(employee.getAge()));
    }

    @Test
    public void validateInvalidNameTest1() {

        Employee employee = new Employee("Maria", 2000, 25);

        Validator valid = new Validator();


        InvalidNameException thrown = Assertions.assertThrows(InvalidNameException.class, () ->
                        valid.validate(employee), "It should throw InvalidNameException");


        Assertions.assertEquals("Invalid Name", thrown.getMessage());
    }

    @Test
    public void validateInvalidAgeTest1() {

        Employee employee = new Employee("Maria Francis", 2000, 17);

        Validator valid = new Validator();


        InvalidAgeException thrown = Assertions.assertThrows(InvalidAgeException.class, () ->
                valid.validate(employee), "It should throw InvalidAgeException");


        Assertions.assertEquals("Invalid Age", thrown.getMessage());
    }

    @Test
    public void calculateAnnualSalaryValidTest1(){

        Employee employee = new Employee("Maria Francis", 2000, 18);

        assertEquals(24120.0, employee.calculateAnnualSalary());
    }
}