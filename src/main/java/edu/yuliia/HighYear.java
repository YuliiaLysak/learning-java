package edu.yuliia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighYear {
    public static void main(String []args) throws IOException {
        int year = readInputYear();

        if (isHighYear(year)) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }

    static int readInputYear() throws IOException {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // String year = reader.readLine();
       // return Integer.parseInt(year);
         return 2020;
    }

    static boolean isHighYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
