package java8;

public class DefaultAndStatic implements myinterface6,myinterface7{
    public static void main(String[] args) {
        DefaultAndStatic defaultAndStatic = new DefaultAndStatic();
        System.out.println(defaultAndStatic.add(4,4));
        System.out.println(myinterface6.display());
    }



    @Override
    public String msg() {
        return null;
    }

    @Override//this occurred diamond prob (due to same method name in diff interface), so we have to tell which method should be executed.
    public int add(int i, int j) {
        return myinterface6.super.add(i, j);
    }
}
interface myinterface6{
    String msg();
    private void sub(){
        System.out.println("In sub Method");
    }

    default int add(int i,int j){
        sub();
        return i+j;
    }


    static String display(){
        return "Using static in interface and it can access using class name dot function name";
    }
}

interface myinterface7{
    default int add(int i,int j){
        return i+j;
    }
}