package typing_practice_week_9;

import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {
        findMinAndMaxNumber();

    }
   public static void findMinAndMaxNumber(){
       //Scanner declaration for reading input form console
       Scanner scanner = new Scanner(System.in);
       int min = 0;
       int max = 0;
       boolean first = true;
       //while loop
       while (true)
       {
           System.out.println("Enter number: ");
           boolean isAndInt = scanner.hasNextInt();
           if(isAndInt)
           { int number = scanner.nextInt();
               if(first)
               {
                   first = false;
                   min = number;
                   max = number;
               }
               if(number > max)
               {
                   max = number;
               }
               if(number < min)
               {
                   min = number;
               }

           }else
           {
               break;
           }
           scanner.nextInt();//handle input
       }
       System.out.println("Min = " + min + " , Max = " + max);
       scanner.close();
   }

}
