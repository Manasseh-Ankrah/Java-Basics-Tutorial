package TeluskoTutorial;


class MathsOperator{

    public int add(int ...i) {
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            sum = sum + i[j];
        }
        return sum;
    }

    public int subtract(int ...i) {
        int sub = 0;
        for (int j = 0; j < i.length; j++) {
            sub = sub - i[j];
        }
        return sub;
    }

}
public class SpreadOperator {
    public static void main (String[] args) {
        MathsOperator math = new MathsOperator();
        System.out.println(math.add(4,2,4,6));
        System.out.println(math.subtract(4,2,4,6));

    }
}
