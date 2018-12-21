import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        assertEquals("10 + 5 must be 15", 10, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));
    }

    //TODO
    //add new tests for add() method
    @Test
    public void secondTestAddIntToInt() {
        assertEquals("5 + -5 must be 0", 0, calc.add(5,-5));
    }
    //TODO
    //add tests for new methods
    @Test
    public void testMultiply() {
        assertEquals("5 * 5 must be 25", 25, calc.multiply(5, 5));
    }

    @Test
    public void testAriphmeticDivision() {
        assertEquals("20 / 5 must be 4.0", 0.0f, calc.division(20,0));
    }

    @Test
    public void testDivideZero() {
       try{
           calc.division(20,0);
           assertEquals("Somthing Wrong",true,false);
       }catch(ArithmeticException ae){
          assertEquals("You shouldnt do it","/ by zero", ae.getMessage());
       }
    }

    @Test
    public void testAriphmeticSqrt() {
        assertEquals("sqrt from 0 must be 0.0", 0.0, calc.ariphmeticSqrt(0));
    }

    @Test
    public void testAriphmeticPower() {
        assertEquals("2 popwer 3 must be 8", 8.0, calc.ariphmeticPower(2, 3));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}
