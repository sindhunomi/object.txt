      import java.util.Scanner;
         class Condition{
          public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
              int  n=sc.nextInt();
                sc.close();
                if (n%2==0 && n>=2  && n<=5)
                  {
                  System.out.println("it is not weired ");
                   }
                 else if(n%2==0 && n>=6 && n<=20)
                     {
                         System.out.println("it is weired ");
                     }
                else if(n%2==0 && n >20 )
                    {
                   System.out.println("it is not not weired");
                    }
                 else
                 {
                  System.out.println("print weired");
                  }
            }
       }

