package Study;
import java.time.LocalDate; // import the LocalDate class

public class Study1 {
    public static void main(String[] args){
        System.out.println("Welcome back Manasseh");
        LocalDate myObj = LocalDate.now(); // Create a date object
        //System.out.println(myObj); // Display the current date


        String gender = "MALE";

        switch (gender){
            case "MALE":
                System.out.println("I am a MALE");
                break;
            case "FEMALE":
                System.out.println("I am a FEMALE");
                break;
            default:
                System.out.println("Gender not available");


        }
    }
}
