package String_Method;

import static java.lang.Character.charCount;

public class String_Count {
    public static void main(String[] args) {
        String name = "vaishali";
        int name_len = name.length();
        int count = 0;
        int[] charCount = new int[256];
        for (int i = 0; i < name_len; i++) {

            int ascciVal = (int) name.charAt(i);

            charCount[ascciVal]++;

        }
        for (int i = 0; i <charCount.length; i++) {
            if (charCount(i) != 0) {
                System.out.println("The count of charater " + i + "is " + charCount);
            }
        }
    }
}





        /*char c;
        int count = 0;
        for (int i = 0; i <=7; i++) {
            c = name.charAt(i);
            for (char s = c; s >= 7; s++) {
                if (i == c)
                    count++;
                System.out.println("The count if charater " + i + "is " + count);
            }*/


