/*
 * @(#)ArithmeticalProgression.java     1.0.0  22.01.13
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
 * Арифмети́ческая прогре́ссия — числовая последовательность вида a1, a1 + d, a1 + 2d, ..., a1 + (n - 1)d, ...
 * то есть последовательность чисел (членов прогрессии), каждое из которых, начиная со второго, получается из
 * предыдущего добавлением к нему постоянного числа (шага или разности прогрессии): a(n) = a(n-1) + d.
 *
 * @author Dmitry Tsechoev
 * @version 1.0.0
 */
public class ArithmeticalProgression implements NumericalSequence {
    /**
     * Первый член.
     */
    private double a1;
    /**
     * Разность.
     */
    private double d;

    /**
     * Создаёт новую арифметическую прогрессию.
     *
     * @see #ArithmeticalProgression(double, double)
     */
    private ArithmeticalProgression() {
    }

    /**
     * Создаёт новую арифметическую прогрессию с первым членом a1 иразностью d.
     *
     * @param a1 первый член.
     * @param d разность.
     * @see #ArithmeticalProgression()
     */
    private ArithmeticalProgression(double a1, double d) {
        this.a1 = a1;
        this.d = d;
    }

    /**
     * Возвращает новую арифметическую прогрессию.
     *
     * @see #create(double, double)
     */
    public static ArithmeticalProgression create() {
        return new ArithmeticalProgression();
    }

    /**
     * Возвращает новую арифметическую прогрессию с первым членом a1 иразностью d.
     *
     * @param a1 первый член.
     * @param d разность.
     * @see #create()
     */
    public static ArithmeticalProgression create(double a1, double d) {
        return new ArithmeticalProgression(a1, d);
    }

    /**
     * Возвращает первый член.
     *
     * @return первый член.
     * @see #setA1(double)
     */
    public double getA1() {
        return a1;
    }

    /**
     * Устанавливает первый член.
     *
     * @param a1 первый член.
     * @see #getA1()
     */
    public void setA1(double a1) {
        this.a1 = a1;
    }

    /**
     * Возвращает разность прогрессии.
     *
     * @return разность прогрессии.
     * @see #setD(double)
     */
    public double getD() {
        return d;
    }

    /**
     * Устанавливает разность прогрессии.
     *
     * @param d разность прогрессии.
     * @see #getD()
     */
    public void setD(double d) {
        this.d = d;
    }

    /**
     * Возвращает n-й член арифметической прогрессии.
     *
     * @param n номер члена в числовой последовательности.
     * @return член прогрессии.
     */
    public double a(long n) {
        return a1 + (n - 1)*d;
    }

    /**
     * Возвращает сумму n-первых членов прогрессии.
     *
     * @param n количество первых членов прогрессии, участвующих в суммировании.
     * @return сумма n-первых членов.
     * @see #a(long)
     */
    @Override
    public double S(long n) {
        return (a1 + a(n)) * n / 2;
    }

    /**
     * Возвращает предел числовой последователности (прогрессии).
     *
     * @return предел.
     */
    @Override
    public double lim() {
        if(0 - 0.00000001 < d && d < 0 + 0.00000001)
            return a1;
        if(d > 0)
            return Double.POSITIVE_INFINITY;
        else
            return Double.NEGATIVE_INFINITY;
    }

    /**
     * Возвращает предел последователности частичных сумм.
     *
     * @return предел последователности частичных сумм.
     */
    @Override
    public double limSn() {
        if(0 - 0.00000001 < d && d < 0 + 0.00000001)
            return Double.POSITIVE_INFINITY;
        if(d > 0)
            return Double.POSITIVE_INFINITY;
        else
            return Double.NEGATIVE_INFINITY;
    }
}
