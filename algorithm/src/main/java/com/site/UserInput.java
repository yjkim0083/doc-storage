package com.site;

import java.util.ArrayList;
import java.util.List;

public class UserInput {

    public static class TextInput {

        List<String> list = new ArrayList<String>();

        public void add(char c) {}

        public String getValue() {
            String result = "";

            for(String s : list) {
                result += s;
            }

            return result;
        }
    }

    public static class NumericInput extends TextInput{
        @Override
        public void add(char c) {
            try {
                String _c = String.valueOf(c);
                if(_c.length() == 1) {
                    Integer.parseInt(_c);
                    this.list.add(_c);
                }
            } catch(Exception e) { }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
