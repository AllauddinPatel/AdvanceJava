package abstraction.interfacedemo;


public class Cricket implements Sport {

    @Override
    public void play() {
        System.out.println("Playing Cricket");
    }

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();
        obj.play1();
    }


    @Override
    public void play1() {
        System.out.println("Playing 1");
    }

}
