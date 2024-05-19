package Inheritance;

 class Cooler {
     public Cooler(){
         System.out.println("This is Default constructor of parent class");
     }
}
class  Freez extends Cooler{
    public Freez(){
        System.out.println("This is Default constructor of parent class");
    }
}
class Demo7{
    public static void main(String[]args){
        Freez e1=new Freez();
    }
}