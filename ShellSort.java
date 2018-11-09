import java.util.Arrays;
 
public class ShellSort {
    void sort(double A[])
    {
        int n = A.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i+=1) { 
                double temp = A[i]; 
                int j; 
                for (j = i; j >= gap && A[j - gap] > temp; j -= gap)
                    A[j] = A[j - gap];
                A[j] = temp;
                 System.out.println("langkah ke-"+i+", Gap = "+gap+" SWAP("+i+","+gap+")"+" -> "+Arrays.toString(A));
                 System.out.println(Arrays.toString(A) );
                
            }
        }
    }
  

    public static void main(String [] args)
    {
        double [] arr = {9.8,2.5,9.5,6.9};
        System.out.print("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
  
        ShellSort ob = new ShellSort();
        ob.sort(arr);
  
        System.out.print("Sorted array: ");
          System.out.println(Arrays.toString(arr)); 
    }

   
}
