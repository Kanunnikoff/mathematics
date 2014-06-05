/*
 * @(#)Equation.java     1.0.0  31.01.13
 *
 * Copyright (c) 2013 Dmitry Tsechoev.
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
package org.itmuslim.science.mathematics.algebra.numericalmethod.equation;

/**
 * Уравнение.
 *
 * @author Dmitry Tsechoev 31.01.13 16:17
 * @version 1.0.0
 * @since MathLib 1.0
 */
public class Equation {
    public enum Method {
        /**
         * Метод хорд.
         */
        CHORD_METHOD,
        /**
         * Метод касательных.
         */
        TANGENTS_METHOD,
        /**
         * Метод деления отрезка пополам (бисекция).
         */
        BISECTION_METHOD
    }

    /**
     * Степень уравнения.
     */
    private int n;
    /**
     * Набор коэффициентов уравнения.
     */
    private double[] c;

    /**
     * Возвращает степень уравнения.
     *
     * @return степень.
     * @see #setN(int)
     * @since MathLib 1.0
     */
    public int getN() {
        return n;
    }

    /**
     * Устанавливает степень уравнения.
     *
     * @param n степень уравнения.
     * @see #getN()
     * @since MathLib 1.0
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Возвращает набор коэффициентов.
     *
     * @return коэффициенты.
     * @see #setC(double[])
     * @since MathLib 1.0
     */
    public double[] getC() {
        return c;
    }

    /**
     * Устанавливает набор коэффициентов.
     *
     * @param c коэффициенты.
     * @see #getC()
     * @since MathLib 1.0
     */
    public void setC(double[] c) {
        this.c = c;
    }

    /**
     * Создаёт новое уравнение.
     * @see #Equation(int, double[])
     * @since MathLib 1.0
     */
    private Equation() {
    }

    /**
     * Создаёт новое уравнение.
     *
     * @param n размерность.
     * @param c коэффициенты.
     * @see #Equation()
     * @since MathLib 1.0
     */
    private Equation(int n, double[] c) {
        this.n = n;
        this.c = c;
    }

    /**
     * Возвращает новое уравнение.
     *
     * @return новое уравнение.
     * @see #create(int, double[])
     * @since MathLib 1.0
     */
    public static Equation create() {
        return new Equation();
    }

    /**
     * Возвращает новое уравнение.
     *
     * @param n размерность.
     * @param с коэффициенты.
     * @return новое уравнение.
     * @see #create()
     * @since MathLib 1.0
     */
    public static Equation create(int n, double[] с) {
        return new Equation(n, с);
    }

    /**
     * Возвращает значение функции f(x) из уравнения f(x)=0.
     *
     * @param x значение аргумента.
     * @return значение функции.
     * @since MathLib 1.0
     */
    public double f(double x) {
        double result = 0.0;

        for(int i = n; i >= 0; i--)
            result += c[n - i]*Math.pow(x, i);

        return result;
    }

    /**
     * Возвращает значение функции f'(x).
     *
     * @param x значение аргумента.
     * @return значение функции.
     * @since MathLib 1.0
     */
    public double df(double x) {
        double result = 0.0;

        for(int i = n; i > 0; i--)
            result += c[n - i] * (i - 1) * Math.pow(x, i - 1);

        return result;
    }

    /**
     * Возвращает объект, содержащий в себе корень уравнения (если он существует), признак его существования и
     * количество итераций.
     *
     * @param a левая граница отрезка, на котором предполагается найти корень.
     * @param b правая граница отрезка, на котором предполагается найти корень.
     * @param method численный метод для нахождения корня.
     * @param e требуемая точность.
     * @return объект, содержащий в себе корень уравнения.
     * @see Root
     * @since MathLib 1.0
     */
    public Root root(double a, double b, Method method, double e) {
        switch (method) {
            case CHORD_METHOD     : return chordMethod(a, b, e);
            case TANGENTS_METHOD  : return tangentsMethod(a, b, e);
            case BISECTION_METHOD : return bisectionMethod(a, b, e);
            default               : return new Root();
        }
    }

    /**
     * Возвращает объект, содержащий в себе корень уравнения (если он существует), признак его существования и
     * количество итераций.
     *
     * Метод хорд  — итерационный численный метод приближённого нахождения корня алгебраического уравнения.
     *
     * @param a левая граница отрезка.
     * @param b правая граница отрезка.
     * @param e точность.
     * @return объект типа Root.
     * @see #f(double)
     * @see Root
     * @since MathLib 1.0
     */
    private Root chordMethod(double a, double b, double e) {
        if(f(a) * f(b) < 0) {
            int iterationsCount = 0;

            while(Math.abs(b - a) > e) {
                a = b - (b - a) * f(b) / (f(b) - f(a));
                b = a - (a - b) * f(a) / (f(a) - f(b));
                iterationsCount++;
            }

            return new Root(b, true, iterationsCount);
        } else {
            return new Root();
        }
    }

    /**
     * Возвращает объект, содержащий в себе корень уравнения (если он существует), признак его существования и
     * количество итераций.
     *
     * Метод Ньютона, алгоритм Ньютона (также известный как метод касательных) — это итерационный численный метод
     * нахождения корня (нуля) заданной функции.
     *
     * @param a левая граница отрезка.
     * @param b правая граница отрезка.
     * @param e точность.
     * @return объект типа Root.
     * @see #f(double)
     * @see Root
     * @since MathLib 1.0
     */
    private Root tangentsMethod(double a, double b, double e) {
        if(f(a) * f(b) < 0) {
            int iterationsCount = 0;
            double root = (a + b) / 2;
            while(Math.abs(f(root)) > e) {
                root = root - f(root) / df(root);
                iterationsCount++;
            }

            return new Root(root, true, iterationsCount);
        } else {
            return new Root();
        }
    }

    /**
     * Возвращает объект, содержащий в себе корень уравнения (если он существует), признак его существования и
     * количество итераций.
     *
     * Метод бисекции или метод деления отрезка пополам — простейший численный метод для решения нелинейных уравнений
     * вида f(x)=0. Предполагается только непрерывность функции f(x). Поиск основывается на теореме о промежуточных
     * значениях.
     *
     * @param a левая граница отрезка.
     * @param b правая граница отрезка.
     * @param e точность.
     * @return объект типа Root.
     * @see #f(double)
     * @see Root
     * @since MathLib 1.0
     */
    private Root bisectionMethod(double a, double b, double e) {
        if(Math.abs(f(a)) < e) {
            return new Root(a, true);
        } else if(Math.abs(f(b)) < e) {
            return new Root(b, true);
        } else if(f(a) * f(b) < 0) {
            double root = (a + b) / 2;
            int iterationsCount = 1;
            while(Math.abs(f(root)) > e) {
                if(f(a) * f(root) < 0) {
                    b = root;
                } else if(f(root) * f(b) < 0) {
                    a = root;
                }

                root = (a + b) / 2;
                iterationsCount++;
            }

            return new Root(root, true, iterationsCount);
        } else {
            return new Root();
        }
    }
}
