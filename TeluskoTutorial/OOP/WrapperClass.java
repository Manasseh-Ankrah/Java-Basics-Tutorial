package TeluskoTutorial.OOP;

public class WrapperClass {
        public static void main(String[] args) {

            int myInt = 5;
            Integer myINT = 5;

            Double myDouble = 5.99;
            Character myChar = 'A';

           // Print statements
            System.out.println(myInt);
            System.out.println(myINT.intValue());
            System.out.println(myINT.longValue());


            System.out.println(myDouble.toString());
            System.out.println(myChar.toString().toLowerCase());
    }
}
