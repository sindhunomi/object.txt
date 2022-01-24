import java.util.*;
class Armstrong{
    public static void main(String args[]){
          int armstrong = 0; 
         Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();
           int original = n ;
           scan.close();
           while(n>0){
           int temp = n%10;
           temp = (int)Math.pow(temp,3); 
             armstrong  = armstrong + temp;
              n = n/10;
            }
           if(armstrong == original)
                   System.out.println("THE NUMBER " + original + " is AN ARMSTRONG " );
          else
                System.out.println("THE NUMBER " + original + " IS NOT AN ARMSTRONG");
       }
 }
           
      
           
 
          
 