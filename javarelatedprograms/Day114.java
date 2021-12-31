import java.util.*;
class Day114{
      public static void main(String args[])throws ArithmeticException{
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         sc.close();
          try{
          int result =a/b;
           System.out.println(result);
           throw new ArithmeticException("TRYING TO DIVIDE BY ZERO"); 
              }
          catch(Exception e){
           System.out.println(e);
                }
             }
       }