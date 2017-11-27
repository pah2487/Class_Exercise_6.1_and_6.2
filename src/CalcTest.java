/**
 * Driver class for Calculator
 * @author Patrick H.
 * @since 2017-11-27
 * @version 1.0
 */
public class CalcTest{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(calc.sum(numbers));
        System.out.println(calc.product(numbers));
        System.out.println(calc.average(numbers));
        System.out.println(calc.factorial(4));
    }
}
