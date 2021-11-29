 public class Example
    { 
      public int add(int x,int y)
          {    
            return (x+y);
          }
          public int add(int x,int y,int z)
          {
            return (x+y+z);
          }
         public double add(double x, double y)
         {
         return (x+y);
        }
        public static void main(String args[])          
             {
                   Example ex =new Example();
                    {    
                     System.out.println(ex.add(2.3,4.5));
                     System.out.println(ex.add(3,3,4));
                   }
             }
     }