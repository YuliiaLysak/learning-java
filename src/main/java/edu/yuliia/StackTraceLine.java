package edu.yuliia;

public class StackTraceLine {

/*
Кто меня вызывал?
*/

        public static void main(String[] args) {
            method1();
        }

        public static int method1() {
            method2();
            method2();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            System.out.println(methods[2].getMethodName());
            System.out.println(methods[2].getLineNumber());
            return methods[2].getLineNumber(); /*напишите тут ваш код*/
        }

        public static int method2() {
            method3();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getLineNumber(); /*напишите тут ваш код*/
        }

        public static int method3() {
            method4();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getLineNumber(); /*напишите тут ваш код*/
        }

        public static int method4() {
            method5();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getLineNumber(); /*напишите тут ваш код*/
        }

        public static int method5() {
            if (true) throw new RuntimeException();
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            return methods[2].getLineNumber(); /*напишите тут ваш код*/
        }
    }

