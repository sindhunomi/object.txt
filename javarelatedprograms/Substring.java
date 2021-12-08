import java.util.*;
class Substring
{ 
   public static void main(String args[])
  {
      Scanner sc =new Scanner(System.in);
      String s =sc.next();
      System.out.println(s);
      String str =s.substring(0);
      System.out.println(str); 
      String str2 =s.substring(3,7);
      System.out.println(str2);
    }
}