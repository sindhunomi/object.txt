import java.io.*;
import java.util.*;
class Day122{
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
      int  hour =sc.nextInt();
       int  min = sc.nextInt();
       int  sec = sc.nextInt();
       System.out.println(hour +":" + min + ":" + sec );
         if(hour == 12)
              System.out.println(hour-12+":"+ min + ":" + sec);
          else
           System.out.println(hour+12 +":"+min+":" +sec);
         }
     }
/*input	7
	05
	45
	7:5:45
output	19:5:45    */       