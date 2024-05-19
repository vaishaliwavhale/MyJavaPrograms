package Constructor;
class Drinking_Machine {
    public Drinking_Machine(){
        System.out.println("This is Default constructor of Drinking_Machine class");
    }
}
class Coffee_Machine extends Drinking_Machine {
    public Coffee_Machine() {
        System.out.println("This is Default constructor of Coffee Drinking_Machine class");
    }
}
class  Demo9{
    public static void main(String[]args){
        Coffee_Machine c1=new Coffee_Machine();
    }
}