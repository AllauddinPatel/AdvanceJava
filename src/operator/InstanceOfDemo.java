package operator;

interface MyInterface{

}

public class InstanceOfDemo implements MyInterface{
    public void show(){
        System.out.println("In Show");

    }

    public static void main(String[] args) {
        InstanceOfDemo obj = new InstanceOfDemo();
        if(obj instanceof MyInterface) {
            obj.show();
        }
    }
}
