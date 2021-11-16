package polymorphism;

public class PolymorphismDemo {
    public int  add (int a,int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public  double add(double a,double b){
        return a+b;
    }


    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,5));
        System.out.println(obj.add(1.2,2.5));
    }
}
