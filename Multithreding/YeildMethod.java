package Multithreding;
//yeild method is stop the execution of current thread
//Internally used sleep method();
//Provide   hint to TimeShedular
//no exception throw
//and this method gives the chance to the another thread for execution
public class YeildMethod extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" the thred no is:" + i);
        }
    }

    public static void main(String[] args) {
        YeildMethod y=new YeildMethod();

        y.start();
       // Thread.yield();
        for (int i = 1; i <= 2; i++) {
            System.out.println(" the thred main is here:" + i);
        }
    }
}
