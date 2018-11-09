import java.util.Arrays;
public class QuickSort {
    double A[];
     
 int partition(int start, int end)
 {
     double pivot = A[end]; 
     int pIndex = start; 
     
     for (int i=start; i<=end-1; i++)
     {
         if (A[i] <= pivot)
         {
             
             swap(pIndex,i); 
             pIndex=pIndex+1;
         }
         System.out.println("langkah ke-"+i+", Pivot = "+pivot+" SWAP("+i+","+pivot+")"+" -> "+Arrays.toString(A));
         System.out.println(Arrays.toString(A) );
     }
         
     
     swap(pIndex,end);
     return pIndex;
 }
 void sort(double arr[], int start, int end)
 {
    this.A=arr;
     if (start < end)
     {
         int p = partition(start, end);
         sort(A, start, p-1);
         sort(A, p+1, end);
     }
 }
 private void swap(int i, int j) {
     double temp = A[i];
     A[i] = A[j];
     A[j] = temp;
 }
 
 public static void main(String args[])
 {
     double arr[] = {1.4, 3.5, 9.9, 8.4, 2.3};
     int n = arr.length;
     System.out.print("Unsorted array: ");
     System.out.println(Arrays.toString(arr));
     QuickSort ob = new QuickSort();
     ob.sort(arr, 0, n-1);
     System.out.print("Sorted array: ");
     System.out.println(Arrays.toString(arr)); 
 }
}
