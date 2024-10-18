package DataStructure.Linear.String;

import java.util.ArrayList;

public class Q2_reverse_vowels {
    public static void main(String[] args) {
      String s = "huzAifA";
//        String s= "IceCreAm";
        reverseVowels(s);

    }
    static void reverseVowels(String s) {
        char[] st = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            while (st [start] != 'a' && st [start] != 'e' &&  st [start]!= 'i'  &&  st [start] != 'o'  &&  st  [start] != 'u'
            && st [start] != 'A' && st [start] != 'E' &&  st [start]!= 'I'  &&  st [start] != 'O'  &&  st  [start] != 'U' ) {
                start++;
            }
            while (st [end] != 'a' && st [end] != 'e' &&  st [end]!= 'i'  &&  st [end] != 'o'  &&  st  [end] != 'u'
                    && st [end] != 'A' && st [end] != 'E' &&  st [end]!= 'I'  &&  st [end] != 'O'  &&  st  [end] != 'U' ) {
                end--;
            }
            if(start > end) { //to stop further swap after done
                break;
            }
            //swap
            char temp = st[start];
            st[start] = st[end];
            st[end] = temp;
            start++;
            end--;
        }
//        for (int res : st ) {
            System.out.println(st);
//        }
    }
}

//Ip: huzaifa
//Op: haziafu