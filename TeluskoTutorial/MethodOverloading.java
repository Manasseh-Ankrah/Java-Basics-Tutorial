package TeluskoTutorial;

public class MethodOverloading {
    int num;
    double average;
    boolean isFavourite;

    public String show(){
        return "Number : " + num + ", Average : " + average + ", isFavourite : " + isFavourite;
    }

    public String show(int num){
        return "Number : " + num + ", Average : " + average + ", isFavourite : " + isFavourite;
    }

    public String show(double average){
        return "Number : " + num + ", Average : " + average + ", isFavourite : " + isFavourite;
    }

    public String show(boolean isFavourite){
        return "Number : " + num + ", Average : " + average + ", isFavourite : " + isFavourite;
    }


    public static void main(String[] args) {
        MethodOverloading firstOverload = new MethodOverloading();
        int newNumber =10;

//        firstSch.num = 1;
//        firstSch.average = 2.8;
//        firstSch.isFavourite = true;

        System.out.println(firstOverload.show( ));
        System.out.println(firstOverload.show(10));
        System.out.println(firstOverload.show(10.98));
        System.out.println(firstOverload.show(true));




    }


}





