import java.util.*;
import java.io.*;
   class Pgr1
      {
        public static void main(String args[])
          {
           Scanner sc = new Scanner(System.in);
            int t =sc.nextInt();
              for (int i=0;i<t;i++)
                 {
                   try
                     {
                     long x =sc.nextLong();
                     System.out.println( x + "can be fitted in :");
                      if (x>=-128 && x<=127)
                          System.out.println("byte");
                        if(x>=-32768 && x<=32767) 
                          System.out.println("short");
                        if(x>=-2147483648 && x<=2147483647)
                           System.out.println("int");
                        System.out.println("long");
                         }
                            catch(Exception e)
                           {
                                  System.out.println("can't be fitted anywhere");
                             }
                         }                                                                                                              // Sample input:5
//-150 150000 1500000000 21333333333333333333333333333 -100000000000000

//Sample output
//-150can be fitted in :
//short
//int
//long
//150000can be fitted in :
//int
//long
//1500000000can be fitted in :
//int
//long
//can't be fitted anywhere
//can't be fitted anywhere
                     }
               }       
                
          
                     
          
