package practice.day1;

import java.util.Arrays;

public class SecondHighestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,66,12,43,34};

        findSecondHigest(arr);
    }

    public static void findSecondHigest(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Second Highest: "+ arr[arr.length-2]);
    }

}
