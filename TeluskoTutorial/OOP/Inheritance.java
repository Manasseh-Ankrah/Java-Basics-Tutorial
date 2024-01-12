package TeluskoTutorial.OOP;


class Student {
    String name;
    String email;
    int age;




    public String showMyself (String name, String email, int age) {
        return ("Hello I'm " + name + ", my email address is, " + email + " and I will be " + age + " years old in May");
    }
}


class Prefect extends Student{
    String position;
    String rank;

    public String printRole(String role) {
        return role;

    }
}


//class Teacher{ }




public class Inheritance {
    public static void main (String[] args) {

        Student stud1 = new Student();
        Prefect prefect1 = new Prefect();
//        Teacher teacher1 = new Teacher();


        stud1.name = "Manasseh";
        stud1.email = "solomonankrah24@gmail.com";
        stud1.age = 24;
        prefect1.position = "Senior Boys Prefect";


//        System.out.println(stud1.showMyself(stud1.name,stud1.email,stud1.age));
          System.out.println(prefect1.showMyself(stud1.name,stud1.email,stud1.age));
        System.out.println(prefect1.printRole(prefect1.position));


    }
}
