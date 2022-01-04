import java.util.*;
  class Practice3{
     public static void main(String args[]){
        ArrayList<String>ar= new ArrayList<String>();
          ar.add("Sindhu");
         ar.add("Teja");
          ar.add("Vandy");
          ar.add("Priya");
        Vector<String>v = new Vector<String>();
         v.add("Sindhu");
         v.add("Teja");
         v.add("Vandy");
         v.addElement("Arjun");
       System.out.println(ar.equals(v)); // Compares two collections
       System.out.println(ar.contains("Teja")); //Searches particular element'
        System.out.println(ar.containsAll(v)); 
       System.out.println(ar.clone());
        Iterator<String>itr = v.iterator();      
          while(itr.hasNext()){
            String temp = itr.next();
              System.out.println(temp);
                }
           ListIterator<String>itv = ar.listIterator(4);
               while(itv.hasPrevious()){
                 String names = itv.previous();
                 System.out.println(names);
               }
             }
        }
  /* Sample output :
     false
     true
      false
      [Sindhu, Teja, Vandy, Priya]
      Sindhu
       Teja
       Vandy
        Arjun
        Priya
        Vandy
        Teja
        Sindhu  */
    