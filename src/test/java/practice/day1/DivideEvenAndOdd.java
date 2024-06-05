package practice.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DivideEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {10,1,3,2,6,77,12,56};

        List odd = new ArrayList();
        List even = new ArrayList();

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd);
        System.out.println(Arrays.toString(even.toArray()));
        System.out.println(odd.toArray());
    }

    public static class EliminateDupsAndSortNumbers {
        public static void main(String[] args) {
            String str = "ammaaaa726472";


        }
    }
}
