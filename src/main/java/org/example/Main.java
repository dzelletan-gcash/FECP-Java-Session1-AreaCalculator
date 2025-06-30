package org.example;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shapeNo;

        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");
        shapeNo = scanner.nextInt();

        switch (shapeNo) {
            case 1:
                System.out.print("\nEnter the radius: ");
                double radius = scanner.nextDouble();
                System.out.printf("Area of the circle: %.2f\n", calculateCircleArea(radius));
                break;

            case 2:
                System.out.print("\nEnter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height: ");
                double height = scanner.nextDouble();
                System.out.printf("Area of the triangle: %.2f\n", calculateTriangleArea(base, height));
                break;

            case 3:
                System.out.print("\nEnter the length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width: ");
                double width = scanner.nextDouble();
                System.out.printf("Area of the rectangle: %.2f\n", calculateRectangleArea(length, width));
                break;

            default:
                System.out.println("\nInvalid shape number. Please select shape 1, 2, or 3.");
        }
    }
}