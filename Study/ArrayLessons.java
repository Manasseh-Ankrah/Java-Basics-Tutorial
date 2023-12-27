package Study;

import java.util.Arrays;

public class ArrayLessons {

    public static void main(String[] args){

//      CREATING ARRAYS: FIRST APPROACH
        // specifying the length of the Array
        String [] strings = new String[3];
        char [] characters = new char[3];
        boolean [] bool = new boolean[3];
//      System.out.println(Arrays.toString(strings));
//      System.out.println(Arrays.toString(characters));
//      System.out.println(Arrays.toString(bool));


        int [] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));


       // CREATING ARRAYS: SECOND APPROACH
       // NOT specifying the length of the Array -- DYNAMIC METHOD

        int [] grades = {10, 20, 30, 40, 50};
        String [] names = {"Nii", "Mandev"};

        System.out.println(Arrays.toString(grades));
        System.out.println(grades.length);
        System.out.println(grades);


//       Logging string arrays
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

    }
}
