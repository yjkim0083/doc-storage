package com.site.programers;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static String firstUniqueName(String[] names) {
        if (names == null) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < names.length; i++) {

            if(names[i].equals(null) || names[i] == "") {
                continue;
            }

            if (map.containsKey(names[i])) {
                map.remove(names[i]);
            } else {
                map.put(names[i], i);
            }
        }

        System.out.println(map.toString());

        String result = "";

        if (map.size() == 0) {
            result = null;
        } else {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}
