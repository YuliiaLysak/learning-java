package edu.yuliia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        if (N < 1) {
            return;
        }
        int[] numbers = new int[N];

        for (int x = 0; x < N; x++) {
            numbers[x] = Integer.parseInt(reader.readLine());
        }

        int maximum = numbers[0];
        for (int i = 0; i < N; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println(maximum);
    }
}
