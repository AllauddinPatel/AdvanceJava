package multitreading;

public class SychronizeDemo {
    int num;

    public  void  increase() {
        synchronized (this) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SychronizeDemo obj = new SychronizeDemo();

        Thread t1 = new Thread(()->{
           for (int i=1; i<=1000;i++){
               obj.increase();
           }
        });


        Thread t2 = new Thread(()->{
            for (int i=1; i<=1000;i++){
                obj.increase();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.num);
    }
}
