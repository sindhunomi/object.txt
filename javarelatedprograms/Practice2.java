import java.util.*;
  class Practice2{
       public static void main(String args[]){
           ArrayList <String> ar = new ArrayList <String>();
           ar.add("Sreenivasulu");
           ar.add("Manjula");
           ar.add("SindhuSri");
           ar.add("HariPriya");
           ar.remove(new String("SindhuSri"));      
           System.out.println("Iterator way approach");
             Iterator <String> itr = ar.iterator();
                  while(itr.hasNext()){
                   String temp = itr.next();
               System.out.println(temp);
              }
             System.out.println("ListIterator way of approach");
              ar.add(2,"SindhuSri");
              ListIterator<String>itv = ar.listIterator();
               while(itv.hasNext()){
                String temp2=itv.next();
                System.out.println(temp2); 
              }
         }
     }