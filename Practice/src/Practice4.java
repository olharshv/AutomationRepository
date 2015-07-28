/**
 * Created by OlhaY on 7/23/2015.
 */
public class Practice4 {
    public static void main(String[] args) {
//        int res = sumit(3, 2);
//        public static int sumit(int a1, int a2){
//        return  a1+a2;
//    }


        int[] operand1 = {41, 39, 64, 56, 48, 52, 57, 82, 12, 53, 80, 24, 75};
        int[] operand2 = {81, 42, 83, 4, 68, 11, 4, 67, 29, 1, 51, 3, 98};
        int[] expectedResults = {122, 81, 147, 60, 116, 63, 61, 149, 41, 54, 131, 27, 173};

        int length1 = operand1.length;
        int length2 = operand2.length;
        int length3 = expectedResults.length;
        int operandSum = 0;
        int passed_count = 0;
        int failed_count = 0;

        for (int i = 0; i < length1; i++) {
            operandSum = operand1[i] + operand2[i];
//            System.out.println(operandSum);
            if (expectedResults[i] == operandSum) {
                passed_count = passed_count + 1;
            } else {
                failed_count = failed_count + 1;
                System.out.println("Expected: " + expectedResults[i] + "; " + "Actual: " + operandSum);
            }
        }

        if (passed_count == length1) {
        System.out.println("Tests PASSED");
        System.out.println(passed_count);
        } else {
            System.out.println("Tests FAILED");
            System.out.println(failed_count);
        }


        System.out.println(passed_count + " tests passed;" + failed_count + " tests failed");

        //practice 5. functions
        int j = 1000;
        System.out.println(j);
        int x = f();
        System.out.println(x);

        //TO DO: notstrings from the Quiz 3
        int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target = 1;
        int y = targetsInArray(notstrings,target);
        System.out.println(y);

        int[] notstrings1 = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target1 = 6;
        int y1 = targetsInArray(notstrings1,target1);
        System.out.println(y1);

        int[] notstrings2 = {1, 7, 1, 4, 1, 7, 9, 6, 13, 1, 7};
        int target2 = 7;
        int y2 = targetsInArray(notstrings2,target2);
        System.out.println(y2);

        //to do: return value*value
        int val = 8;
        int z = multiply(val);
        System.out.println(z);
        //to do: stroka n raz

        String stroka = valueString(5, "Hello");
        System.out.println();
        System.out.println(stroka);

        //to do: return true/false
        int [] m1 = {1, 2, 3};
        int [] m2 = {1, 2, 3};
        ArrayTrueFalse(m1, m2);

        System.out.println();

        //to do4
        int [] mas1 = {1, 2, 3};
        int [] mas2 = {1, 2, 3, 4};
        ArrayDiffLength(mas1, mas2);
    }

    //practice 5. functions. объ€вл€ем ф-ю в классе, но за пределами void main!!!
    public static int f(){
        return 1000;
    }


    public static int targetsInArray(int[] ns, int t){
        int result = 0;
        for (int ii = 0; ii < 11; ii++) {
            if (ns[ii] == t) {
                result++;
            }
        }
        return result;

    }

    public static int multiply(int value){
        return value*value;
    }


    public static String valueString (int n, String st) {
        String st1 = "";//нужно изначально объ€вить пустой строкой
        for (int i = 0; i < n; i++) {
            st1 = st1 + st;
        }
        return st1;
    }

//to do3
    public static boolean ArrayTrueFalse (int[] m1, int[]m2){
        boolean check = true;
        for (int i = 0; i < m1.length; i++){
            if (m1[i] != m2[i]){
                check = false;
            }
        }
        System.out.println(check);
        return check;
    }


    //to do4: функци€ принимает 2 массива любой длиннь≥, и вь≥дает в результате одинаковь≥е ли у них все значени€.

    public static boolean ArrayDiffLength (int[] mas1, int[] mas2){
        boolean check = true;
        if (mas1.length != mas2.length) {
            check = false;
        } else {
            for (int i = 0; i < mas2.length; i++){
                if (mas1[i] != mas2[i]){
                    check = false;
                }
            }
        }
        System.out.println(check);
        return check;
    }

}