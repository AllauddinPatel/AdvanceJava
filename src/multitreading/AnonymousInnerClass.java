package multitreading;

public class AnonymousInnerClass {
    public static void main(String[] args) {


        Myinterface myinterface= new Myinterface() {

            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int sub(int a, int b) {
                return a-b;
            }
        };
        System.out.println(myinterface.add(2,3));

        System.out.println(myinterface.sub(3,2));

    }
}


interface Myinterface{

    int add(int a,int b);

    int sub (int a,int b);
}