package abstraction.interdemo;

public class Vivo implements Mobile {

    @Override
    public void camera() {
        System.out.println("This is Camera");
    }

    public static void main(String[] args) {
        Vivo vivo = new Vivo();
        vivo.camera();
    }
}
