import java.util.*;
class Factorial{
     public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
          int fact = 1;
         int n = scan.nextInt();
         scan.close();
           System.out.println("THE ENTERED NUMBER IS : " + n);
            if(n<10){
            for(int i = 1 ; i <=n ;i ++ ) {
                fact = fact*i;
           }
        }
         System.out.println("THE FACTORIAL OF THE ENTERED NUMBER IS : " + fact);
    }
  }
                     
    /* Sample input :
            6
                            Sample output:
                            THE ENTERED NUMBER IS : 6
                            THE FACTORIAL OF THE ENTERED NUMBER IS : 720  
            11
                          THE ENTERED NUMBER IS : 11
                          THE FACTORIAL OF THE ENTERED NUMBER IS : 1      */

       








