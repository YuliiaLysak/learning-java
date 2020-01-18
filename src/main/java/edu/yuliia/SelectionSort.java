package edu.yuliia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
    public static void main(String[] args) throws IOException {

        int[] numbers = getNumbers();

        for (int i = 0; i < numbers.length; i++) {
            for (int k = i; k < numbers.length; k++) {
                if (numbers[i] < numbers[k]) {
                    int temporal = numbers[i];
                    numbers[i] = numbers[k];
                    numbers[k] = temporal;
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
