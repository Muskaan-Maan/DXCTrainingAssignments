import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculator(){

        Calculator1 cal = new Calculator1(15000, 5, 4);

        assertEquals(150.09, cal.calculateSimpleInterest(cal.getPrincipal(), cal.getTime(), cal.getRate()));
    }

    @Test
    void validateInvalidPrincipalTest() {

        Calculator1 calculate = new Calculator1(-15000, 5, 4);

        InvalidPrincipalException thrown = Assertions.assertThrows(InvalidPrincipalException.class, () ->
                calculate.validate(calculate), "InvalidPrincipalException");


        Assertions.assertEquals("Invalid Principal Amount", thrown.getMessage());

    }

    @Test
    void validateInvalidTimeTest() {
        Calculator1 calculate = new Calculator1(15000, -5, 4);

        InvalidTimeException thrown = Assertions.assertThrows(InvalidTimeException.class, () ->
                calculate.validate(calculate), "InvalidTimeException");


        Assertions.assertEquals("Invalid Time Period", thrown.getMessage());
    }

    @Test
    void validateInvalidRateTest() {
        Calculator1 calculate = new Calculator1(15000, 5, -4);

        InvalidRateException thrown = Assertions.assertThrows(InvalidRateException.class, () ->
                calculate.validate(calculate), "InvalidRateException");


        Assertions.assertEquals("Invalid Interest Rate", thrown.getMessage());
    }
}