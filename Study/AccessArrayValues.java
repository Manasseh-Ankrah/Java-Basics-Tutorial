package Study;

import java.util.Arrays;

public class AccessArrayValues {
    public static void main (String[] args) {
        int [] grades = {10, 20, 30, 40, 50};
        int firstNum = grades[0];
        int thirdNum = grades[2];
        int lastNum = grades[grades.length - 1];
        System.out.println(Arrays.toString(grades));
//        System.out.println(grades.length);
        System.out.println(firstNum);
        System.out.println(thirdNum);
        System.out.println(lastNum);

    }
}
