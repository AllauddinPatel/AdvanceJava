package multitreading;
// in functional interface we can directly implement the method by using lamda function(->).i.e
//i.e. it shorts the code from object defining to variable declaration.
//only implemented for functional interface

public class lymdaexpression {

    public static void main(String[] args) {
        Myinterface1 obj = (int a, int b) -> {
                return a+b;

        } ;
        System.out.println(obj.add(2,3));
    }

}

@FunctionalInterface
interface Myinterface1{
    int add(int a,int b);
}
