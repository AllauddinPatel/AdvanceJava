package multitreading;

public class TreadPriority {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.MIN_PRIORITY);


        obj.start();
        obj1.start();
    }
}


class A extends Thread {
    @Override
    public void run() {
        System.out.println("In A Run");
    }
}


class B extends Thread {
    @Override
    public void run() {
        System.out.println("In B Run");
    }
}