class Tpoint1
  {
     public static void main (String args[])
      {
          String st = ds.intern();
          String nw = new String("javapoint");
          String se = nw.intern();
        System.out.println(ds==st);
          System.out.println(ds==nw);
         System.out.println(ds==se);
          System.out.println(st==se);
          System.out.println(sc);    
     }
 } 
/*  true
  false
  true
*/  true
