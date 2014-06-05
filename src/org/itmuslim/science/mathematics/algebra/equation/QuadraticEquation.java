/*
 * @(#)QuadraticEquation.java   1.0.0       22.01.2012 12:34
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
 * @author Dmitry Tsechoev
 * @version 1.0.0
 * @since 1.0.0
 */
public class QuadraticEquation implements Equation {
    private double a;
    private double b;
    private double c;

    /**
     * Возвращает первый коэффициент.
     *
     * @return первый коэффициент.
     * @see #setA(double)
     */
    public double getA() {
        return a;
    }

    /**
     * Устанавливает первый коэффициент.
     *
     * @param a первый коэффициент.
     * @see #getA()
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Возвращает второй коэффициент.
     *
     * @return второй коэффициент.
     * @see #setB(double)
     */
    public double getB() {
        return b;
    }

    /**
     * Устанавливает второй коэффициент.
     *
     * @param b второй коэффициент.
     * @see #getB()
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Возвращает третий коэффициент.
     *
     * @return третий коэффициент.
     * @see #setC(double)
     */
    public double getC() {
        return c;
    }

    /**
     * Устанавливает третий коэффициент.
     *
     * @param c третий коэффициент.
     * @see #getC()
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Создаёт новое квадратное уравнение.
     *
     * @see #QuadraticEquation(double, double, double)
     */
    private QuadraticEquation() {
    }

    /**
     * Создаёт новое квадратное уравнение.
     *
     * @param a первый коэффициент.
     * @param b второй коэффициент.
     * @param c третий коэффициент.
     * @see #QuadraticEquation()
     */
    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Возвращает новое квадратное уравнение.
     *
     * @return новое квадратное уравнение.
     * @see #create(double, double, double)
     */
    public static QuadraticEquation create() {
        return new QuadraticEquation();
    }

    /**
     * Возвращает новое квадратное уравнение.
     *
     * @param a первый коэффициент.
     * @param b второй коэффициент.
     * @param c третий коэффициент.
     * @return новое квадратное уравнение.
     * @see #create()
     */
    public static QuadraticEquation create(double a, double b, double c) {
        return new QuadraticEquation(a, b, c);
    }

    /**
     * Возвращает результат решения уравнения.
     *
     * @return список корней уравнения.
     * @see #D()
     */
    public List<Double> solve() {
        List<Double> result = new ArrayList<Double>();

        double D = D();
        if (-0.0000001 < D && D < 0.0000001) {
            result.add(-b / (2*a));
        } else if (D > 0) {
            result.add((-b + Math.sqrt(D)) / (2*a));
            result.add((-b - Math.sqrt(D)) / (2*a));
        }

        return result;
    }

    /**
     * Возвращает дискриминант.
     *
     * @return дискриминант.
     */
    protected double D() {
        return Math.pow(b, 2) - 4*a*c;
    }

    /**
     * Возвращает результат вычисления значения функции f(x) = a*x<sup>2</sup> + b*x + c.
     *
     * @param x значение аргумента.
     * @return значение функции.
     */
    public double f(double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }
}
