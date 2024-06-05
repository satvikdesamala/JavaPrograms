package practice.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Object[] arr = list.toArray(new Object[0]);
        System.out.println(arr);
    }
}
