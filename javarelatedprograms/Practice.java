import java.util.*;
 class Practice{
     public static void main(String args[]){
          Vector <Integer> v = new Vector <Integer> ();
              v.add(34);
              v.add(45);
              v.add(55);
              v.add(34);
               v.add(43); 
               v.addElement(99);
               v.remove(3);
              Collections.sort(v) ;
              Collections.sort(v,Collections.reverseOrder()) ;
                System.out.println("Size is the vector collections:"+v.size());
                Enumeration<Integer> e = v.elements ();
                while(e.hasMoreElements()){ 
                 int temp2 = e.nextElement();
                  System.out.println(temp2); 
                 }
              }
          }
     