import java.util.Scanner;
public class Pgr3{  
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an  integer value" );
        int num1= sc.nextInt();
        System.out.println("enter a double value" ); 
         Double num2=sc.nextDouble();
         System.out.println("enter a string" );
         String c = sc.next();
      System.out.println(" integer : " + num1) ;
      System.out.println(" double : " + num2);
      System.out.println(" String : "  + c);
      sc.close();
       }
   }

