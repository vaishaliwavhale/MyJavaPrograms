package AcessModifier;
class Test{

    void check(){
        Demo2 obj = new Demo2();
        obj.run();
    }

}
class Demo{

    void run(){

    }

}
class Demo2 extends Demo{

}


public class ProtectedModifier
{
    public static void main(String[] args) {

        Demo2 obj = new Demo2();
        obj.run();


    }

}

