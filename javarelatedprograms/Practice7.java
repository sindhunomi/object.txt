import java.util.*;
class Bike implements Comparable<Bike>{
   String  model;
   int regno;
   double mileage;
    public Bike(String model,int regno, double mileage){
       this.model = model;
       this.regno  = regno;
       this.mileage = mileage;
      }
         public int compareTo(Bike b){
            if(regno==b.regno)
                   return 0; 
             else if(regno>b.regno)
                  return 1;
             else
                 return -1;    
           }
    }   
   class Practice7{
           public static void main(String args[]){
                 ArrayList ar = new ArrayList();
                    Bike b1 = new Bike(" Pulsar ",  123 , 44.99);
                    Bike b2 = new Bike(" RoyalEnfield ",  33 , 77.9);
                    Bike b3 = new Bike(" Scooty ",  44 , 66.99);
                    Bike b4 = new Bike(" TVS ",  66  , 88.0);
                    Bike b5 = new Bike(" Shyam Singha Roy ", 99 , 546.99);
                       ar.add(b1);
                       ar.add(b2);
                       ar.add(b3);
                       ar.add(b4);
                       ar.add(b5);  
                   Collections.sort(ar);  
               Iterator <Bike>itr = ar.iterator();
                        while(itr.hasNext()){
                          Bike temp = itr.next();
                      System.out.println(temp.model + " " + temp.regno + " " + temp.mileage );
                   }
               }
          }
                 / *   Sample output :
                           RoyalEnfield  33 77.9
                           Scooty  44 66.99
	        TVS  66 88.0
	        Shyam Singha Roy  99 546.99
	        Pulsar  123 44.99    */
                         
  
                  




















   