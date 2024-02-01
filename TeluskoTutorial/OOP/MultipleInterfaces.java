package TeluskoTutorial.OOP;


interface Role {
    public void mentionRole();
}

interface Employee {
    public void mantion();
}

class NewEmp implements Role,Employee {
    public void mentionRole(){
        System.out.println("Im a Software Engineer");
    }
    public void mantion(){
        System.out.println("My name is Manasseh");
    };
}

public class MultipleInterfaces {

    public static void main (String[] args) {
        NewEmp multi = new NewEmp();

        multi.mantion();
        multi.mentionRole();
    }
}
