package TeluskoTutorial;


class Employee{
    int id;
    String name;
    double salary;
    static final String CEO;

    static {
        CEO = "Julia";
    }

    public String show(){
        return "ID : " + id + ", Name : " + name + ", Salary : " + salary + ", CEO : "+ CEO;
    }

        
}
public class StaticKeyword {
    
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.id=1;
        emp1.name="David";
        emp1.salary= 5000;
//        emp1.CEO="Manasseh Ankrah";
        System.out.println(emp1.show());

        emp2.id=2;
        emp2.name="Aisha";
        emp2.salary= 1000;
//        emp2.CEO="Manasseh Ankrah";
        System.out.println(emp2.show());

    }

}
