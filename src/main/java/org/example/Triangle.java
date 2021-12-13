package org.example;

public class Triangle {

        private double a;
        private double b;
        private double c;


        public double squareTriangle(double a, double b, double c){

                Triangle t = new Triangle();
                System.out.println(t.squareTriangle(3, 4, 5));

                if ((a<=0) || (b<=0) || (c<=0)){
                        throw new ArithmeticException("Введены некорректные данные");
                } if((a+b) <= c || (b+c) <= a || (a+c) <= b){
                        throw new ArithmeticException("Это не треугольник");
                }
                double p = (a + b + c)/2;
                return (p*(p - a)*(p - b)*(p - c));
        }


}
