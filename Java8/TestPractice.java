package Java8;

public class TestPractice {
    /*  public static void main(String[] args) {
          String name="vaishali";
          int name_len=name.length();
          char c;


          String reverse_string="";

          for(int i=name_len-1;i>=0;i--){
               c=name.charAt(i);
               reverse_string= reverse_string+c;

          }
          System.out.println("The reverse string is:-  "+reverse_string);
      }*/
    public static void main(String[] args) {
        String name = "vaishali";
        int name_len = name.length();
        char c;
       /* for (int i = name_len - 1; i >= 0; i--) {
            c = name.charAt(i);
            System.out.print(c);

        }*/
        int count=0;
        for(int i=0;i<=name_len;i++) {
            c = name.charAt(i);
          /*  for( c=name.charAt(i);c<=name_len;c++){
                i*/
            if(i==c)
                 count++;
            System.out.println("The count if charater "+i+"is "+count );
        }

        }

    }
