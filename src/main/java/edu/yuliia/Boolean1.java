package edu.yuliia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boolean1 {
    public static void main(String[] args) throws Exception {
        int a = inputNumber();
        int b = inputNumber();
        int c = inputNumber();

        int countPlus = 0;
        int countMinus = 0;

        if (a > 0) {
            countPlus++;
        }

        if (a < 0) {
            countMinus++;
        }

        if (b > 0) {
            countPlus++;
        }

        if (b < 0) {
            countMinus++;
        }

        if (c > 0) {
            countPlus++;
        }

        if (c < 0){
            countMinus++;
        }


        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);
        //напишите тут ваш код

    }

    static int inputNumber() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    static int[] numbers() throws Exception {
        int[] numbers = {inputNumber(), inputNumber(), inputNumber()};
        return  numbers;
    }
}
