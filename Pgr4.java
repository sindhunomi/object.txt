import java.util.Scanner;
class Pgr4
   {
         public static void main(String args[])
            {
                int i;
              Scanner sc =new Scanner(System.in);
             System.out.println(" enter 3 names");
             for(i=0;i<3;i++)
                    {
                        String s=sc.next();
                        String x = sc.next(); 
                         if((x.length())>=3)
                                  {         
                                    System.out.println(s+"\t \t"+x);
                                  }
                                  else if((x.length())==2) 
                                       {
                                             System.out.println( s +"\t  \t"+"0" + x);
                                        }
                                    else
                                      {
                                       System.out.println(s +"\t \t" +"00" + x);
                                       }
                           }
                 }     
   }    
