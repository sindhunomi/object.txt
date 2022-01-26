import java.util.*;
class Day148{
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
         String t = " ";
        System.out.println("Enter a string to reverse :");
        String s = scan.nextLine();
        scan.close();
          System.out.println("The String entered is : ");     
          for(int i=s.length()-1; i>=0 ; i --){ 
           t = t+s.charAt(i);                                       //adding the characters  at that particular index to t  
           }  
       System.out.println("Reverse is  "  + t);
      }
  }
        /*   Enter a string to reverse :
           hari
          The String entered is :         -----> Sample input & output 
          Reverse is   irah         */
