import java.util.*;
 class Reverse{ 
  public static void main(String args[]){
         int reverse = 0;
         int lastdigit;
         Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();
          scan.close();
         while(n>0){
             lastdigit = n%10;
             reverse = reverse*10+lastdigit;
             n = n/10;
           }
         System.out.println(reverse);
       }
    }
       /*Sample input 
                  456
         Sample output
                   654                       */
 