/**
 * Created by kate on 1/12/16.
 */

public class Calculator {

    public static void main(String[] args) {
    }

    public int add(int a, int b) {

        return a + b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public float division(int a, int b) {
        try {
          a/b;
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }

    public int substraction(int a, int b) {

        return a - b;

    }

    public double ariphmeticSqrt (double a) {

        return Math.sqrt(a);

    }

    public double ariphmeticPower (double a, double b) {
        return Math.pow(a, b);
    }

    //TODO
    //add methods for multiply, division, subtraction, square root, x^2

}







