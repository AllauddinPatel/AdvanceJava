package multitreading;

public class DaemonThread extends Thread {
    public static void main(String[] args) {

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        System.out.println(daemonThread.isDaemon());
        System.out.println("In Main Method");

    }

    @Override
    public void run() {
        System.out.println("In Run");
    }
}

/*
* Daemon is use as worker Thread of main Thread it is work on Background of a main Thread
* we cannot set main Thread as a Daemon Thread
* and also in object Daemon is call before the object is to be call
*
* */