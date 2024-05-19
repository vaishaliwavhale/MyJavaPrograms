package ArrayBasics;

 class Array4 {
     public static void main(String[]args){
         int arr[]=new int[3];
         arr[0]=11;
         arr[1]=21;
         arr[2]=31;
         int search = 21;
         for( int index=0;index<3;index++){
             if (arr[index]==search){
                 System.out.println("The no is found");
             }else {
                 System.out.println("The no is not found");
             }
         }
     }
}
