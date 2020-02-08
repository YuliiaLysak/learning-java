package edu.yuliia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class IncrementSort {
    public static void main(String[] args) throws Exception {
        int[] myNumbers = getNumbers();
        Arrays.sort(myNumbers);
        for (int x = 0; x < myNumbers.length; x++) {
            System.out.println(myNumbers[x]);
        }
    }



    public static int inputNumber() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static int[] getNumbers() throws Exception {
        return new int[]{
                inputNumber(),
                inputNumber(),
                inputNumber(),
                inputNumber(),
                inputNumber()
        };
    }
}

