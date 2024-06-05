package practice.day1;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int j = arr.length-1;
        for(int i=0; i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[j-i];
            arr[j-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
