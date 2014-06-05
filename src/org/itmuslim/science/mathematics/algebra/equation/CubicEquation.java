/*
 * @(#)CubicEquation.java   1.0       21.01.2012 22:11
 * Copyright (c) 2012 Dmitry Tsechoev.
 * Moscow, Russia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dmitry Tsechoev. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Dmitry.
 *
 * Би-сми-Лляхи-р-рахмани-р-рахим...
 */
package org.itmuslim.science.mathematics.algebra.equation;

import java.util.ArrayList;
import java.util.List;

/**
 * Class description...
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0       21.01.2012
 */
public class CubicEquation implements Equation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double p;
    private double q;
    private boolean canonical;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public boolean isCanonical() {
        return canonical;
    }

    public CubicEquation() {
    }

    public CubicEquation(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public CubicEquation(double p, double q) {
        this.p = p;
        this.q = q;
        this.canonical = true;
    }

    public List<Double> solve() { // TODO
        List<String> result = new ArrayList<String>();

//        if(S() <= 0) throw new NoRealRootsEquationException("no real roots for cubic equation");

        String x1 = "", x2 = "", x3 = "";
        double phi;

        if(-0.0000001 < S() && S() < 0.0000001) {
            x1 = (-2 * Math.signum(R()) * Math.sqrt(Q()) - a / 3) + "";
            x2 = (Math.signum(R()) * Math.sqrt(Q()) - a / 3) + "";
            x3 = (Math.signum(R()) * Math.sqrt(Q()) - a / 3) + "";
        } else if(S() > 0) {
            phi = (1 / 3) * Math.acos(R() / Math.sqrt(Math.pow(Q(), 3)));
            x1 = (-2 * Math.sqrt(Q()) * Math.cos(phi) - a / 3) + "";
            x2 = (-2 * Math.sqrt(Q()) * Math.cos(phi + 2 * Math.PI / 3) - a / 3) + "";
            x3 = (-2 * Math.sqrt(Q()) * Math.cos(phi - 2 * Math.PI / 3) - a / 3) + "";
        } else if(S() < 0) {
            if(Q() > 0) {
                phi = (1 / 3) * Arch(Math.abs(R()) / Math.sqrt(Math.pow(Q(), 3)));
                x1 = (-2 * Math.signum(R()) * Math.sqrt(Q()) * Math.cosh(phi) - a / 3) + "";
                x2 = (Math.signum(R()) * Math.sqrt(Q()) * Math.cosh(phi) - a / 3) + " + i" + (Math.sqrt(3) * Math.sqrt(Q()) * Math.sinh(phi));
                x3 = (Math.signum(R()) * Math.sqrt(Q()) * Math.cosh(phi) - a / 3) + " - i" + (Math.sqrt(3) * Math.sqrt(Q()) * Math.sinh(phi));
            } else if(Q() < 0) {
                phi = (1 / 3) * Arsh(Math.abs(R()) / Math.sqrt(Math.abs(Math.pow(Q(), 3))));
                x1 = (-2 * Math.signum(R()) * Math.sqrt(Math.abs(Q())) * Math.sinh(phi) - a / 3) + "";
                x2 = (Math.signum(R()) * Math.sqrt(Math.abs(Q())) * Math.sinh(phi) - a / 3) + " + i" + (Math.sqrt(3) * Math.sqrt(Math.abs(Q())) * Math.cosh(phi));
                x3 = (Math.signum(R()) * Math.sqrt(Math.abs(Q())) * Math.sinh(phi) - a / 3) + " - i" + (Math.sqrt(3) * Math.sqrt(Math.abs(Q())) * Math.cosh(phi));
            }
        }

        result.add(x1);
        result.add(x2);
        result.add(x3);

//        result.add(x(y1()));
//        result.add(x(y2()));
//        result.add(x(y3()));

        return null;
    }

    /**
     * Возвращает результат вычисления значения функции f(x) = a*x<sup>3</sup> + b*x<sup>2</sup> + c*x + d.
     *
     * @param x значение аргумента.
     * @return значение функции.
     */
    @Override
    public double f(double x) {
        return a*Math.pow(x, 3) + b*Math.pow(x, 2) + c*x + d;
    }

//    private double p() {
//        return (3 * A * C - Math.pow(B, 2)) / (3 * Math.pow(A, 2));
//    }
//
//    private double q() {
//        return (2 * Math.pow(B, 3) - 9 * A * B * C + 27 * Math.pow(A, 2) * D) / (27 * Math.pow(A, 3));
//    }

    private double Q() {
        return (Math.pow(a, 2) - 3 * b) / 9;
    }

    private double R() {
        return (2 * Math.pow(a, 3) - 9 * a * b  + 27 * c) / 54;
    }

    private double S() {
        return Math.pow(Q(), 3) - Math.pow(R(), 2);
    }

    private double Arch(double x) {
        return Math.log(x + Math.sqrt(Math.pow(x, 2) - 1));
    }

    private double Arsh(double x) {
        return Math.log(x + Math.sqrt(Math.pow(x, 2) + 1));
    }

//    private double Discriminant() {
//        return Math.pow(q(), 2) / 4 + Math.pow(p(), 3) / 27;
//    }

//    private double F() {
//        return Math.atan(Math.abs(Math.sqrt(-Math.pow(q(), 2) / 4 + Math.pow(p(), 3) / 27) / (-q() / 2)));
//    }
//
//    private double y1() {
//        return 2 * Math.sqrt(-p() / 3) * Math.cos(F() / 3);
//    }
//
//    private double y2() {
//        return 2 * Math.sqrt(-p() / 3) * Math.cos(F() / 3) + (2 * Math.PI) / 3;
//    }
//
//    private double y3() {
//        return 2 * Math.sqrt(-p() / 3) * Math.cos(F() / 3) + (4 * Math.PI) / 3;
//    }

//    private double x(double y) {
//        return y - B / (3 * A);
//    }
}
