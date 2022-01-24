import java.util.*;
class Student implements Comparable <Student>{
  String  name;
   int id;
   String dept;
     public Student(String name,int id,String dept){
                 this.name = name;
                this.id = id;
                this.dept =dept;
   }
      public  int compareTo(Student s){
         return name.compareTo(s.name);
       }
  } 
    class Practice6{
         public static void main(String args[]){
             ArrayList ar = new ArrayList();
             Student s1 = new Student("A", 555, "CSE");
             Student s2 = new Student("E", 666, "ECE");
             Student s3 = new Student("B", 888, "EEE");
             Student s4 = new Student("D", 999, "IT"); 
             Student s5= new Student("C", 899, "CIVIL");
              ar.add(s1);
              ar.add(s2);
              ar.add(s3);
              ar.add(s4);
              ar.add(s5);
            Collections.sort(ar);
       Iterator<Student>itr = ar.iterator();
          System.out.println("this has been sorted based on the names given by us :");
         while(itr.hasNext()){
            Student temp =itr.next();       
             System.out.println( temp.name+"   " + temp.id+"    "+temp. dept);
           }
        }
  }              

          /* Sample output:
                 this has been sorted based on the names given by us :
	A   555    CSE
	B   888    EEE
	C   899    CIVIL
	D   999    IT
	E   666    ECE    */














 
 
   