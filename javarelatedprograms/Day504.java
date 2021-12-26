import java.util.*;
class Day504{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
       for(int i =1 ;i<n+1;i++)
          {
            for(int j= i;j<n+1;j++)
              {
                 System.out.print(j+ " ");
               }
                 for(int k =1 ;k<i;k++)
                   {
                      System.out.print(k+ " ");
                 }
                    System.out.println();
             }
         }
  }