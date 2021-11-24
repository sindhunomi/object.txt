class LibraryAccount
 {
      int bookno;
      String accountholder_name;
      double amount; 
      int book_renewal;
     double payamount;
     public double payamount()
     {
      return this.payamount;
     }
     public int book_renewal ()
    {
       return  this.book_renewal;
    }
        public LibraryAccount( int bookno, String accountholder_name, double amount )
        {
             this.bookno = bookno;
             this.accountholder_name= accountholder_name;
             this.amount= amount;
        }
}
 public class EX3
 {
      public static void main (String args[])
      { 
         LibraryAccount la = new LibraryAccount( 72,"sindhu",500.0 );
         System.out.println(la.bookno); 
         System.out.println(la.accountholder_name);
         System.out.println(la.amount);
         la.payaymount();
    }
}

















