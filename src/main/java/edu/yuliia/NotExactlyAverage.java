package edu.yuliia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotExactlyAverage {
    public static void main(String[] args) throws IOException {
        int[] myNumbers = numbers();

        int minMyNumbers = findMin(myNumbers);
        int maxMyNumbers = findMax(myNumbers);
        int sumMyNumbers = findSum(myNumbers);

//        int average = minMyNumbers;
//        for (int i = 0; i < myNumbers.length; i++) {
//            if (myNumbers[i] > minMyNumbers && myNumbers[i] < maxMyNumbers) {
//                average = myNumbers[i];
//            }
//        }
//        System.out.println(average);

        int average = sumMyNumbers - (minMyNumbers + maxMyNumbers);
        System.out.println(average);


    }
    static int inputNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    static int[] numbers() throws IOException {
        return new int[] {
                inputNumber(),
                inputNumber(),
                inputNumber()
        };
    }

    static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int findSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
