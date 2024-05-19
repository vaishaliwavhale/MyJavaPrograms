package String_Method;

public class StringSwap {
    public static void main(String[] args) {
        String str1="Test";
        String str2="best";

        /*str1 =str1+str2;

        str2=str1.substring(0,str1.length()-str2.length());
         str1=str1.substring(str2.length());

        System.out.println("string one- "+str1);
        System.out.println("string two- "+str2);*/


        String temp;
        temp=str1;
        str1=str2;
        str2=temp;
        System.out.println("string 1 is- "+str1);
        System.out.println("string 1 is- "+str2);



    }
}
