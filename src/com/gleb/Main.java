package com.gleb;
import static java.lang.Math.PI;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        double a=1.5,b=15.5;

        Function F1 = new Difference(new Pow(0.5,new Sum(new Pow(2,new Linear(1)),
                new Constant(b))),new Division(new Multiplication(new Pow(2,new Constant(b)),
                new Pow(3,new Sin(new Sum(new Linear(1),new Constant(a))))),
                new Linear(1)));
        Function F2 = new Difference(new Pow(2,new Cos(new Pow(3,new Linear(1)))),
                new Division(new Linear(1),new Pow(0.5,new Sum(new Pow(2,new Constant(a)),
                new Pow(2,new Constant(b))))));
        System.out.println("f1="+F1.calculate(2.8));
        System.out.println("f1="+F1.derivative().calculate(2.8));
        System.out.println("f2="+F2.calculate(2.8));
        System.out.println("f2="+F2.derivative().calculate(2.8));
    }
}
