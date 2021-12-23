import java.lang.*;
import java.util.*;
class Day101
  {
     public static void main(String args[])
        {  
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();          
                int count = 0;
                for(int i =0;i<str.length();i++){
                   if(str.charAt(i)=='e'){
                          count++;
                      } 
              }
             System.out.println(count);
            char ch =str.charAt(5);
            System.out.println(str.substring(1,5));
            System.out.println(ch);
             int strlength =str.length();
             System.out.println(strlength);
             System.out.println("the character at 1st position :  "  + str.charAt(0));
             System.out.println("the character at last position : " + str.charAt(str.length()-1));
         }
}

           
     