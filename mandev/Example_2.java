package mandev;

public class Example_2 {
    public static void main(String[] args) {

        int marks = 41;
        char x;
        if(marks<40)
            x='F';
        else if(marks<50 && marks>40)
            x ='C';
        else if(marks<75 && marks>50)
            x='B';
        else
            x ='A';

        System.out.println("Your Grade is " +x);
    }
}



