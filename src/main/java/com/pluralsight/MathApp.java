package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int price1 = 7;
        int price2 = 10;

        int sum = price1 + price2;

        System.out.println ("The answer is " + sum);

        double bobSalary = 170000;
        double garySalary = 120000;

        double highSalary = Math.max(bobSalary, garySalary);
        System.out.println(" The highest salary is " + highSalary);

        double carPrice = 48000;
        double truckPrice = 80000;

        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println(" The lowest price is " + lowestPrice);

        double radius = 7.25;
        double areaCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of Circle " + areaCircle);

        double number = 5.0;
        double squareRoot = (Math.sqrt(5.0));

        System.out.println("The SquareRoot is " + squareRoot);

        double m1 = 5;
        double m2 = 10;
        double b1 = 85;
        double b2 = 50;

        double distance = Math.sqrt(Math.pow((b1 - m1), 2) + Math.pow((b2 - m2), 2));

        System.out.println(" The distance between the given number is " + distance);

        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);

        System.out.println(" The absolute value is " + absoluteValue);

        double randomNumber = Math.random();

        System.out.println("The random number between 0 and 1 is " + randomNumber);

    }
}
