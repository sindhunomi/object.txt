import java.util.*; 
class Day111{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
        sc.close();
        try{
             int result = a/b;
            System.out.println(result);  
            }
        catch(ArithmeticException e){
             System.out.println("Arithmetic Exception ");
           }
        }
     }
      /*  25  0 --->sample input 
       Arithmetic Exception   ----->sample output*/
          

 
 