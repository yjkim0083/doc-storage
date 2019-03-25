package com.site.programers.level1;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42576?language=java

public class Marathon {

    public static void main(String[] args) {

        Marathon m = new Marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "leo" };

        System.out.println(m.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i < participant.length; i++) {
            if(i == participant.length - 1 ||
                    !participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }

        }

        return answer;
    }
}
