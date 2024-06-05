package day2;

import java.util.Arrays;

public class SecondHigeshElementInAnArray {

    public static void main(String[] args) {
        int[] arr = {1,2,55,2,2,77,22,45};

//        findSecondHigh(arr);
        System.out.println(findSecondHigh(arr));
    }

    public static int findSecondHigh(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-2];
    }

}
