package Multithreding;
//This method wait for the execution of another  thread.
//This method throws the execution that is interruptedExecution
public class joinMethod extends Thread{
    public void run(){
        for(int i=1;i<=2;i++) {
            System.out.println(" this is run method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {
        joinMethod j1=new joinMethod();
            j1.join();//wait this below thread and give chance to execute the other thread.
            j1.start();
            for (int i = 0; i <= 3; i++) {
                System.out.println("Execute the thread");
            }

    }
}
