package com.zoo;

public class Car implements Movable {
//    @Override
//    public void move(String str) {
//        System.out.println("gogo car move" + str);
//    }

    @Override
    public void move(String str) {
        Movable movable1 = (str) -> {
            System.out.println("gogo move move : " + str);
        };
    }

    public static void main(String[] args) {
        Car car = new Car();


    }
}
