import java.util.*;
class Day501{
public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int s = sc.nextInt();
         for(int i = 1;i<=s;i++)
          {
             for(int j =1;j<=i;j++)
             {
                System.out.print(j);
             }
           System.out.println();
        }
     }
}            
        /*  5
1
12
123
1234
12345 */