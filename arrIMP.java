import java.util.*;
// Q.1 Traverse an array.

public class arrIMP {
    public static void main(String[] args) {

        // int arr[] = {1, 2, 3, 4};

        //  for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        //  }
        //  System.out.println();

        //Q2.Reverse an array

        // int arr1[] = {1,2,3,4};
        // int start = 0 ,end = arr.length - 1;
        // while (start < end) {
        //     int temp = arr1[start];
        //     arr1[start] = arr1[end];
        //     arr1[end] = temp;

        //     start++;
        //     end--;
        // }
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + " ");
        // }

        //Q.Find Maximun & Minimum

        
        int arr[] = {1, 2, 3, 4, 9};
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Max: " + max + " Min: " + min);

    }
}