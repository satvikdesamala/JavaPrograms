public class LargestNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {44,5,7,9,2,11,6};

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);
    }
}
