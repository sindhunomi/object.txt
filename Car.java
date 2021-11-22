class Car{
//states
String model;
String fuelType;
String colour;
 public Car(String model,String fuelType,String colour)
 {
   this.model=model;
   this.fuelType=fuelType;
   this.colour=colour;
 } 
 public class EX1
{
public static void main (String args[])
 {
 Car c = new Car("swift","petrol","white");
  System.out.println(c.model);
  System.out.println(c.fuelType);
  System.out.println(c.colour);
  }
}
}

