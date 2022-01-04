import java.util.*;
  class Practice3{
     public static void main(String args[]){
        ArrayList<String>ar= new ArrayList<String>();
          ar.add("Sindhu");
         ar.add("Teja");
          ar.add("Vandy");
       ArrayList<String>ar2 = new ArrayList<String>();
         ar2.add("Sindhu");
         ar2.add("Teja");
         ar2.add("Vandy");
       System.out.println(ar.equals(ar2)); // Compares two collections
       System.out.println(ar.contains("Teja")); //Searches particular element'
        System.out.println(ar.containsAll(ar2)); 
       System.out.println(ar.clone());
    }
}
  /* Sample output :
	true
	true
	true
	[Sindhu, Teja, Vandy]  */
    