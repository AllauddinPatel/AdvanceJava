package java8;

public class MethodrefConstructor {
    public static void main(String[] args) {
        //refer
        Myinterface5 myinterface5=MethodrefConstructor::new;
        //call
        myinterface5.methodref();

    }
   public MethodrefConstructor(){
       System.out.println("In Constructor");
   }
}


interface Myinterface5{
    MethodrefConstructor methodref();
}