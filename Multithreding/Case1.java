package Multithreding;
//**********************************************Single thread single task********************************
public class Case1  extends Thread{

    @Override
    public void run() {
        System.out.println("This is  task completed by single thread");
    }

    public static void main(String[] args) {
        Case1 cc=new Case1();
        cc.start();
    }
}
