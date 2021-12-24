import java.util.*;
class Tpoint3
{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String str =  sc.nextLine();
       if(str.isEmpty())
        System.out.println(str);
        String target = "null";
        String ptr = str.replace(target ,"was");
        System.out.println(ptr);
   }
}