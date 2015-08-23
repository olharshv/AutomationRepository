package com.example.helloworld;


        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Quiz6_2_HomeWork_Assert {

    @Test
    public void test1() {
        Assert.assertEquals(19, 10 + 10);

        Assert.assertEquals(true, 1 == 2);
        Assert.assertTrue(1 == 2);
    }

    @Test
    public void lotsOfTests() {
        Assert.assertEquals("Hello Engineers!", hello());
        // Test PASSED.
        Assert.assertEquals("Hello Friends", hello("Friends"));
        // Test PASSED.
        Assert.assertEquals("Hello Good Men", hello("Good Men"));
        // Test PASSED.
        Assert.assertEquals("Hello to all 14 students!", hello(14));
        // Test PASSED.
        Assert.assertEquals("Hello student!", hello(1));
        // Test PASSED.
        Assert.assertEquals("No one came.", hello(0));
        // Test PASSED.
        Assert.assertEquals("Hello to all 25 persons!", hello(25, "persons"));
        // Test PASSED.
        Assert.assertEquals("Hello to all 99 programmers!", hello(99, "programmers"));
        // Test PASSED.
        Assert.assertEquals("Hello Jean Podmore Oleksiia !", hello(new String[]{"Jean", "Podmore", "Oleksiia"}));
        // Test PASSED.
        Assert.assertEquals("Hello Anonymous Anonymous2 !", hello(new String[]{"Anonymous", "Anonymous2"}));
        // Test PASSED.
        Assert.assertEquals("Hello Slughorn, Norris, Fred and George!", hello(Arrays.asList("Slughorn", "Norris", "Fred", "George")));
        // Test PASSED.
        Assert.assertEquals("Hello Horace, Miss and Weasley's!", hello(Arrays.asList("Horace", "Miss", "Weasley's")));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(1, 4, 3), Arrays.asList(1, 4, 3));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
        Assert.assertEquals("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        Assert.assertEquals(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
    }

    public static void sayHello() {
        System.out.println("Hello Class!");
    }

    public static String hello() {
        return "Hello Engineers!";
    }

    public static String hello(String who) {
        return "Hello " + who;
    }

    public static String hello(int howMany) {
        if (howMany == 1) {
            return "Hello student!";
        }
        if (howMany <= 0) {
            return "No one came.";
        }
        return "Hello to all " + howMany + " students!";
    }

    public static String hello(int howMany, String whom) {
        return "Hello to all " + howMany + " " + whom + "!";
    }

    public static String hello(String[] who) {
        String res = "Hello ";
        for (String name : who) {
            res += name + " ";
        }
        return res + "!";
    }

    public static String hello(List<String> who) {
        String res = "Hello ";
        for (int i = 0; i < who.size(); i++) {
            if (i == who.size() - 2) {
                res += who.get(i) + " and " + who.get(i + 1) + "!";
                break;
            }
            res += who.get(i) + ", ";
        }
        return res;
    }

    public static List<Integer> stringsLength(List<String> strings) {
        ArrayList<Integer> res = new ArrayList<>();
        for (String s : strings) {
            res.add(s.length());
        }
        return res;
    }

    public static List<Integer> reverseInts(List<Integer> ints) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = ints.size() - 1; i >= 0; i--) {
            res.add(ints.get(i));
        }
        return res;
    }

    public static List<String> reverse(List<String> strings) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = strings.size() - 1; i >= 0; i--) {
            res.add(strings.get(i));
        }
        return res;
    }

    public static void prettyPrint(List<String> strings, boolean normal) {
        int spaces = 0;
        if (!normal) {
            spaces = strings.size() - 1;
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(multi(" ", spaces) + strings.get(i));
            if (normal) {
                spaces++;
            } else {
                spaces--;
            }
        }
    }

    public static String multi(String s, int times) {
        String res = "";
        for (int i = 0; i < times; i++) {
            res += s;
        }
        return res;
    }



    @Test
    public void test3() {
        Assert.assertEquals(10, sumAll(new int[] {1, 4, 2, 3, 0}));
    }

    @Test
    public void testFailed() {
        Assert.assertEquals(38, sumAll(new int[] {1, 41, 2}));
    }

    public static int sumAll(int[] a) {
        int res = 0;
        for (int e : a) {
            res = res + e;
        }
        return res;
    }

    public static int sumAll2(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            int e = a[i];
            res = res + e;
        }
        return res;
    }
}