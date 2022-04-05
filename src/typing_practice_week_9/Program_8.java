package typing_practice_week_9;

import java.util.Scanner;

public class Program_8 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        symbolTriangle(scanner.nextInt());
        // closing the scanner object
        scanner.close();
    }


    public static void symbolTriangle(int n){
        for ( int i = 0; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.println("@");
            }
            System.out.println(",");
        }
    }
}
