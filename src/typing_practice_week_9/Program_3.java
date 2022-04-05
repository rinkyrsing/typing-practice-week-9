package typing_practice_week_9;

import java.util.Scanner;
public class Program_3 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        String str = scanner.next().toLowerCase();
        //calling static method directly
        checkVowelOrConsonant(str);
        // closing the scanner object
        scanner.close();

    }

    public static void checkVowelOrConsonant(String letter) {
        //check length of string
        // If user enters more than 1 character an error message is printed
        if (letter.length() > 1)
        {
            System.out.println("Error. Not a single character");
            //if user enter a sumbol
        }else if(!(isItALetter (letter))) {
            System.out.println("Enter. Not a letter. Enter uppercase or lowercase letter");
        }else if(letter.equals("a") || letter.equals("e") || letter.equals("i")
        || letter.equals("o") || letter.equals("u"))
        {
            System.out.println("Input letter is a vowel");
        }else
        {
            System.out.println("Input letter is a consonant");
        }
    }
    //This method will check is it a letter or not?
    public static boolean isItALetter(String l)
    {
      return l.charAt(0) > 96 && l.charAt(0) < 123;
    }
}
