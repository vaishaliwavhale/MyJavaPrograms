package Multithreding;


//sleep method throw the exception that is Interrupted Exception.
//sleep interrupted the thread
public class SleepMethod1 extends Thread {
    public void run(){
        System.out.println("This is run method ");
    }

    public static void main(String[] args) {
        SleepMethod1 m1=new SleepMethod1();
        m1.start();

    }
}
