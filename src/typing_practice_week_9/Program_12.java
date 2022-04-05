package typing_practice_week_9;
import java.util.Scanner;
public class Program_12 {

    public static void isPrimeNumbe(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        isPrimeNumbe(a);
        // closing the scanner object
        scanner.close();
    }
    }



