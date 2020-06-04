package com.gleb;
import static java.lang.Math.*;
import java.util.Date;
import java.util.*;

public class L1 {

    private double calcy(double t, double a, double b) {

        return pow(E,-b*t)*sin(a*t+b)-sqrt(abs(b*t+a));

    }
    private double calcz(double t, double a, double b) {


        return b*sin(a*Math.pow(t,2)*cos(2*t))-1;

    }
    private void print(double z, double y) {
        System.out.println("z="+z);
        System.out.println("y="+y);
    }
    public void run() {
        System.out.println("Введите числа: ");
        Scanner s = new Scanner(System.in);
        double t = s.nextDouble();
        double a = s.nextDouble();
        double b = s.nextDouble();


        double y = calcy(t,a,b);
        double z = calcz(t,a,b);
        print(z,y);
    }

}

