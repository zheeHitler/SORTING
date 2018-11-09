import java.util.Arrays;

public class BubbleSort
{
   public static void main( String[] args )
   {
      double[] x = {6.4, 2.5, 1.2, 2.2, 1.1} ;

      System.out.println("Before sort: " + Arrays.toString(x) );

    

      System.out.println("\nAfter  sort: " + Arrays.toString(x) );
   }
}


class BubbleSort1
{
   public static void sort(double[] a)
   {
      double help;
      int i, k;
      boolean done;

      System.out.println("----------- Sorting steps:");
 
      done = false;
      k = a.length;

      while ( ! done )
      {
         System.out.print("Langkah " + (a.length-k) + ": ");
         System.out.println(Arrays.toString(a) );

         done = true;           
         for ( i = 0 ; i < k-1 ; i ++ )
         {

            if ( a[i] > a[i+1] )
            {
               
               help = a[i];
               a[i] = a[i+1];
               a[i+1] = help;

               done = false;   
            }
         }

         k--;
      }

      System.out.print("Hasil: ");
      System.out.println(Arrays.toString(a) );
   }
}