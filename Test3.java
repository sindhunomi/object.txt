   class Example3
    { 
       public void run()
          {
          System.out.println("my way of running");
          }
     }
     public class Test3 extends Example3
        {
          public void run()
                 {
                 super.run();  
                 System.out.println("hari's way of running"); 
                   }
                   public static void main(String args[])         
                   {    
                     Test3 t3 = new Test3();    
                      {
                           t3.run();
                      }
                  }
             }
            