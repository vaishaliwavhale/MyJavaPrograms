package Multithreding;
//************************************Inplement runneble interface****************************************
public class ThreadImpl implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread creation");
        }
    }

    public static void main(String[] args) {//main is one of the thread.
        ThreadImpl t=new ThreadImpl();       //create the object of the class.
        Thread tt=new Thread(t);
        tt.start();                        //born  new thread
    }
}
