import java.util.Arrays;

public class FindMaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,55,22,56,93,92};

        //Solution 1
//        Arrays.sort(arr);
//        System.out.println("min: "+ arr[0]);
//        System.out.println("max: "+ arr[arr.length-1]);

        int min = arr[0];
        int max = arr[0];

        for(int i= 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }


        System.out.println("Min: "+ min + " Max: "+ max);
    }

}
