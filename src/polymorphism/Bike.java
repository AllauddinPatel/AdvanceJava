package polymorphism;

public class Bike {
    public void sound1(){
        System.out.println("This is sound");
    }
}


class Activa extends Bike{

    public  void sound1(){
        System.out.println("This is Activa Sound");

    }

    public static void main(String[] args) {
        Activa obj = new Activa();
        obj.sound1();
    }
}
