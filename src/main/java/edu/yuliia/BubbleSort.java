package edu.yuliia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws IOException {

        int[] numbers = getNumbers();

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (numbers.length - 1); i++) {
                if (numbers[i] < numbers[i+1]) {
                    isSorted = false;

                    int temporal = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temporal;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

    }

    static int inputNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    static int[] getNumbers() throws IOException {
        return new int[] {
                inputNumber(),
                inputNumber(),
                inputNumber()
        };
    }
}
