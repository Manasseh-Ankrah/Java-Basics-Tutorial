package Study;

import java.util.Arrays;

public class MultiDimensionalLoop {
    public static void main(String[] args) {
        int[][] myNumbers = {{7, 2, 1, 4} , {5, 6, 7} };

//        System.out.println(Arrays.toString(myNumbers[0]));

        int firstNum = myNumbers[0][0];
        int lastNum = myNumbers[1][myNumbers[1].length -1]; // this is equal to myNumbers[1][2];
//        System.out.println(firstNum);
//        System.out.println(lastNum);


//        ARRAY METHODS

//        SORT
        int[] sortedArr =myNumbers[0];
//        Arrays.sort(sortedArr);
//        System.out.println(Arrays.toString(sortedArr));

        int[] binarySortedArr =myNumbers[0];
        Arrays.sort(sortedArr);
        int index = Arrays.binarySearch(binarySortedArr,1);
        System.out.println(index);


    }
}
