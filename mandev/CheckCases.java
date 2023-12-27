package mandev;


public class CheckCases {
    public static void main(String[] args){
        String name = "Van";
//        System.out.println("Letter => " + Character.isLowerCase(letter));
//       System.out.println(name.length());
        for (int i=0; i < name.length(); i++){
        if (Character.isLowerCase(name.indexOf(i))){
            System.out.println("Found Lowercase!");
        }
       }
    }
}
