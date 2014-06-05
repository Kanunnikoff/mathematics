/*
 * @(#)GeometricProgression.java        1.0.0  22.01.13
 *
 * Copyright (c) 2013 Dmitry Tsechoev
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
package org.itmuslim.science.mathematics.algebra.numericalsequence.progression;

import org.itmuslim.science.mathematics.algebra.numericalsequence.NumericalSequence;

/**
 * Геометри́ческая прогре́ссия — последовательность чисел b1, b2, b3, ... (членов прогрессии), в которой каждое
 * последующее число, начиная со второго, получается из предыдущего умножением его на определённое число q
 * (знаменатель прогрессии), где b1 != 0, q != 0: b1, b2 = b1*q, b3 = b2*q, ..., b(n) = b(n-1)*q.
 *
 * @author Dmitry Tsechoev
 * @version 1.0.0
 */
public class GeometricProgression implements NumericalSequence {
    /**
     * Первый член.
     */
    private double b1;
    /**
     * Знаменатель.
     */
    private double q;

    /**
     * Создаёт новую геометрическую прогрессию.
     *
     * @see #GeometricProgression(double, double)
     */
    private GeometricProgression() {
    }

    /**
     * Создаёт новую геометрическую прогрессию с первым членом b1 и знаменателем q.
     *
     * @param b1 первый член.
     * @param q знаменатель.
     * @see #GeometricProgression()
     */
    private GeometricProgression(double b1, double q) {
        this.b1 = b1;
        this.q = q;
    }

    /**
     * Возвращает новую геометрическую прогрессию.
     *
     * @return новая прогрессия.
     * @see #create(double, double)
     */
    public static GeometricProgression create() {
        return new GeometricProgression();
    }

    /**
     * Возвращает новую геометрическую прогрессию с первым членом b1 и знаменателем q.
     *
     * @param b1 первый член.
     * @param q знаменатель.
     * @see #create()
     */
    public static GeometricProgression create(double b1, double q) {
        return new GeometricProgression(b1, q);
    }

    /**
     * Возвращает первый член последовательности.
     *
     * @return первый член.
     * @see #setB1(double)
     */
    public double getB1() {
        return b1;
    }

    /**
     * Устанавливает первый член последовательности.
     *
     * @param b1 первый член.
     * @see #getB1()
     */
    public void setB1(double b1) {
        this.b1 = b1;
    }

    /**
     * Возвращает знаменатель последовательности.
     *
     * @return знаменатель.
     * @see #setQ(double)
     */
    public double getQ() {
        return q;
    }

    /**
     * Устанавливает знаменатель последовательности.
     *
     * @param q знаменатель.
     * @see #getQ()
     */
    public void setQ(double q) {
        this.q = q;
    }

    /**
     * Возвращает n-й член геометрической прогрессии.
     *
     * @param n номер члена в числовой последовательности.
     * @return член прогрессии.
     */
    public double b(long n) {
        return b1 * Math.pow(q, n - 1);
    }

    /**
     * Возвращает произведение n-первых членов прогрессии.
     *
     * @param n количество первых членов прогрессии, участвующих в умножении.
     * @return произведение n-первых членов.
     * @see #b(long)
     */
    public double P(long n) {
        return Math.pow(b1 * b(n), n / 2);
    }

    /**
     * Возвращает произведение членов геометрической прогрессии начиная с k-ого члена, и заканчивая n-ым членом.
     *
     * @param k номер члена, с которого начинается умножение.
     * @param n номер члена, на котором завершается умножение.
     * @return произведение с k-того по n-й члены.
     * @see #b(long)
     */
    public double P(long k, long n) {
        return P(n) / P(k - 1);
    }

    /**
     * Возвращает сумму n-первых членов прогрессии.
     *
     * @param n количество первых членов прогрессии, участвующих в суммировании.
     * @return сумма n-первых членов.
     * @see #b(long)
     */
    @Override
    public double S(long n) {
        if(1 - 0.00000001 < q && q < 1 + 0.00000001)
            return n*b1;
        else
            return b1 * (1 - Math.pow(q, n)) / (1 - q);
    }

    /**
     * Возвращает предел числовой последователности (прогрессии).
     *
     * @return предел.
     */
    @Override
    public double lim() {
        if(1 - 0.00000001 < Math.abs(q) && Math.abs(q) < 1 + 0.00000001)
            return b1*q; //todo учёт знакочередования
        else if(Math.abs(q) < 1)
            return 0;
        else if(q > 1) {
            if(0 - 0.00000001 < b1 && b1 < 0 + 0.00000001)
                return 0;
            else if(b1 > 0)
                return Double.POSITIVE_INFINITY;
            else
                return Double.NEGATIVE_INFINITY;
        }
        else if(q < -1) {
            return Double.NaN;
        }

        return 0;
    }

    /**
     * Возвращает предел последователности частичных сумм.
     *
     * @return предел последователности частичных сумм.
     */
    @Override
    public double limSn() {
        return b1 / (1 - q);
    }
}
