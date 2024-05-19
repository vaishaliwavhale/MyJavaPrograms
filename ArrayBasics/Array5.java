package ArrayBasics;

 class Array5 {
     public static void main(String[]args){
         float arr[]={12.2f,30.1f,56.1f,52.8f};//If we declare float array datatype then we have to write 'f' in the array.
         int index;
         float average = 0;
         float sum=0;
         int len=arr.length;
         //find the average of array
         for(index=0;index<len;index++){
             sum=sum+arr[index];
             average=sum/len;
            
         }
         System.out.println("here is the average of array:"+average);
     }
}
