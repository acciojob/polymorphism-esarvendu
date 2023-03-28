package com.driver;

public class Main {

    public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();

        // call the int product(int x, int y) method
        int result1 = p.product(2, 3);
        System.out.println("result1 = " + result1);

        // call the int product(int x, int y, int z) method
        int result2 = p.product(2, 3, 4);
        System.out.println("result2 = " + result2);

        // call the double product(double x, double y) method
        double result3 = p.product(2.5, 3.5);
        System.out.println("result3 = " + result3);
    }
}