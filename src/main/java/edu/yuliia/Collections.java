package edu.yuliia;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        myList1.add("aa");
        myList1.add("bb");
        myList1.add("bb");
        myList1.add("bb");
        myList1.add("EE");

        Map<String, Integer> counting = wordCounting(myList1);

        for (Map.Entry<String, Integer> pair : counting.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        int count = countWords(myList1, "bb");
        System.out.println(count);

        List<String> myList2 = new ArrayList<>();
        myList2.add("aa");
        myList2.add("qq");
        myList2.add("tt");
        myList2.add("EE");
        myList2.add("pp");

        List<String> sameWords = sameWords(myList1, myList2);


        for (String s : sameWords) {
            System.out.println(s);
        }




    }

    public static List<String> sameWords(List<String> list1, List<String> list2) {
        List<String> sameWords = new ArrayList<>();
        for (String sameWord : list1) {
            for (String b : list2) {
                if (sameWord.equalsIgnoreCase(b)) {
                    sameWords.add(sameWord);
                }
            }
        }
        return sameWords;
    }

    public static int countWords(List<String> list, String s) {
        int countWords = 0;
        for (String word : list) {
            if (word.equals(s)) {
                countWords++;
            }
        }
        return countWords;
    }



//        myList1.add("aa");
//        myList1.add("bb");
//        myList1.add("bb");
//        myList1.add("bb");
//        myList1.add("EE");
    public static Map<String, Integer> wordCounting(List<String> words) {
        Map<String, Integer> wordCounting = new HashMap<>();
//        for (int i = 0; i < words.size(); i++) {
////            Integer count = 0;
////            for (int j = 0; j < words.size(); j++) {
////                if (words.get(i).equals(words.get(j))) {
////                    count++;
////                }
////            }
////            wordCounting.put(words.get(i), count);
////        }
        for (String word : words) {
            Integer count = wordCounting.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            wordCounting.put(word, count);
        }

        return  wordCounting;
    }

}
