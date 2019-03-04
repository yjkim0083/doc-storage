package com.site.codility.lesson3;

public class FrogJump {

    public static void main(String[] args) {
        int X = 10, Y = 85, D = 30;
        System.out.println(solution(X,Y,D));
    }

    public static int solution(int X, int Y, int D) {
        int result = 0;

        if( X == Y ) {
            return result;
        }
        if( X + D >= Y ) {
            result = 1;
            return result;
        }

        int firstJump = X + D;
        int remainPosition = Y - firstJump;

        int jumpCount = remainPosition / D;
        int remainJump = remainPosition % D == 0 ? 0 : 1;

        result = 1 + jumpCount + remainJump;

        return result;
    }
}
