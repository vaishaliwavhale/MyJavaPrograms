package Constructor;

class Cooler {
    public Cooler(){
        System.out.println("This is Default constructor of parent class");
    }
}
class Freez extends Cooler{
    public Freez(){
        System.out.println("This is Default constructor of child  class");
    }
}
class Demo7{
    public static void main(String[]args){
        Cooler c1=new Cooler();
    }
}
