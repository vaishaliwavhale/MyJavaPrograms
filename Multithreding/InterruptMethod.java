package Multithreding;
// To execute this method the  thread must be in sleep or wait condition
public class InterruptMethod  extends Thread {
    public void run(){
        for(int i=1;i<=3;i++) {
            System.out.println(+i);
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
            //Thread.interrupt();
        }
    }

    public static void main(String[] args) {
        InterruptMethod i=new InterruptMethod();
        // i.yield();
        i.start();
        i.interrupt(); // This thread interrupt

    }
}
