package TeluskoTutorial.OOP;


interface Parent {
     void show();
}



public class AnonymousClassInterface {
    public static void main (String[] args) {
        Parent reveal = new Parent(){
            public void show(){
                System.out.println("Im a boy");
            };
        };

        reveal.show();

    }
}
