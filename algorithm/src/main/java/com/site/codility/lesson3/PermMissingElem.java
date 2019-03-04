package com.site.codility.lesson3;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = {2,3,4,1,6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int[] arrN = new int[A.length+2];

        System.out.println(Arrays.toString(arrN));

        for( int i = 0 ; i < A.length ; i++) arrN[A[i]] = A[i];

        System.out.println(Arrays.toString(arrN));

        for( int i = 1 ; i < arrN.length ; i++) if(arrN[i] == 0 ) return i;

        return 0;
    }


}
