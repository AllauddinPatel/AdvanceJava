package multitreading;

public class MultithreadingDemo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(500);// it make sleep the loop
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Hello implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class test{
    public static void main(String[] args) {
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();

        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        t1.start();

    }
}
