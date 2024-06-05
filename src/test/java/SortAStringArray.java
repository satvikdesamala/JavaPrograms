import java.util.Arrays;

public class SortAStringArray {
    public static void main(String[] args) {
        String[] arr = {"James", "Bond", "Kalyan", "Satvik"};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }
}
