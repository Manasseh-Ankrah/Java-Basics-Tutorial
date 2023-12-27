package Study;

import java.time.LocalDate;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name =  scan.nextLine();

        System.out.println("Which year were you born in? ");
        int age =  scan.nextInt();
       int year = LocalDate.now().minusYears(age).getYear();

        System.out.println("My name is " + name);
        System.out.println("I was born in " + age);
        System.out.println("My age is " + year);

        scan.close();

    }
}
