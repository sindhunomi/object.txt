class Sorting{
           public static void printArray(int arr[]){
             for(int i = 0 ; i < arr.length ; i++){
                    System.out.print(arr[i]+" ");    // Printing the array
                }
          System.out.println();        
   }
          public static void main(String args[]){
               int arr[] = {1,8,9,47,88,0,66,77,754};
                for(int i = 0 ; i <arr.length-1 ; i++){
                for(int j = 0 ; j <arr.length-i-1 ; j++){
                      if(arr[j]>arr[j+1]){                                 //comparing the element at ith position and jth position  if  the element is greater then swapping happens
                         int temp = arr[j];    
                         arr[j] = arr[j+1];
                         arr[j+1] = temp;
                     }
                }
            }
         printArray(arr);
    }
} 
            //  0 1 8 9 47 66 77 88 754       ---> Smaple output
