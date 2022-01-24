import java.util.*;
class Prime{
     public static void isPrime(int n){
                 int factors = 2;
                for(int i = 2 ; i < n/2 ; i++){
                      if(n%i==0){
                         factors ++;
                         break;
                          }
                 }  
                      System.out.println(factors);
             if(factors==2){
                    System.out.println("is a prime number");
              }else {
                  System.out.println("not a prime number");
                 }
          }    
 }      
   
        public class Myclass{
        public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
         Prime.isPrime(n);
   }     
}




