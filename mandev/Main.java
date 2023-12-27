package mandev;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        First appointment
        Appointment firstAppoint = new Appointment();
        firstAppoint.id = 1;
        firstAppoint.customerName ="Nichole";
        firstAppoint.date ="13-10-2023";
        firstAppoint.price = 20.50;
        firstAppoint.service = "Tyre Change";
        firstAppoint.isCompleted = true;

        //        Second appointment

        Appointment secondAppoint = new Appointment();
        secondAppoint.id = 2;
        secondAppoint.customerName ="Mandev";
        secondAppoint.date ="1-10-2023";
        secondAppoint.price = 20.50;
        secondAppoint.service = "Exhaust Pipe Change";
        secondAppoint.isCompleted = false;


        // print attributes

        System.out.println("id => " + firstAppoint.id);
        System.out.println("customerName => " + firstAppoint.customerName);
        System.out.println("date => " + firstAppoint.date);
        System.out.println("price => " + firstAppoint.price);
        System.out.println("service => " + firstAppoint.service);
        System.out.println("isCompleted => " + firstAppoint.isCompleted);

        System.out.println("n/");


        // print attributes
        System.out.println("id => " + secondAppoint.id);
        System.out.println("customerName => " + secondAppoint.customerName);
        System.out.println("date => " + secondAppoint.date);
        System.out.println("price => " + secondAppoint.price);
        System.out.println("service => " + secondAppoint.service);
        System.out.println("isCompleted => " + secondAppoint.isCompleted);






    }
}