import java.util.*;
class Practice9{
    public static void main(String args[]){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
          scan.close();
          while(n>0){
           int temp = n%10;
           sum = sum+temp;
           n = n/10; 
          }
          System.out.println(sum);
    }
}