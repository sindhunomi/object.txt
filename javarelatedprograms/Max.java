class Max{
   public static void main(String args[]){
        int arr[] = {39,5,66,87,23,59,100};
        int max = arr[0];
        int min = arr[0];
         for(int i = 0 ; i < arr.length ; i++){
             if(arr[i]>max)
                  max = arr[i];
             else if(arr[i]<min)
                 min = arr[i];
          }
       System.out.println("MAX VALUE IS : " + max);
       System.out.println("MIN VALUE IS : " + min);
     }
 } 
                
   