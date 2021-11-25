import java.util.Scanner;
class Pgr5{
       public static void main(String args[]){    
           int i;
           System.out.println("enter a number");
           Scanner sc =new Scanner(System.in);
            int N = sc.nextInt();
       for(i=0;i<11;i++){
        int c=N*i;
       System.out.println(N +" * " + i + "="  + c);
      }
   }
}