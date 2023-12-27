package mandev;

import java.util.ArrayList;

public class AddressBook {
    public static void main(String[] args) {

        ArrayList<Contact> contactArr = new ArrayList<>();
        Contact person1 = new Contact(1,"Manasseh","solomonankrah24@gmail.com",0506963140F);


//        System.out.println("Person 1 =>> " + Arrays.toString(person1));
//
        contactArr.add(person1);
        Contact getNewCont = contactArr.get(0);

        System.out.println(getNewCont);
//
        for (Contact cont : contactArr){
            System.out.println("Contact =>" + cont.email);
        }

    }
}
