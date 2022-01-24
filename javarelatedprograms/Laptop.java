import java.util.*;
class laptop{
    public static void main(String args[]){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>0){
           int temp = n/10;
           sum = sum+temp;
           n = n % 10; 
          }
          System.out.println(sum);
    }
}