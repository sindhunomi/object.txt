import java.util.*;
class Patternd51
  {
      public static void main (String args[])
           {
              Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                 for(int i =1;i<=n;)
                 {
                      for(int j=1;j<=n;j++)                     
                         {
                          System.out.print(j);
                         }
                        n--;
                        System.out.println();
                    }
            }
}
         /*       5
12345
1234
123
12
1*/