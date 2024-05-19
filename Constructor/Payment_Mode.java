package Constructor;

 class Payment_Mode {
     public Payment_Mode(){
         System.out.println("This is Default constructor of parent class");
     }
}
class Cash extends Payment_Mode{
     public Cash(){
             System.out.println("This is Default constructor of  child  class");
     }
}
class Online_Mode extends Cash{
    public Online_Mode() {
        System.out.println("This is Default constructor of  child  class of cash mode ");
    }
    public Online_Mode(double ammount ){
        System.out.println("This is parameterised constructor of  child  class of cash mode "+"\n Ammount is:"+ammount);
    }
}
class Demo3{
     public static void main(String[]args){
         Online_Mode c1=new Online_Mode( 101);
     }
}