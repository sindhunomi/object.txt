import java.util.*;
class Prime2{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();   
    int b =sc.nextInt();     
     int count=0; 
     System.out.println("the prime numbers that lie between a and b are : ");
         sc.close();
        for(int i=2;i<b;i++){
        if(b%i==0)
            count++;
       }
    if(count == 0)
         System.out.println("it is a prime number");
     else
           System.out.println("it is not a prime number");
    }
}
           