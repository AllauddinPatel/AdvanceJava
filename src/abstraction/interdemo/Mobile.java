package abstraction.interdemo;

public interface Mobile {
    void camera();

}
class Oppo implements Mobile{

    @Override
    public void camera() {
        System.out.println("This is Camera");
    }

    public static void main(String[] args) {
        Oppo obj = new Oppo();
        obj.camera();
    }
}
