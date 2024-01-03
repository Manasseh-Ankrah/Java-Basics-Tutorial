package TeluskoTutorial;

public class ConstructorOverloading {
    int num;
    double average;
    boolean isFavourite;



    public ConstructorOverloading(int num){
        this.num = num;
    }
    public static void main(String[] args) {

        ConstructorOverloading firstConstruct = new ConstructorOverloading(30);

        System.out.println(firstConstruct.num);


    }
}
