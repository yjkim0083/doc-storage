package com.site.codility.lesson2;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] A = {1,2,3,4};
        int K = 0;
        System.out.println(Arrays.toString(solution(A, K)));
    }

    public static int[] solution(int[] A, int K) {

        if(K == 0) {
            return A;
        }

        int arrayLength = A.length;
        int[] result = new int[arrayLength];

        int period = K % arrayLength;
        int index = 0;
        while(true) {
            result[ period + index >= arrayLength  ? (period + index - arrayLength) : period + index ] = A[index];
            index++;
            if(index == arrayLength) {
                break;
            }
        }
        return result;
    }
}
