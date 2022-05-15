package com.eveiled.ex01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> strings = new TreeSet<String>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));

        String compSign1 = scanner.nextLine();
        String compSign2 = scanner.nextLine();
        String compSign3 = scanner.nextLine();

        compareLetters(strings, compSign1, "a", "b");
        compareLetters(strings, compSign2, "a", "c");
        compareLetters(strings, compSign3, "b", "c");
        for (String str: strings) {
            System.out.println(str);
        }
    }

    private static void compareLetters(Set<String> strings, String compSign, String l1, String l2) {

        Set<String> incorrectString = new TreeSet<String>();

        for (String str: strings) {
            if (compSign.equals(">") && !(str.indexOf(l1) > str.indexOf(l2))) {
                incorrectString.add(str);
            }
            else if (compSign.equals("<") && !(str.indexOf(l1) < str.indexOf(l2))) {
                incorrectString.add(str);
            }
            else if (compSign.equals("=") && !((str.indexOf(l1) + 1 == str.indexOf(l2) || str.indexOf(l1) == str.indexOf(l2) + 1))){
                incorrectString.add(str);
            }
        }
        strings.removeAll(incorrectString);
    }
}
