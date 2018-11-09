import java.util.Arrays;
public class InsertionSort {
 
	
    public static void main(String a[])
    {    
        double[] x = {6.4, 2.5, 1.2, 2.2, 1.1} ;  
        
        System.out.println("Before Insertion Sort");  
        
        printArray(x);
            
        InsertionSort(x);    
           
        System.out.println("After Insertion Sort");  
        
        printArray(x);   
    }    
    public static void InsertionSort(double arr[]) 
	{  
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = (int) arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
        }  
    }
           static void printArray(double[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
}