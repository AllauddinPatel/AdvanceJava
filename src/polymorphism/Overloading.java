package polymorphism;
//overloading have different parameter but same function
public class Overloading {
    public int add (int a, int b){
        return a+b;
    }

    public double add(double a , int b , int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(2.2,2,3));
    }
}
