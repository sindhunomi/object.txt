class Day115{
   public static void main(String args[]){
         int a[] ={1,34,88,94,66};
         System.out.println(a.length);
         try{
         int w = a[6];
         System.out.println(w);
         }
        catch(Exception e)
         {
             System.out.println(e);
         }
         finally{
           System.out.println("Finally Block is executed");
           }
       }
   }