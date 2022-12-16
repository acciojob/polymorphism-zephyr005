package com.driver;

public class Main {
    public static class Product{
        private double x;
        private double y;

        private int x;
        private int y;
        private int z;


        public int product(int x, int y) {
            this.x = x;
            this.y = y;
            return x*y;
        }

        public int product(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
            return x*y*z;
        }

        public double product(double x, double y) {
            this.x = x;
            this.y = y;
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int x = 0;
        int y = 0;
        int z = 0;
        p.product(x,y);
        p.product(x,y,z);
        p.product((double)x,(double)y);
    }
}