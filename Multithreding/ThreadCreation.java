package Multithreding;
//*****************************************Multiple Threading*********************************************
public class ThreadCreation extends Thread {
    public void run(){
        System.out.println("This is parent class method");
        for(int i=0;i<=5;i++){
            System.out.println("name of thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
class B {
    public static void main(String[] args)  {
        ThreadCreation t = new ThreadCreation();
        t.start();
        for (int i = 0; i <= 5; i++) {
            System.out.println("name of thread");
            //Thread.sleep(3000);

            //System.out.println("This is  child class method");
        }
    }
}