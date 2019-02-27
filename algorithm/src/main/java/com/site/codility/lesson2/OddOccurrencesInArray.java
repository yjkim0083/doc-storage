package com.site.codility.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);

        for(int i=0; i < A.length; i += 2) {
            if( i == A.length - 1 || A[i] - A[i + 1] < 0) {
                result = A[i];
                break;
            }
        }

        return result;
    }
}
