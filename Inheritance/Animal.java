package Inheritance;

 class Animal {
    int life_sapn=2;
    String name="dog";
    void showDetails(){
        System.out.println("\nName of the animal:-"+name+"\nLife span of the animal:-"+life_sapn);
    }
}
class Mammels extends Animal{

}
class Demo3{
     public static void main(String[]args){
         Mammels m1=new Mammels();
         m1.showDetails();
     }
}