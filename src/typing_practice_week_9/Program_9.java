package typing_practice_week_9;

import java.util.Scanner;

public class Program_9 {

    public static void main(String[] args) {
      //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacci(scanner.nextInt());
        scanner.close();

    }
    public static void isFibonacci(int count) {

            int n1 = 0, n2 = 1, n3;
            System.out.print(n1 + " " + n2);
            //loop starts from 2 because 0 and 1 are already printed
            for (int i = 2; i < count; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }


