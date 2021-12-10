package java8;

public class methodRefStatic {
    public static void main(String[] args) {
        //Static method
        //refer
        Myinterface4 myinterface4=methodRefStatic::msg;
        //call
        System.out.println(myinterface4.display());


    }

    public static String msg(){
        return "Hello";
    }
}
@FunctionalInterface
interface Myinterface4{
    String display();
}