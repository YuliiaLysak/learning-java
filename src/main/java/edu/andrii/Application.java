package edu.andrii;

public class Application {
    public void run() {
        System.out.println("abc");
        String[] newNames = nameList();
        int[] newAges = ages();
        newAges[0] = 27;
        newAges[1] = 30;
        newAges[2] = 30;
        newAges[3] = 33;

        String[] result = endList(newNames,newAges);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    String[] nameList() {
        String[] names = {
                "Yuliia",
                "Lera",
                "Sandra",
                "Anna"
        } ;
        return names;
    }

    /**
     * Returns ages of persons.
     *
     * @return array of ages.
     */
    int[] ages() {
        int[] ages = new int[4];
        return ages;
    }

     String[] endList(String[] names, int[] ages) {
        int resultSize;
        if (names.length < ages.length) {
            resultSize = names.length;
        } else {
            resultSize = ages.length;
        }
        String[] result = new String[resultSize];
        for(int i = 0; i < result.length; i++) {
            result[i] = (names[i] + " " + ages[i]);
        }
         return  result;
     }

    int highYear() {
        int highYear = 1920 + 10;
        return highYear;
    }
}
