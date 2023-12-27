package Study;

public class BreakAndContinue {
    public static void main(String[] ags) {
        int[] grades = {10, 21, 30, 40, 57};

//        FOR LOOP BREAK EXAMPLE
//        for (int grade : grades){
//            if (grade == 30){
//                break;
//            }
//            System.out.println(grade);
//
//        }


        for (int grade : grades){
            if (grade % 2 == 0){
                continue;
            }
            System.out.println(grade);

        }

    }
}
