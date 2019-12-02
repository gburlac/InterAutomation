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


    public static void main(String[] args) throws CustomExept {
//        divideZero(5, 0);
//        noFoundClass();
//        noFoundClass2();
        try {
            testAssertStrings();
        } catch (Throwable e) {
            e.printStackTrace();
        }

       throw new CustomExept("I'm fuck up");


    }

}
