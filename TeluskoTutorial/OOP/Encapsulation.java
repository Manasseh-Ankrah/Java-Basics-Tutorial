package TeluskoTutorial.OOP;


class Operations {
    private int num_1;
    private int num_2;

    // Setters
    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }

    // Getters
    public int getNum_1() {
        return num_1;
    }

    public int getNum_2() {
        return num_2;
    }
}
public class Encapsulation {
    public static void main (String[] Args){
        Operations opp = new Operations();

        opp.setNum_1(3);
        opp.setNum_2(50);

        int first= opp.getNum_1();
        int second = opp.getNum_2();


        System.out.println("First Number => " + first);
        System.out.println("Second Number => " + second);

    }
}
