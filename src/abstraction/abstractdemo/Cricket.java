package abstraction.abstractdemo;

public class Cricket extends Absport {

    @Override
    void play() {
        System.out.println("In Play");
    }

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();
        obj.exercise();
    }

}
