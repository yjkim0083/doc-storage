package com.site;

public class Algorithm {

    public static boolean isPalindrome(String word) {

        if( word.equals(null) || word == null) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }

        word = word.toLowerCase();
        char[] _c = word.toCharArray();
        int length = _c.length;
        char[] _result = new char[length];
        int index = 0;
        for(int i=length - 1; i >= 0; i--) {
            _result[index] = _c[i];
            index++;
        }

        String result = String.valueOf(_result);

        System.out.println(word);
        System.out.println(result);

        if(word.equals(result)) return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(Algorithm.isPalindrome("Deleveled"));
    }
}
