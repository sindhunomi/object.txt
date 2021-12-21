import java.util.*;
class Rexester{
  public static void  bubblesort(int arr[])
  { 
     int n =arr.length;
     for(int i=0;i<n-1;i++)
         for(int j=0;j<n-i-1;j++)
            if(arr[j]>arr[j+1])
               {
                  int temp = arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
   }     
   public static void printarray(int arr[])
      {
           int n =arr.length;
           for(int i=0;i<n;++i)
             { 
             System.out.print(arr[i]+"");
         System.out.println();
            }
     }
        public static void main(String args[])
          {
               int arr[]={18,34,99,65,0,8,76,98,5,665};                                 
                 bubblesort(arr); 
               System.out.print("sorted array:" );
               printarray(arr);
           }
 }





         /*sorted array:
          0
           5 
            8
           18
           34
           65
           76
           98
            99
           665*/

            

 






    