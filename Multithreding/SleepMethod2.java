package Multithreding;
//sleep created in main method
//
public class SleepMethod2  extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread();
        t.start();
        Thread.sleep(2000);

    }
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("The value of i is:" +" "+ i);
        }
    }
}
