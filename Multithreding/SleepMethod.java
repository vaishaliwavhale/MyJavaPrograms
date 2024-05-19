package Multithreding;
//******************************************Sleep method program***************************************************
//1. sleep method throw the Interruption Exception
//
public class SleepMethod extends Thread{
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {

                System.out.println("the no is:" + i + Thread.currentThread().getName());
                Thread.sleep(2000);        // Thread will get interrupted here for two sec
            }
        }catch (InterruptedException e) {
                throw new RuntimeException(e);
                //e.printStackTrace();
            }

    }


        public static void main (String[]args){
            SleepMethod s = new SleepMethod();
            s.start();
            SleepMethod s1=new SleepMethod();
            s1.start();

        }

}
