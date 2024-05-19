package Multithreding;

public class ThreadExtend extends Thread{
    public void run(){
        System.out.println("This is parent class method");
    }
    public void show(){
        System.out.println("This is parent class method");
    }
}
class A extends Thread{
    public void run(){
        System.out.println("This is child class method");
    }
    public void show2(){
        System.out.println("This is parent class method");
    }
    public void show(){
        System.out.println("This is parent class method");
    }



    public static void main(String[]args){
        ThreadExtend e=new ThreadExtend();
        A a=new A();
        a.start();
        a.show2();

        e.show();

        e.start();

        System.out.println("This is main method");
    }
}

