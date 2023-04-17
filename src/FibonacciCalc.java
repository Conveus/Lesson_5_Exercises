public class FibonacciCalc {

    public static void main(String[] args) {

        // Call fibonacci
        Fibonacci();

    }

    // Create fibonacci method
    public static void Fibonacci()
    {
        //int count = 0;
        // Set starting numbers
        double num1 = 0;
        double num2 = 1;
        double sum;

        // Print first two numbers
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i <= 100; i++)
        {
            //count++;
            //Calculate and print next number
            sum = num1+num2;
            System.out.println(sum);

            // Set new number
            num1 = num2;
            num2 = sum;
        }
        //System.out.println(count);
    }

}
