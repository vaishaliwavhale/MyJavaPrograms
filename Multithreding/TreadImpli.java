package Multithreding;

public class TreadImpli implements Runnable {
    @Override
    public void run() {
        

    }
    public void show(){
        System.out.println("This is show method");
    }
    public void start1(){
        System.out.println("start method");
    }

    public void show1() {
    }
}
class D{
    public static void main(String[] args) {
        TreadImpli e=new TreadImpli();
        Thread t=new Thread(e);
        t.start();
       e.show1();
    }
}
