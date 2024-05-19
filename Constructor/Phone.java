package Constructor;

 class Phone {
     public Phone(){
         System.out.println("This is Default constructor of parent class");
     }
}
class Blood_Test extends Phone {
    public Blood_Test() {
        System.out.println("This is Default constructor of parent class");
    }
    public Blood_Test(String group ){
        System.out.println("This is parameterised constructor of Blood test "+"\n Blood Group  is:"+group);
    }
}
class Demo5{
    public static void main(String[]args){
        Blood_Test b1=new Blood_Test("AB+");
    }
}