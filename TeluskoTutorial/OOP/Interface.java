package TeluskoTutorial.OOP;


interface Manufacturer {
    void drive();
    void reverse();
    void stop();
}
class Car implements Manufacturer {

    public void drive() {
        System.out.println("A function that keeps the car in a foward motion");
    }

    public void reverse() {
        System.out.println("A function that keeps the car in a backward motion");
    }

    public void stop(){
        System.out.println("A function that keeps the car in a stationary position");
    }

}



public class Interface {
    public static void main (String[] args) {
        Car newCar = new Car();

        newCar.drive();
        newCar.reverse();
        newCar.stop();


    }
}
