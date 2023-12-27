package mandev;

public class ConstructorPractice {
    int id;
    String language;
    Double popularity;
    Boolean isLearningCurveHigh;

    public void printMessage(){
        System.out.println("My favorite programming language is " + language + ", it's learning curve is high," + " that's " + isLearningCurveHigh);
    }

     static String printPopularityMsg(String language, Double popularity){
        String msg = " is a programming language with popularity rating of ";
        return language + msg + popularity;
    }

    ConstructorPractice(int id,String language,Double popularity,Boolean isLearningCurveHigh){
        this.id = id;
        this.language = language;
        this.popularity = popularity;
        this.isLearningCurveHigh = isLearningCurveHigh;
    }

    public static void main (String[] args) {
        ConstructorPractice program = new ConstructorPractice(20,"Java",4.9,true);
        System.out.println("My Constructor Practice Class");

        System.out.println(program.id);
        System.out.println(program.language);
        System.out.println(program.popularity);
        System.out.println(program.isLearningCurveHigh);


        program.printMessage();
        String newMsg =  ConstructorPractice.printPopularityMsg(program.language,program.popularity);
        System.out.println("CALLED SATATIC FNX =>> " + newMsg); ;
    }

}
