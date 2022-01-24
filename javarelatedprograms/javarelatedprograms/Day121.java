import java.util.*;
class Day121{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         String s=sc.nextLine();
         sc.close();
        String [] sp = s.split("[@!,.'_,? ]");
        System.out.println(sp.length);
        System.out.println("the tokens are : ");
          for(int i =0;i<sp.length-1;i++){
             System.out.println(sp[i]);
           }
         }
       }
             /*      He is a very very good boy,isn't he? -->Sample input
	10
	the tokens are :
	He
	is
	a
	very
	very
	good
	boy
	isn
	t
	he ---->sample output */

