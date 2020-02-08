package edu.yuliia;

import java.util.ArrayList;

public class StaticCatArrayList {
    public static ArrayList<StaticCatArrayList> cats = new ArrayList<StaticCatArrayList>();
        //напишите тут ваш код

        public StaticCatArrayList() {
        }

        public static void main(String[] args) {
            StaticCatArrayList cat1 = new StaticCatArrayList();
            StaticCatArrayList cat2 = new StaticCatArrayList();
            StaticCatArrayList cat3 = new StaticCatArrayList();
            StaticCatArrayList cat4 = new StaticCatArrayList();
            StaticCatArrayList cat5 = new StaticCatArrayList();
            StaticCatArrayList cat6 = new StaticCatArrayList();
            StaticCatArrayList cat7 = new StaticCatArrayList();
            StaticCatArrayList cat8 = new StaticCatArrayList();
            StaticCatArrayList cat9 = new StaticCatArrayList();
            StaticCatArrayList cat10 = new StaticCatArrayList();

            cats.add(cat1);
            cats.add(cat2);
            cats.add(cat3);
            cats.add(cat4);
            cats.add(cat5);
            cats.add(cat6);
            cats.add(cat7);
            cats.add(cat8);
            cats.add(cat9);
            cats.add(cat10);
            //напишите тут ваш код

            printCats();
        }

        public static void printCats() {
            for (int i = 0; i < cats.size(); i++)
                System.out.println(cats.get(i));
            //напишите тут ваш код
        }
    }
