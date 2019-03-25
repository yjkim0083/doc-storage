package com.site.programers.level1;

import java.util.Arrays;

public class Knumber {
    // https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
    public static void main(String[] args) {
        Knumber k = new Knumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        // return [5,6,3]
        System.out.println(Arrays.toString(k.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0;
        for(int[] command : commands) {
            int[] newArray = new int[command[1] - command[0] + 1];
            System.arraycopy(array, command[0] - 1, newArray, 0, (command[1] - command[0] + 1));
            Arrays.sort(newArray);
            answer[index++] = newArray[command[2] - 1];
        }

        return answer;
    }
}
