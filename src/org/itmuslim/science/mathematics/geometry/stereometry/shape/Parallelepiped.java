/*
 * @(#)Parallelepiped.java     1.0  12.09.2012
 *
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
package org.itmuslim.science.mathematics.geometry.stereometry.shape;

/**
 * Параллелепи́пед (от греч. παράλλος — параллельный и греч. επιπεδον — плоскость) — призма, основанием которой
 * служит параллелограмм, или (равносильно) многогранник, у которого шесть граней и каждая из них параллелограмм.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  12.09.2012
 */
public class Parallelepiped implements Shape {

    protected double a;
    protected double b;
    protected double c;
    private double h;

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

    public double getHeight() {
        return h;
    }

    public void setHeight(double h) {
        this.h = h;
    }

    protected Parallelepiped() {
    }

    protected Parallelepiped(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Parallelepiped(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public static Parallelepiped create() {
        return new Parallelepiped();
    }

    public static Parallelepiped create(double a, double b, double c) {
        return new Parallelepiped(a, b, c);
    }

    public static Parallelepiped create(double a, double b, double c, double h) {
        return new Parallelepiped(a, b, c, h);
    }

    public double lateralSurfaceSquare() {
        return (2*a + 2 * b) * h;
    }

    private double footprint(double h) {
        return 0.0;  //TODO
    }

    public double totalSurfaceSquare() {
        return lateralSurfaceSquare() + 2;  //TODO
    }

    public double volume() {
        return h;  //TODO
    }
}
