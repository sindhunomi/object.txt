 import java.util.*; 
 import java.lang.*;
 public class Alphabet
   {
       public static void main(String args[])
          {
              Scanner sc =new Scanner (System.in);     
               String A = sc.next();
               String B= sc.next();
               int a = A.length();
               int b = B.length();
               int c = a+b;
               if(A.equals(B))
                  {
                    System.out.println("yes");
                  }
                 else
                  {
                     System.out.println("No");
                   }
            System.out.println("length of  Strings is : " + c ) ;
             System.out.println("Hello\t Java" );
        }
  }
//Sample input:
//hello 
//java
                              //Sample output:
                               //9
                              //NO
                              //Hello Java














