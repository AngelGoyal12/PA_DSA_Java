public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            int a = 20;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Arithmetic operation completed.");
        }

        System.out.println();

        try {
            int[] numbers = {10, 20, 30, 40};

            System.out.println("Element: " + numbers[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        finally {
            System.out.println("Array operation completed.");
        }

        System.out.println("Program continues normally.");
    }
}