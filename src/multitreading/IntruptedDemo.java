package multitreading;

public class IntruptedDemo implements Runnable {
    @Override
    public void run() {


        for (int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {

        IntruptedDemo intruptedDemo = new IntruptedDemo();
        Thread t1 = new Thread(intruptedDemo);
        t1.interrupt();
        t1.start();
        System.out.println(t1.isInterrupted());
    }
}

/*
*
* we can only interrupt the Thread which have Wait or sleep method
*
* */