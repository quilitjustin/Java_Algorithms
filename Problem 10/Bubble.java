import java.util.*;

class Bubble {
    public static void main(String [] args){
        final int arr[] = {5, 3, 2, 1, 4};
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
