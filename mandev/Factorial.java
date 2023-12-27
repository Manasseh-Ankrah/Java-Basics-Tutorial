package mandev;

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int factorial = 1;
       int val = 0;
       try{
           int userInput = scan.nextInt();
           scan.close();
           if (userInput < 0){
               System.out.println("Please enter a non-nagative integer " );
           } else {
               for(int i = 1; i < userInput + 1; i++){
                   val = i;
                   System.out.println("Values =>" + i);
                   factorial *=  val ;
               }
               System.out.println(userInput + " factorial is = " + factorial);
           }
       }catch(Exception e){
           System.out.println("This is a non-integer " );
       }
   }
}
