package TeluskoTutorial;

public class School {
    int num;
    double average;
    boolean isFavourite;

    public String show(double v){
         return "Number : " + num + ", Average : " + average + ", isFavourite : " + isFavourite;
    }


    public static void main(String[] args) {
        School firstSch = new School();
        System.out.println(firstSch.show(10.5));

        firstSch.num = 1;
        firstSch.average = 2.8;
        firstSch.isFavourite = true;

        System.out.println(firstSch.show(10.5));


    }

}
