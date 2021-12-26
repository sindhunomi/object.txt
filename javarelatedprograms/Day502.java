import java.util.*;
class Day502
 {
      public static void main (String args[]){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
                for(int i =1;i<=n;){
               for(int j=i;j<=n;j++){
                   System.out.print( j + " ");
               }
               n--;
              System.out.println();
         }
    }
 } 
         /* 5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 */
