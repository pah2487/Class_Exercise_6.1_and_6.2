/**
 * class that finds the sum, product and average for given arrays and can find the factorial of a given integer
 * @author Patrick H.
 * @since 2017-11-27
 * @version 1.0
 */
public class Calculator {
    /**
     * Adds all doubles in an array together
     * @param numbers Double array
     * @return Sum of all doubles in the array
     */
    public static double sum(double[] numbers){
        int count = 0;
        double result = 0;
        while (numbers.length > count){
            result += numbers[count];
            count++;
        }
        return result;
    }
    /**
     * Adds all integers in an array together
     * @param numbers Integer array
     * @return Sum of all Integers in the array
     */
    public static int sum(int[] numbers){
        int count = 0;
        int result = 0;
        while (numbers.length > count){
            result += numbers[count];
            count++;
        }
        return result;
    }
    /**
     * Adds all doubles in an array together then divides by the number of doubles in the array
     * @param numbers Double array
     * @return Average of all doubles in the array
     */
    public static double average(double[] numbers){
        int count = 0;
        double result = 0;
        while (numbers.length > count){
            result += numbers[count];
            count++;
        }
        return (result/numbers.length);
    }
    /**
     * Adds all integers in an array together then divides by the number of integers in the array
     * @param numbers Integer array
     * @return Average of all integers in the array
     */
    public static int average(int[] numbers){
        int count = 0;
        int result = 0;
        while (numbers.length > count){
            result += numbers[count];
            count++;
        }
        return (result/numbers.length);
    }
    /**
     * Multiplies all doubles in an array together
     * @param numbers Double array
     * @return Product of all doubles in the array
     */
    public static double product(double[] numbers){
        int count = 0;
        double result = 1;
        while (numbers.length > count){
            result *= numbers[count];
            count++;
        }
        return (result);
    }
    /**
     * Multiplies all integers in an array together
     * @param numbers Integer array
     * @return Product of all integers in the array
     */
    public static int product(int[] numbers){
        int count = 0;
        int result = 1;
        while (numbers.length > count){
            result *= numbers[count];
            count++;
        }
        return (result);
    }

    /**
     * Finds the factorial of an integer
     * @param x Any integer
     * @return Factorial of given integer
     */
    public static int factorial (int x) {
        int result;
        if (x == 1) {
            return 1;
        }
            result = x * Calculator.factorial(x - 1);
        return result;
    }
}
