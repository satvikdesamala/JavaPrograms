package practice.day1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        char[] s1 = "Cinena".toLowerCase().toCharArray();
        char[] s2 = "Iceman".toLowerCase().toCharArray();

        List<Character> s1List = new LinkedList<Character>();
        List<Character> s2List = new LinkedList<Character>();
        if(s1.length!=s2.length){
            return;
        }

        for(int i=0; i<s1.length;i++){
            s1List.add(s1[i]);
        }
        for(int i=0; i<s2.length;i++){
            s2List.add(s2[i]);
        }

        Collections.sort(s1List);
        Collections.sort(s2List);
        System.out.println(s1List);
        System.out.println(s2List);

        if(s1List.equals(s2List)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
}
