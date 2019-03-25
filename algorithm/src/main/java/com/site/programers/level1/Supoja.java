package com.site.programers.level1;

import java.util.Arrays;
import java.util.LinkedList;

public class Supoja {

    // https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
    public static void main(String[] args) {

        Supoja s = new Supoja();
        int[] answers = {1,3,2,4,2};
        System.out.println(Arrays.toString(s.solution(answers)));
    }

    public int[] solution(int[] answers) {

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] results = new int[3];
        int[] answer = {};

        for(int i=0; i < answers.length; i++) {
            if(answers[i] == one[i % 5]) {
                results[0]++;
            }
            if(answers[i] == two[i % 8]) {
                results[1]++;
            }
            if(answers[i] == three[i % 10]) {
                results[2]++;
            }
        }

        LinkedList<Integer> list = new LinkedList<>();
        int max = 0;
        for(int i=0; i < 3; i++) {
            if(results[i] > max) {
                list = new LinkedList<>();
                list.add(i + 1);
                max = results[i];
            } else if(results[i] == max) {
                list.add(i + 1);
            }
        }

        answer = new int[list.size()];
        for(int i=0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
