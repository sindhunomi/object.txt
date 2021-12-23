import java.util.*;
class  Day103{
 public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println("Reverse of the string is : " );
      for(int i = 0 ;i<str.length();i++ ){
      System.out.print(str.charAt(str.length()-i-1)); 
      }
   }
} 
          
    