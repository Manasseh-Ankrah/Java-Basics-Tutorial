package TeluskoTutorial.OOP;


abstract class Animal {
    public abstract void sound();

    public void makeSound(){
        System.out.println("Meow!");
    }
}


 class Cat extends Animal {

     public void sound(){
         System.out.println("Muuuu!");
     };
    public void catSound(){
        System.out.println("New cat meow");
    }
}


 class Abstraction  {
    public static void main (String[] args) {
        Cat kitty = new Cat();

        kitty.catSound();
        kitty.makeSound();
        kitty.sound();
    }
}
