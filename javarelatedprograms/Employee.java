import java.util.*;
class Employee{
    public static void main(String args[]){
      LinkedHashMap <int,Employee> hm = new LinkedHashMap<int,Employee>();
       hm.put(505,"SINDHU",50000);
       hm.put(506,"Hari",78900);
       hm.put(467,"Seenu",88888);
       hm.put(565,"Manjula",866890);
     Iterator <int> itr = hm.KeySet().iterator();   
         while(itr.hasNext()){
             int <int> temp = itr.next();
             System.out.println("key is : " + temp.getKey());
             System.out.println("Value is : " + temp.getValue());

         }
     
     
      }
}