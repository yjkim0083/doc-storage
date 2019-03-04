package com.site.programers;

public class ShiningStar {

    private double[] shineFactor = new double[1];
    private String name;

    public void fadeOut() {
        this.shineFactor = null;
    }

    public ShiningStar(double d) {
        this.shineFactor[0] = d;
    }

    public double shine() {
        if( this.shineFactor != null) {
            return this.shineFactor[0];
        } else {
            throw new IllegalStateException();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        // Code for debugging the test case NewStarsCanShine
        double shineFactor = 1d;
        ShiningStar star = new ShiningStar(shineFactor);
        System.out.println(String.format("Are equal: %b, expected: %f, actual: %f", shineFactor == star.shine(), shineFactor, star.shine()));
    }
}
