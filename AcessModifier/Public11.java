package AcessModifier;

public class Public11{
    protected int a=10;
     private void show(){
        System.out.println("This method  from superclass");
    }
}
class Public22 {
     protected void show() {
        System.out.println("This method  from subclass");
    }


    public static void main(String[] args) {
        Public11 p1 = new Public11();
       // p1.show();
    }
}