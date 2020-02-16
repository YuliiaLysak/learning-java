package edu.yuliia;

public class StackTraceLength {

/*
Стек-трейс длиной 10 вызовов
*/


/*
Там, в синих глубинах стек-трейса…
*/

        public static void main(String[] args) {
            int deep = getStackTraceDepth();
        }

        public static int getStackTraceDepth() {
            StackTraceElement[] methods = Thread.currentThread().getStackTrace();
            methods[0].getClassName();
            System.out.println(methods.length);
            return methods.length;
            //напишите тут ваш код
        }
    }

