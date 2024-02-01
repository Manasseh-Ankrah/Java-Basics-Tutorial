package TeluskoTutorial.OOP;


 class AA {
    public void show() {
            System.out.println("Printing from AA");
    }
}





public class AnonymousClass {
    public static void main (String[] args) {
        AA alpha = new AA(){
            //  Anonymous Function
            public void show() {
                System.out.println("Printing from BB");
            }
        };

        alpha.show();
    }
}
