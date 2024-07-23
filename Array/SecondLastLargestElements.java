package Array;
import java.util.Arrays;
public class SecondLastLargestElements {
    public static int findSecondLargest(int[] arr){
        Arrays.sort(arr);

        // for same array using this code 
        for(int i = arr.length-1; i > 0; i--){
            if(arr[i]!= arr[i-1]){
                return arr[i-1];
            }
        }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int[] arr = {34, 2, 30, 4, 50};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second last largest element is: " + secondLargest);
    }
}
