package multitreading;

public class StaticSynchronization {
    static int num;

    public static void  increase() {
        synchronized (StaticSynchronization.class) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StaticSynchronization obj = new StaticSynchronization();
        StaticSynchronization obj1 = new StaticSynchronization();


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


        Thread t3 = new Thread(()->{
            for (int i=1; i<=1000;i++){
                obj1.increase();
            }
        });
        Thread t4 = new Thread(()->{
            for (int i=1; i<=1000;i++){
                obj1.increase();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Num=>"+num);
    }
}

/*
* Static Synchronization belong to class
* no matter how many object are there
*
*
*
*
* */