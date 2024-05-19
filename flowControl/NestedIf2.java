package flowControl;

 class NestedIf2 {
     public static void main(String[]args){
         int marks=66;
         if(marks>50){
             if(marks<70){
                 System.out.println("The student is passed with distingution");
             }
         }else if(marks<35){
             System.out.println("The student is failed");
         }
     }
}
