package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int x = 1;
        int y = 2;
        int z = 3;
        p.product(x,y);
        p.product(x,y,z);
        p.product((double)x,(double)y);
    }
}