import java.io.*;
import java.util.*;
class Pgr4
   {
         public static void main(String args[])
            {
                int i;
              Scanner sc =new Scanner(System.in);            //takes input from keyboard 
             System.out.println(" enter 3 names");
                   for(i=0;i<3;i++)
                        {
                         String s=sc.next();
                         int x =sc.nextInt();
	         System.out.printf("%-15s%03d\n",s,x);   //takes three names and three digit no.
                                                                                                   // and prints letters upto 15th character and digits from 16th character
                        }
               sc.close();

            }                                 
}
           //  Sample input:
         //  enter 3 names
          // xxx 999 yyy 00 ccc 9 

       // Sample output:
         // xxx            999
       // yyy            000
        // ccc            009 



