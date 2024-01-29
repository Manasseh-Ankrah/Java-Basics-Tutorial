package TeluskoTutorial.OOP;


class A {
    public A() {
        System.out.println("Initial A");
    }

    public A(int a) {
        System.out.println("Initial A value = " + a);
    }
}

class B extends A {
    public B() {
        System.out.println("Initial B");
    }

    public B(int b) {
        super(b);
        System.out.println("Initial B value = " + b);
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B secondVal = new B(5);
    }
}
