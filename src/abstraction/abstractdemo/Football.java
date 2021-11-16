package abstraction.abstractdemo;


public class Football extends Absport{

    @Override
    void play() {
        System.out.println("Play");

    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exercise();
    }
}
