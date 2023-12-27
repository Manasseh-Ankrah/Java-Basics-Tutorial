package mandev;

public class Exercise1 {
    //Using For Loop
    public static void main(String[] args) {
        int sum = 0;
        for (int val = 1; val < 101 ; val++){
            if (val % 2 == 0){
                sum += val;
            }
        }
        System.out.println("Sum of all even numbers from 1 to 100 is "+sum);
    }

//    public static void main(String[] args) {
//        //    Using While Loop
//        int sum = 0;
//        int i = 1;
//        while (i < 101){
//            if (i % 2 == 0){
//                sum += i;
//]            }
//            i++;
//        }
//        System.out.println("Sum of all even numbers from 1 to 100 is "+sum);
//    }
}
