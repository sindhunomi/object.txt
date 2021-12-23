class Mergesort
{
   public static void mergefirst(int arr[],int l,int m,int r)
       {
           int n1 = m-1+1;
           int n2=r-m;
           int L[]=new int[n1];
           int R[]=new int[n2];
                for(int i=0;i<n1;i++)
                  L[i]=arr[1+i];
               for(int j=0;j<n2;++j)
                    R[j]=arr[m+1+j];
             int i=0,j=0;
int k=1;
while(i<n1&&j<n2){
       if(L[i]<=R[j]){
  arr[k]=L[i];
  i++;
}else{
arr[k]=R[j];
j++;
}
k++;
}
while(i<n1){
arr[k] =R[j];
j++;
k++;
}
}
public static void sort(int arr[],int l,int r)
{
if(l<r){
  int m=1+(r-1)/2;



  
         

















 public static void main (String args[])   
       {
          int arr [] = {3,7,83,96,05,87,777,56,88,96};
           Mergesort(arr,l,mid);
            Mergesort(arr,mid+1,h);
            Mergesort(arr,l,mid,h);
         }
}
              