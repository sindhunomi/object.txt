 class Distinct {
        public static void main(String args[]){
            int arr[] = {1,3,3,56,78,99};    
              for(int i = 0; i<arr.length-1; i++){
                       if(arr[i]!=arr[i+1])
                          System.out.println(arr[i]);
                      }
            System.out.println(arr[arr.length-1]);  
               }
        }
          
/*      1
      3
     56      -----> Sample output
     78
      99        */
