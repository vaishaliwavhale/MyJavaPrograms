package Constructor;

 class Animal {
     public Animal(){
         System.out.println("This is Default constructor of Animal class");
     }
}
class Vertebrates extends Animal{
    public Vertebrates (){
        System.out.println("This is Default constructor of Vertebrates class");
    }
    public Vertebrates (String name,int age){
        System.out.println("This is parameterised constructor of Vertebrates class"+"\nName of Animal is:"+name+"\nAge of Animal is:"+age);
    }
}
class Demo8{
     public static void main(String[]args){
         Vertebrates v1=new Vertebrates("Lion",10);
     }
}