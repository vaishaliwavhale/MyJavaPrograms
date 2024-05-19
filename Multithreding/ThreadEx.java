package Multithreding;

public class ThreadEx extends Thread {
    public static void main(String[]args){
        ThreadEx t=new ThreadEx();
        t.setName("TreadException");
        t.start();
        t.run();
    }
    @Override
     public void run(){
        for (int i=0;i<10;i++){
           // System.out.println("This is thread"+i);
            System.out.println("The new  class name is"+getName());
        }
    }

}
