import java.util.*;
class Day102{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
     for(int i =0;i<=str.length();i++){
         if(i%2!=0){
             System.out.println("The character " + i + " at odd position : " + str.charAt(i));
            }
          }
        }
      }        
         /*  sindhu sreenivas  ---->sample input 
	The character 1 at odd position : i
	The character 3 at odd position : d
	The character 5 at odd position : u
	The character 7 at odd position : s
	The character 9 at odd position : e
	The character 11 at odd position : n
	The character 13 at odd position : v
sample output<----The character 15 at odd position : s  */
