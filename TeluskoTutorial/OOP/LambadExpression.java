package TeluskoTutorial.OOP;

//@FunctionalInterface
interface Teachers {
    void speak();
}

public class LambadExpression {
    public static void main (String[] args) {
        Teachers reveal = () -> System.out.println("Im your new teacher");

        reveal.speak();
    }
}








