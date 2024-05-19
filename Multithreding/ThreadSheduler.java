package Multithreding;

public class ThreadSheduler  implements Runnable{
    public void run(){

        try {
            for(int i=0;i<=5;i++) {
                System.out.println("this is parent class method");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
class M  extends ThreadSheduler{
    public static void main(String[] args) throws InterruptedException {
        ThreadSheduler p = new ThreadSheduler ();
        p.run();

        Thread t=new Thread();
        t.start();

        System.out.println("this is child class method");
        Thread.sleep(3000);
    }
}
