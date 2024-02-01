package TeluskoTutorial.OOP;

public class WrapperExe {
    public static void main(String[] args) {
        Integer myInt = 10000;
        String myString = myInt.toString();
        System.out.println(myString.length());

        switch(myString.length()){
            case 1:
                System.out.println("Ones");
                break;
            case 2:
                System.out.println("Tens");
                break;
            case 3:
                System.out.println("Hundreds");
                break;
            case 4:
                System.out.println("Thousands");
                break;
            default:
                System.out.println("Not Known");
        };
    }
}




