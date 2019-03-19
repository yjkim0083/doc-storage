package com.site.programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Printer {

    // https://programmers.co.kr/learn/courses/30/lessons/42587?language=java

    public static void main(String[] args) {

        Printer p = new Printer();
        int[] priorities = {2,3,5,2};
        int location = 2;
        System.out.println(p.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        String target = "S" + location;

        List<Integer> list = new LinkedList<>();
        List<String> sList = new LinkedList<>();
        int index = 0;
        for(int i : priorities) {
            list.add(i);
            sList.add("S" + index++);
        }

        System.out.println(list.toString());
        System.out.println(sList.toString());

        int addCnt = 0;
        for(int i=0; i < priorities.length; i++) {
            int j = priorities[i];
            if(i < priorities.length - 1) {

                for(int y=i+1; y < priorities.length; y++) {
                    if(j < list.get(y)) {
                        System.out.println("j : " + j + ", list.get(y) " + list.get(y));
                        list.add(list.get(i));
                        sList.add(sList.get(i));
                        System.out.println("============================");
                        System.out.println(list.toString());
                        System.out.println(sList.toString());
                        System.out.println("============================");
                        addCnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(list.toString());
        System.out.println(sList.toString());
        System.out.println("addCnt : " + addCnt);
        if(addCnt > 0) {
            while(addCnt > 0) {
                list.remove(addCnt - 1);
                sList.remove(addCnt - 1);
                addCnt--;
            }
        }

        System.out.println(list.toString());
        System.out.println(sList.toString());

        for(int i=0; i < priorities.length; i++) {
            if(sList.get(i).equals(target)) {
                answer = i + 1;
            }
        }

        return answer;
    }
}
