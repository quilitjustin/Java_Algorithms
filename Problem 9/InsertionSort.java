import java.util.*;

class InsertionSort {
    public static void main(String [] args){
        int arr[] = {4, 3, 5, 2, 1};
        // Perform the insertion sort
        for(int i = 1; i < arr.length; i++){
            int target = i - 1;
            int placeholder = i;
            int temp = 0;
            while(arr[placeholder] < arr[target]){
                temp = arr[target];
                arr[target] = arr[placeholder];
                arr[placeholder] = temp;
                if(!(target <= 0)){
                    target -= 1;
                    placeholder -= 1;
                }
            }
        }
        System.out.print("Your sorted array: ");
        // Same as foreach in php
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}   
