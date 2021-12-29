class Person{
    String name ;
    int age;
   public void setname(String name){
         this.name =name;
      }
     public void setage(int age){
          this.age = age;
           }
      public String getname(){
            return name;
         }
      public int getage(){
          return age;
        }
     public static void main(String args[]){
      Person p1 = new Person();
      p1.name ="Raju";
      p1.age = 21;
      System.out.println("person name is : " + p1.getname());
     System.out.println("person age is : " +  p1.getage());
      }
 }       
