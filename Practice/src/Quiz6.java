/**
 * Created by OlhaY on 8/5/2015.
 */

import java.util.ArrayList;
import java.util.Arrays;
//Дописать недостающие функции в классе Quiz6.
public
class Quiz6 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);
        //a
        //b
        //c
        //d
        ArrayList<String> f = new ArrayList<>();
        f.add("a"); f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //true
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //false
        s.add("b");
        System.out.println(isListsEqual(s, f));
        //false
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        System.out.println(isListsEqual(s1, s2));
        //true
        String[] a = {"a", "b", "c", "d", "b"};
        print(a);
        //abcdb
        System.out.println(isEqual(a, s));
        //true
    }
    public static void print(ArrayList<String> l) {
        // Тут дописать тело функции.

            System.out.println(l);

    }
    public static void print(String[] a) {
        // Тут дописать тело функции.

        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
    }
    // Тут дописать недостающие функции.
    public static boolean isListsEqual(ArrayList<String> l1, ArrayList<String> l2) {
        // Тут дописать тело функции.
        if (l1.size() == l2.size() && l1.equals(l2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEqual(String[] a1, ArrayList<String> a2) {
        // Тут дописать тело функции.
        /*if (a1.length  == a2.size() && a1.equals(a2)) {
            return true;
        }
        else {
            return false;
        }*/

        boolean tr=true;
        for (int i = 0; i <= 4; i++) {
            if (a1[i] != a2.get(i)) {
                tr = false;
                break;
            }
        }return tr;
    }
}


