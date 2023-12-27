package mandev;

public class Example_3 {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z = 20;
        int d = 30;
        int e = 40;

        System.out.println(x==20||y>20); //false - 1
        System.out.println(x>5&&e>50); //false - 1
        System.out.println(x==10&&e==30); //false - 1
        System.out.println(d<30||z>20); //false - 1
        System.out.println(e>10&&d==30&&x<5); //false - 1
        System.out.println(!(x==10||e==30)); //false - 1
        System.out.println(!(z<5||y>0&&e<50)); //false - 1
        System.out.println(x==10&&e==30); //false - 1
        System.out.println(!(x==10||e==30)); //false - 1
        System.out.println(z<5||y>0&&e<50); // false- 0
        System.out.println(!(x<y)); // true - 1
        System.out.println(!(x<y&&e==40)); //true - 1
        System.out.println(!(e>10&&d==30&&x<5)); //true - 1
        System.out.println(!(x==20||y>20)); //true - 1
        System.out.println(!(x==5&&e>50)); //true - 1
        System.out.println(!(d==30)&&(y>1)); //false - 1
        System.out.println((d==30)&&!(y>1)); // false - 1
    }
}
