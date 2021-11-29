   class Example2
   {
       int name;
       public void accelerate()
            {
             System.out.println("accelerating.....!");
            }
      }  
             public class Test2 extends Example2
              {
             public static void main(String args[])
               {  
                    Test2 t = new Test2();
                    {
                     t.accelerate();
                    } 
               }
          }
      