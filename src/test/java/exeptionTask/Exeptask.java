package exeptionTask;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exeptask {
    //    static String name;
//
//    public Exeptask(String message) {
//    }
//
//    private static void printName(){
//        System.out.println(name.length());
//    }
//    public static void main(String[] args) throws CustomExept {
//        int [] arr1 = new int[0];
//        System.out.println(arr1[5]);
//        String s= "abc";
//        Object o = s;
//        Integer i =Integer.parseInt("12");
//        System.out.println(i);
//       throw new CustomExept("message");
//
//
//        public static void doNotDo(int i) {
//        doNotDo(1);
//    }
//    static {
//    int[] arr2 = new int [5];
//    int num = arr2[-1];
//    }
    public static void divideZero(int firstNumber, int secondNumber) {
        try {
            System.out.println(firstNumber / secondNumber);
        } catch (ArithmeticException e) {
            System.out.println("Is not divisible is ArithmeticException");
        }

    }

    public static void noFoundClass() {
        try {
            Class cl = Class.forName("NoClass");
        } catch (ClassNotFoundException e) {
            System.out.println("No existing class");
        }
    }

    public static void noFoundClass2() throws ClassNotFoundException {
        Class cls = Class.forName("NoSuchClass");
        throw new ClassNotFoundException("Sorry class not exist");
    }

    public void throwExeption(String message) throws Exception {
        throw new Exception(message);
    }

    @Test
    public static void testAssertStrings() throws AssertionError {
        String a = "asd";
        String b = "asd";
        try {
            assertThrows(AssertionError.class, () -> {
                assertTrue(a == b);
            });
            System.out.println("No Coincide");

        } catch (AssertionError error) {
            System.out.println("First string: " + a);
            System.out.println("Second string: " + b);
        }
    }

    void printStackTrace(String message) {

    }

    int[][] array = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
            {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
            {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
            {50, 51, 52, 53, 54, 55, 56, 57, 58, 59},
            {60, 61, 62, 63, 64, 65, 66, 67, 68, 69},
            {70, 71, 72, 73, 74, 75, 76, 77, 78, 79},
            {80, 81, 82, 83, 84, 85, 86, 87, 88, 89},
            {90, 91, 92, 93, 94, 95, 96, 97, 98, 99}};

    public static int arraySum(int[][] array) {
        int total = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                total += array[row][col];
        }

        return total;
    }

    public static void main(String[] args) throws CustomExept {
//        divideZero(5, 0);
//        noFoundClass();
//        noFoundClass2();
//        try {
//            testAssertStrings();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//
//       throw new CustomExept("I'm fuck up");

        int[][] matrix = {{1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                /*{1,2,3,4}*/};
        int sum = 0;
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length; m++) {
                System.out.print(matrix[n][m] + " ");
                if (n == m) {
                    sum += matrix[n][m];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of matrix with 2 for lops: " + sum);

        int total = 0;
        for (int i = 0; i < matrix.length; i++) {

            total += matrix[i][i];
        }
        System.out.println("Sum of matrix with 1 for lops: " + sum);


        int[][] array = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
                {40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56, 57, 58, 59},
                {60, 61, 62, 63, 64, 65, 66, 67, 68, 69},
                {70, 71, 72, 73, 74, 75, 76, 77, 78, 79},
                {80, 81, 82, 83, 84, 85, 86, 87, 88, 89},
                {90, 91, 92, 93, 94, 95, 96, 97, 98, 99}};
        System.out.println("Array total: " + arraySum(array));

    }

}
