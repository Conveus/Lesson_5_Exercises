import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {

        // Get variables
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        double num1 = reader.nextDouble();
        System.out.print("Please enter your second number: ");
        double num2 = reader.nextDouble();
        System.out.println();

        // Call methods
        addition(num1,num2);
        subtraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);


    }

    // Create methods
    public static void addition(double x, double y)
    {
        System.out.printf("%f + %f = ", x, y);
        System.out.println(x+y);
    }

    public static void subtraction(double x, double y)
    {
        System.out.printf("%f - %f = ", x, y);
        System.out.println(x-y);
    }

    public static void multiplication(double x, double y)
    {
        System.out.printf("%f x %f = ", x, y);
        System.out.println(x*y);
    }

    public static void division(double x, double y)
    {
        System.out.printf("%f / %f = ", x, y);
        System.out.println(x/y);
    }

}
