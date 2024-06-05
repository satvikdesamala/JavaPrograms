import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAndEven {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,88,23,14,56,33};
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        // print array list elements
        System.out.println("Even List: "+ even);
        System.out.println("Odd List: "+ odd);

        // convert arraylist to array and print
        System.out.println("Even Array: "+ Arrays.toString(even.toArray(new Integer[0])));
        System.out.println("Odd Array: "+ Arrays.toString(odd.toArray(new Integer[0])));
    }

    public static class RevEachWordInSen {
        public static void main(String[] args) {
            String str = "Java is programming language";

            String[] words = str.split(" ");

            String revStr = "";
            for(String word:words){
                String revWord = "";
                String[] wordArr = word.split("");
                for(int i= wordArr.length-1;i>=0;i--){
                    revWord = revWord+wordArr[i];
                }
                revStr = revStr + revWord + " ";
            }
            System.out.println(revStr);
        }
    }
}
