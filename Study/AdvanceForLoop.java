package Study;

import java.util.Arrays;

public class AdvanceForLoop {
    public static void main(String[] ags) {
        int [] grades = {10, 20, 30, 40, 50};

        //Standard ForLoop
        // Has access to index.
       // for (int i = 0; i < grades.length; i++){
           // System.out.println(grades[i]);
        //}

        //Advanced ForLoop.
        // Does not have access to index.
//        for (int grade: grades){
//            System.out.println(grade);
//            System.out.println(Arrays.toString(grades));
//        }



//        Forloop shortcut. Type (grades.for)
//        for (int grade : grades) {
//
//        }
//
//        for (int i = 0; i < grades.length; i++) {
//
//        }
//
//        for (int i = grades.length - 1; i >= 0; i--) {
//
//        }




//        int i = 0;
//        for (int grade: grades){
//            i++;
//            //System.out.println(grade);
//            System.out.println(Arrays.toString(grades));
//        }
//        System.out.println(i - 1);



//        MASTER LEVEL FOR LOOP

        Arrays.stream(grades).forEach(System.out::println);

    }
}
