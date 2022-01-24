import java.util.*;
class Palindrome2{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);    //takes input from keyboard
        String name = scan.nextLine();
        int i = 0 , j = name.length()-1;                  //initialising i at 0th index and j at lastposition of the string
        scan.close();
           while(i<j){
              if(name.charAt(i)!=name.charAt(j)){                     //the method charAt()compares the character at ith and jth positions if the match is not found then 
                        System.out.println("not a palindrome");             // not a palindrome is printed
                         System.exit(0);                                             
              //exists from the System
                   }                                                                           
                 i++;
                 j--;
            }
         System.out.println("is a palindrome");
       }
  }
       /*    abcdcba ----> Sample Input 
          is a palindrome --->sample output

          hii ----->Sample Input 
        not a palindrome ---->Sample Output  */ 
















