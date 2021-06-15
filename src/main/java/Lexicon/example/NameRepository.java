package Lexicon.example;

import java.util.*;

public class NameRepository {

    public static void main(String[] args) {

        String[] fullName;
        fullName = new String[]{"Erik Svensson"};
        System.out.println(Arrays.toString(fullName));




        clear(fullName);
        setNames(fullName);
        getSize(fullName);
        addWord(fullName);
        find(fullName);
    }

    private static void clear(String[] fullName) {

        int index = 0;
        String[] newFullName = new String[fullName.length - 1];

        for (int i = 0, k = 0; i < fullName.length; i++) {

            if (i == index) {

                continue;

            }
            newFullName[k++] = fullName[i];

        }
        System.out.println(Arrays.toString(newFullName));
    }

    private static void setNames(String[] fullName) {

        System.out.println("Array Name:" + fullName[0]);

    }

    public static int getSize(String[] fullName) {

        int arraySize = fullName.length;

        return arraySize;

    }

    public static boolean addWord(String[] fullName) {

        String[] newName = new String[fullName.length + 1];
        for (int i = 0; i < fullName.length; i++) {

            newName[i] = fullName[i];

            if (newName.length > fullName.length) {
                return true;

            } else {
                return false;

            }
        }
        return addWord(fullName);
    }

    public static String find(final String[] fullName) {

        List<String> wordList = Arrays.asList(fullName);
        boolean result = wordList.contains("Simon Erik");
        for (int i = 0; i < fullName.length; i++) {


            if (result) {
                System.out.println("Great, Name found!");
            } else {
                System.out.println("Sorry, Name not found!");

            }

        }
        return find(fullName);
    }

    public static boolean update(final String fullName, final String newFullName) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Sanya");
        list.add("Mehdada");

        System.out.println("New Array is" + fullName);
return true;
    }
}
