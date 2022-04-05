package typing_practice_week_9;
import java.util.Scanner;
public class Program_10 {

    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        isArmstrongNumber(a);
        // closing the scanner object
        scanner.close();
    }
    public static void isArmstrongNumber(int num){

            int number, temp, total = 0;
            number = num;
            while (num != 0) {
                temp = num % 10;
                total = total + temp * temp * temp;
                num /= 10;
            }
            if (total == number) {
                System.out.println(number + " is an Armstrong number");
            } else {
                System.out.println(number + " is not an Armstrong number");
            }
    }

}
