package com.site.programers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Printer {

    // https://programmers.co.kr/learn/courses/30/lessons/42587?language=java

    public static void main(String[] args) {

        Printer p = new Printer();
        int[] priorities = {4,1,7,3};
        int location = 3;
        System.out.println(p.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        String target = "S" + location;

        List<Integer> list = new LinkedList<>();
        List<String> sList = new LinkedList<>();
        List<Integer> rlist = new LinkedList<>();
        List<String> rsList = new LinkedList<>();

        int index = 0;
        for(int i : priorities) {
            list.add(i);
            sList.add("S" + index++);
        }

        while(true) {
            int j = list.get(0);

            boolean isDequeue = true;
            for(int i=0; i < list.size(); i++) {
                if(j < list.get(i)) {
                    isDequeue = false;
                    list.add(list.remove(0));
                    sList.add(sList.remove(0));
                    break;
                }
            }

            if(isDequeue) {
                rlist.add(list.remove(0));
                rsList.add(sList.remove(0));
            }

            if(rlist.size() == priorities.length) {
                break;
            }
        }

        for(int i=0; i < priorities.length; i++) {
            if(rsList.get(i).equals(target)) {
                answer = i + 1;
            }
        }

        return answer;
    }
}
