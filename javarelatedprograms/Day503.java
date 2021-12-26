import java.util.*;
class Day503 {
   public static void main(String args []){
       Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         int alphabet = 65;   
         sc.close();
           for(int i =1;i<=n;i++){
             for(int j=1;j<=i;j++){
                  System.out.print((char)alphabet + " ");
                   }
                   alphabet ++;
                   System.out.println();
            }
          }
       }
                    /* 5
A
B B
C C C
D D D D
E E E E E     */
 