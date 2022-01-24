import java.util.*;
   class Leap{
        public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         int year = scan.nextInt();
          scan.close();
          if (year % 400 == 0)
              System.out.println(" its a leap year "); 
          else if(year % 100 == 0)
              System.out.println("its not a leap year");
          else if(year % 4 == 0)
             System.out.println("its a leap year");          
            }
     }
            