package com.example;

public class Main {

    public static void main(String[] args) {
        area(6);
        area(839);
        area(44, 73);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double areaOfCircle = Math.pow(radius, 2) * Math.PI;
        System.out.println("area of circle = " + areaOfCircle);
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        double areaOfRectangle = x * y;
        System.out.println("area of rectangle = " + areaOfRectangle);
        return areaOfRectangle;
    }
}
