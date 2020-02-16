package edu.yuliia;

public class StackTrace {

/*
И снова StackTrace
*/

        public static void main(String[] args) {
            method1();
        }

        public static String method1() {
            method2();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            System.out.println(methods[2].getMethodName());
            return methods[2].getMethodName();
            //напишите тут ваш код
        }

        public static int method2() {
            method3();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            System.out.println(methods[0].getLineNumber());
            return methods[2].getLineNumber();
            //напишите тут ваш код
        }

        public static String method3() {
            method4();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getMethodName();
            //напишите тут ваш код
        }

        public static String method4() {
            method5();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getMethodName();
            //напишите тут ваш код
        }

        public static String method5() {
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getMethodName();
            //напишите тут ваш код
        }
    }

