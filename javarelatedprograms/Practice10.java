import java.util.*;
  class Teacher{
         String name;
         int id;
         String subject;
    public Teacher(String name,int id,String subject){
          this.name = name;
          this.id = id;
           this.subject = subject;
         }
     }
   class SortByName implements Comparator<Teacher>{
        public int compare(Teacher t1 , Teacher t2){
               return t1.name.compareTo(t2.name);
           }
   }
  class SortById implements Comparator<Teacher>{
        public int compare(Teacher t1 , Teacher t2){
               return t1.name.compareTo(t2.name);
           }
   }
public class Practice10{
       public static void main(String args[]){
             Teacher t1 = new Teacher("Radhika",505,"Maths");
              Teacher t2 = new Teacher("Sujatha",607,"Science");
               Teacher t3 = new Teacher("Devi", 809,"Botany");
                   ArrayList <Teacher>ar = new ArrayList();
                    ar.add(t1);
                    ar.add(t2);
                    ar.add(t3);
              SortByName sbn = new SortByName();
              SortById  sbi = new SortById();  
             Collections.sort(ar,sbi);
             Iterator<Teacher>itr = ar.iterator();
               while(itr.hasNext()){
                     Teacher temp = itr.next();
                  System.out.println(temp.name  + "   "+ temp.id + "  " + temp.subject);
                }
           }
   }
                

            
  
          
  













       