package edu.yuliia;

public class SearchMinNumber {
    public static void main(String[] args) {
        int[] myNumbers = getNumbers();


        int minMyNumbers = findMin(myNumbers);
        int maxMyNumbers = findMax(myNumbers);
        int sumMyNumbers = findSum(myNumbers);
        int multiplyMyNumbers = findMultiply(myNumbers);
        double averageMyNumbers = findAverage(myNumbers);
        System.out.println(minMyNumbers);
        System.out.println(maxMyNumbers);
        System.out.println(sumMyNumbers);
        System.out.println(multiplyMyNumbers);
        System.out.println(averageMyNumbers);
        System.out.println();
    }



    static int[] getNumbers() {
        return new int[]{ 2, 3, 7, 8, -1, -10 };
    }

    static double findAverage(int[] numbers) {
        return (double) findSum(numbers) / (numbers.length);
    }

    static int findSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static int findMultiply(int[] numbers) {
        int multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            multiply *= numbers[i];
        }
        return multiply;
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

    static int findMin(int[] numbers) {
        int min = numbers[0];
        if (numbers[1] < min) {
            min = numbers[1];
        }
        if (numbers[2] < min) {
            min = numbers[2];
        }
        if (numbers[3] < min) {
            min = numbers[3];
        }
        if (numbers[4] < min) {
            min = numbers[4];
        }
        return min;
    }
}
