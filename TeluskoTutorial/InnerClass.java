package TeluskoTutorial;

class OuterEmployeeClass {
    int id;
    String name;
    double salary;
    String CEO;

    public String show(){
        return "ID : " + id + ", Name : " + name + ", Salary : " + salary + ", CEO : "+ CEO;
    }

    class innerEmployeeClass {
        int age = 30;
        String role = "Software Engineer";
    }
}
public class InnerClass {
    public  static  void main(String[] args){

        OuterEmployeeClass emp = new OuterEmployeeClass();

        OuterEmployeeClass.innerEmployeeClass innerObj = emp.new innerEmployeeClass();

        System.out.println(innerObj.age);

    }
}
