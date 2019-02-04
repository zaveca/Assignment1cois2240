import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to the Fibonacci Sequence program. ");
        System.out.print("Please input the Nth Fibonacci Series number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long start = System.nanoTime();
        System.out.println("The fibonacci series of numbers calculated to " + number + " recursively are: ");
        for (int i = 0; i <= number - 1; i++) {
            System.out.print(fiboSeriesRec(i) + " ");
        }
        long end = System.nanoTime();
        System.out.println("Time taken for recursive method (in nanoseconds)is: "+(end-start));

    }

    //recursive function

        public static int fiboSeriesRec(int number) {
                if (number == 0) {
                return 0;

            }
                {
            if (number == 1 || number == 2) {
                return 1;
            }
            return fiboSeriesRec(number - 1) + fiboSeriesRec(number - 2);
        }
    }
}




