package TeluskoTutorial;

public class ConstructorOverloading {
    int num;
    double average;
    boolean isFavourite;

    public String show(){
        return "Number : " + num + ", Average : " + average + ", isFavourite : " + isFavourite;
    }

    public ConstructorOverloading(int num){
        this.num = num;
    }

    public ConstructorOverloading(int num,double ave){
        this.num = num;
        this.average = ave;
    }

    public ConstructorOverloading(int num,double ave,boolean bool){
        this.num = num;
        this.average = ave;
        this.isFavourite = bool;
    }


    public static void main(String[] args) {
        ConstructorOverloading firstConstruct = new ConstructorOverloading(30);
        ConstructorOverloading secondConstruct = new ConstructorOverloading(20,90.5);
        ConstructorOverloading thirdConstruct = new ConstructorOverloading(30,5.5,true);

        System.out.println(firstConstruct.show());
        System.out.println(secondConstruct.show());
        System.out.println(thirdConstruct.show());

    }
}
