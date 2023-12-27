package TeluskoTutorial;

public class HelloWorld {

    public static void main(String[] args){
        if (true) {
            System.out.println("Hello World");
        }
        else {
            System.out.println("Else Statement");
        }

        int i=8;
        int j =0;

         j = (i > 6) ? 3 : 2;

        System.out.println(i);

        int number = 0;
        switch (number) {
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            default:
                System.out.println("Number not found");



        }

    }
}
