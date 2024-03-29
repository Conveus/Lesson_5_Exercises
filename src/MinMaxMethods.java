import java.util.Scanner;

public class MinMaxMethods {

    public static void main(String[] args) {

        // Get variables
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        double num1 = reader.nextDouble();
        System.out.print("Please enter your second number: ");
        double num2 = reader.nextDouble();
        System.out.print("Please enter your third number: ");
        double num3 = reader.nextDouble();

        // Check which method versions to use (int or double)
        if(num1 % 1 == 0)
        {
            // Call integer versions
            System.out.println("The smallest number is : " + min((int)num1, (int)num2, (int)num3));
            System.out.println("The largest number is : " + max((int)num1, (int)num2, (int)num3));
        }
        else
        {
            // Call double versions
            System.out.println("The smallest number is : " + min(num1, num2, num3));
            System.out.println("The largest number is : " + max(num1, num2, num3));
        }


    }

    // Create methods to find min
    public static int min(int x, int y, int z)
    {
        int min;

        if(x<y & x<z)
        {
            min = x;
        }
        else if (y<z)
        {
            min = y;
        }
        else
        {
            min = z;
        }

        return min;
    }

    public static double min(double x, double y, double z)
    {
        double min;

        if(x<y & x<z)
        {
            min = x;
        }
        else if (y<z)
        {
            min = y;
        }
        else
        {
            min = z;
        }

        return min;
    }

    // Create methods to find max
    public static int max(int x, int y, int z)
    {
        int max;

        if(x>y & x>z)
        {
            max = x;
        }
        else if (y>z)
        {
            max = y;
        }
        else
        {
            max = z;
        }

        return max;
    }

    public static double max(double x, double y, double z)
    {
        double max;

        if(x>y & x>z)
        {
            max = x;
        }
        else if (y>z)
        {
            max = y;
        }
        else
        {
            max = z;
        }

        return max;
    }
}
