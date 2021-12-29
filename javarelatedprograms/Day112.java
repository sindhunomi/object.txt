import java.lang.*;
class Day112{
  public static void main(String args[]){
       String ch = "javapoint";
         try{
             System.out.println(ch); 
             char g=ch.charAt(-2); 
            System.out.println(g);
            }
         catch(Exception e){
            System.out.println("String index out of bounds ");
          }
      }
}