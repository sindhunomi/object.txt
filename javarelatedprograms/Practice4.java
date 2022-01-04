import java.util.*;
 class Test{
    String name;
    int rollno;
   public Test(String name , int rollno){
       this.name = name;
       this.rollno = rollno;
      }
   }
    class Practice4{
       public static void main(String args[]){
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the name to search : ");
           String userInput = scan.nextLine();
           scan.close();
           Test t1 = new Test("Sindhu",05);
            Test t2 = new Test("Vandhu",06);
            Test t3 = new Test("Prani",07);
            ArrayList<Test> ar = new ArrayList<Test>();
                   ar.add(t1);
                   ar.add(t2);
                   ar.add(t3);
            Iterator<Test>itr = ar.iterator();
                boolean matchfound = false;
                 while(itr.hasNext()){
                 Test temp = itr.next();
                  if(temp.name.equals(userInput)){
                         matchfound = true;
                      System.out.println(" Name is " + temp.name + " and the Rollno is " + temp.rollno);
                  }
               }
                    if(matchfound == false)
                        System.out.println("Match not found!!!");
                }
           }
                   /* Sample input:   -----> VALID INPUT
                          Enter the name to search :
                                   Prani
                                name is Prani and the rollno is 7 
                   sample output : ----->INVALID INPUT
                       Enter the name to search :
	          preethi
	         Match not found!!!       */






    
          
         