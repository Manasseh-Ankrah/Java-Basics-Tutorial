package TeluskoTutorial;

public class PrintLetters {

    public static void main (String[] args) {

        /*

        A
        A B
        A B C

         */

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                char letter;
            if (j == 1) {
                letter = 'A';
            } else if (j == 2) {
                letter = 'B';
            } else {
                letter = 'C';
            }
                System.out.print(letter);
            }
            System.out.println(" ");
            }
    }
}
