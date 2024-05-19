package Constructor;

 class Vehical{
     public Vehical(){
         System.out.println("This is Default constructor of parent class");
     }
}
class Bus extends Vehical{
    public Bus(){
        System.out.println("This is Default constructor of parent class");
    }
    public Bus(String comp_name){
        System.out.println("This is parameterised constructor of  child  class of Vehical "+"\n Company name is:"+comp_name);

    }
}
class Demo6{
    public static void main(String[]args){
        Bus b1=new Bus( "Bajaj");
    }

}
