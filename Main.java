import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Fibonacci Sequence program. ");
        System.out.print("Please input the Nth Fibonacci Series number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long start = System.nanoTime();
        System.out.println("The fibonacci series of numbers calculated to " + number + " iteratively are: ");
        for (int i = 0; i <= number - 1; i++) {
            System.out.print(fiboSeriesIte(i) + " ");
        }
        long end = System.nanoTime();

        System.out.println("Time taken for iterative method (in nanoseconds): "+(end-start));
    }

    //iterative function
    public static int fiboSeriesIte(int number) {
        if (number == 0) {
            return 0;
        }
        {
            if (number == 1 || number == 2) {
                return 1;
            }
            int fn1 = 1, fn2 = 1, fibsum = 1;
            for (int i = 3; i <= number; i++) {
                fibsum = fn1 + fn2;
                fn1 = fn2;
                fn2 = fibsum;
            }
            return fibsum;
        }
    }
}


