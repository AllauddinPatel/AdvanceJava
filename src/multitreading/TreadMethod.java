package multitreading;

public class TreadMethod {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() );


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());   //getting name of the Tread
                System.out.println(Thread.currentThread().isAlive());   //for checking that tread is alive or not

            }
        });
        t1.setName("T-1");                                //for giving name to the Tread
        System.out.println(t1.getId());                  //for getting id (java set id to the tread)
        System.out.println(t1.isDaemon());              //for checking that daemon or not
        System.out.println(t1.getState());              // use to check life cycle is new,running
        t1.start();                                      //always start a tread for execution

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
    }
}
