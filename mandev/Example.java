package mandev;

public class Example {
    int x = 50;

    public void myMethod(){
     System.out.println("Hello World");
    }
    public static void main(String[] args) {
        String firstname = new String("manasseh");
        //System.out.println(firstname.toUpperCase());
        //Date date = new Date();
        //LocalDate locDate = new LocalDate(2023,10,13);
        //String newDate = date.toString();
        //System.out.println(newDate.toUpperCase());
        //System.out.println(locDate);
        Example number = new Example();
        System.out.println(number.x);
        number.myMethod();

    }
}
