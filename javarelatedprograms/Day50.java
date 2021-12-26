import java.util.*;
class Day50
 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alphabet =64;
        for(int i=1;i<=n;i++)
             {
               for(int j =1;j<=i;j++)
                 {
                 System.out.print((char)(alphabet +j) + " ");
                   }
                  System.out.println();
                }
           }
     }
         


