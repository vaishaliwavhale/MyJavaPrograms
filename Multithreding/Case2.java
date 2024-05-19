package Multithreding;
//************************************************Multiple  task multiple thread*********************************
public class Case2 implements Runnable {
    @Override
    public void run() {
        System.out.println("This is one task");
    }
}

    class Case4  implements Runnable{
    @Override
    public void run() {
            System.out.println("This is 2 task");
}

    public static void main(String[] args) {
        Case2 c2 =new Case2();
        Thread t=new Thread(c2);
        t.start();
        Case3 c3 = new Case3();
        //Thread t1=new Thread(c3);
       // t1.start();
    }
}
