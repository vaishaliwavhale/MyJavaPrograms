package Multithreding;
///////////////////////////Multiple thread // single task//////////////////////////////////
//by extending Tread class method
//by extending then there is mandatory to override run method

public class Case5 extends Thread {
    public void run(){
        System.out.println("This is run method");
    }

    public static void main(String[] args) {
        Case5 c6=new Case5();
        c6.start();
        Case5 c7=new Case5();
        c7.start();
        Case5 c8=new Case5();
        c8.start();
        // all threads will execute simultaniously.
        // that's why we don't know which thread will get execute first
    }

}
