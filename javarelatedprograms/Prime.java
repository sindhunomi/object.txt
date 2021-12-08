import java.util.*;
 class Prime
    {
     static int count;
        public static void main(String args[])
            {
              Scanner sc =new Scanner(System.in);
                       int n  = sc.nextInt();
                  for(int i=2;i<n;i++)
                      {
                         if(n%i==0)
                          {
                               count++;
                           }                                                                                  //29
                     }                                                                                                   // is a prime number
                 if(count==0)
                 System.out.println("is a prime number");                          //33 is not a prime number
              else
                System.out.println("is not a prime number");
              }
      }