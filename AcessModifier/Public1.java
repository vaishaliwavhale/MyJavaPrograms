package AcessModifier;

import java.sql.SQLOutput;

public class Public1 {
    public void show(){
        System.out.println("This is superclass method");
    }
}
class Public2 extends Public1 {
    public void show() {
        System.out.println("This is subclass method");
    }
}
class Public3 {
    public void show() {
        System.out.println("This is  method of non-subclass method");
    }
    public static void main(String[]args){

    }
}
