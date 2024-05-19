package Multithreding;

import com.sun.source.tree.SynchronizedTree;



public class DeadLock extends Thread {
    final static String s1 = "Vaishali";
    final static String s2 = "Wavhale";


    public static void main(String[] args) {


        DeadLock d1= new DeadLock();
        DeadLock d2 =new DeadLock();
        Thread t1 = new Thread(() -> {
            synchronized (s2) {
                System.out.println("s1");

            }
            synchronized (s1) {
                System.out.println("s2");
            }

        });
        Thread t2 = new Thread(() -> {
            synchronized (s1) {
                System.out.println("s2");

            }
            synchronized (s2) {
                System.out.println("s1");
            }

        });


        t1.start();
        t2.start();



    }
}

