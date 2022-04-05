package typing_practice_week_9;

import java.util.Scanner;

public class Program_5 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = scanner.nextInt();
        boolean check = isPalindrome(a);
        //check number is palindrome or not
        if (check) {
            System.out.println("Number is palindrome");
        }else
            System.out.println("Number is palindrome");
        //closing the scanner object
        scanner.close();

    }

    public static boolean isPalindrome(int number){
    //convert negative number to positive number
    if(number < 0){
        number = -number;
    }
    int lastDigit, revers = 0, temp;
    temp = number;
    while (number > 0){
      //Stores the last digit
      lastDigit = number % 10;
      revers = revers * 10 + lastDigit;
      number = number / 10;
    }
    return revers == temp;
    }

}
