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

    }
}