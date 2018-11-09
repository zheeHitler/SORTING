 
public class BinarySearch {
 
    public static int BinarySearch(int[] sortedArray, int start, int end, int key) {
 
        if (start < end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return BinarySearch(sortedArray, start, mid, key);
 
            } else if (key > sortedArray[mid]) {
                return BinarySearch(sortedArray, mid+1, end , key);
 
            } else {
                return mid;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
 
        int[] arr1 = {2,45,100,190,280,500,670,700,999};
        int index = BinarySearch(arr1,0,arr1.length,45);
        if(index != -1){
            System.out.println("Found 45 at "+index+" index");
        }
        else{
            System.out.println("Element not found");
        }
 
        index = BinarySearch(arr1,0,arr1.length,99);
        if(index != -1){
             System.out.println("Found 999 at "+index+" index");
        }else{
            System.out.println("Element not found");
        }
    }
}

