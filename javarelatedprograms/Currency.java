import java.util.*;
import java.text.*;
 public class Currency
   {
     public static void main(String args[])
       {
          Scanner sc =new Scanner (System.in);
             Double payment = sc.nextDouble();
                sc.close();
                String india=NumberFormat.getCurrencyInstance(new Locale("en")).format(payment);             
                String china =NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
                 String us =NumberFormat.getCurrencyInstance(Locale.US).format(payment);
                 String france =NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
                 System.out.println("us: " + us);
                 System.out.println("India :" +  india );
                 System.out.println("China :" + china);
                System.out.println("France :" + france);
          }
      } 
                    // sample input:
                      //  55.55  
                             // 55 //sample output
                             // us: $55.00
                             // India :?55.00
                              //China :¥55.00
                              //France :55,00 ?
