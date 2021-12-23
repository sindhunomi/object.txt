import java.util.*;
class Day104{
public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  String str = "HELLO";
  String str2 ="HELLO";
  char ch []= {  'S','T','R','I','N','G'};
   String s2 = new String(ch) ;
   String s3 =s2.intern();
 System.out.println(s3);  
System.out.println(s2.trim());    
 System.out.println(str2==str);       
   }
}
