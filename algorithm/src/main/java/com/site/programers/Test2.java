package com.site.programers;

import java.util.*;

public class Test2 {

    public static String firstUniqueName(String[] names) {
        if (names == null) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
        String result = "";

        List<String> list = new ArrayList<String>(Arrays.asList(names));
        List<String> uniqueList = new ArrayList<String>(new HashSet<String>(list));

        System.out.println(uniqueList.toString());

        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}
