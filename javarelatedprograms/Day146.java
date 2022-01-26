import java.util.*;
class Day146{
  public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the words to concatinate ");              
   String str1 = scan.nextLine();                                                //Taking input from keyboard for Strings
   String str2 =  scan.nextLine();
   System.out.println("enterd words are " + str1 + " " + str2);
   String str3 = str1+str2;                                                                   //concatenating the strings using '+' operator
   System.out.println("The concatenated word is : " + str3);
      }
}
       
 /*   Enter the words to concatinate
     Hello
    World
   enterd words are Hello World
    The concatenated word is : HelloWorld    */

  
    