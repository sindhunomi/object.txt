import java.util.*;
class Practice0{
    public static void main(String args[]){
    ArrayList<Integer> ar  = new ArrayList<Integer>();  
  System.out.println("Before giving elements Size is :"+ ar.size());
   	 ar.add(27);
   	 ar.add(66);
  	  ar.add(75);
	  ar.add(34);
   	 ar.add(55);
                    ar.add(0,77); 
                    ar.remove(1); 
      Collections.sort(ar);
      Collections.sort(ar,Collections.reverseOrder());
      System.out.println("After giving elements Size is :" + ar.size());
      Iterator itr  = ar.iterator();
       while(itr.hasNext()){
       int temp = (Integer)itr.next();
       System.out.println(temp);
          }
     }
}
    