package flowControl;

 class NestedIf3 {
     public static void main(String[] args) {
         int age = 55;
         if (age > 20) {
             if (age <= 60) {
                 System.out.print("The person is Adult");
             } else if (age > 66) {
                 System.out.print("The person is Senior Citizen");

             }
         } else {

             System.out.println("The person is child");
         }

     }
 }