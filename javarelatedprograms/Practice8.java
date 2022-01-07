import java.util.*;
class Practice8{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int count =0;
       int n = scan.nextInt();
        scan.close();   
         while(n>0){
           n =n/10;
          count = count+1;
         } 
       System.out.println(count);
      }
  }
