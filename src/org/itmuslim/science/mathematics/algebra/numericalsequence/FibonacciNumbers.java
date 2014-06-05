/*
 * @(#)Fibonacci.java     1.0.0  23.01.13
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
package org.itmuslim.science.mathematics.algebra.numericalsequence;

/**
 * Чи́сла Фибона́ччи — элементы числовой последовательности
 *    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * или, наоборот,
 *    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 * По определению, первые две цифры в последовательности Фибоначчи 0 и 1 (или альтернативно, 1 и 1), и каждое
 * последующее число равно сумме двух предыдущих чисел.
 *
 * @author Dmitry Tsechoev
 * @version 1.0.0
 */
public class FibonacciNumbers implements NumericalSequence {
    private int f1;

    /**
     * Создаёт последовательность.
     *
     * @see #FibonacciNumbers(int)
     */
    private FibonacciNumbers() {
    }

    /**
     * Создаёт последовательность с первым членом f1.
     *
     * @param f1 первый член.
     * @see #FibonacciNumbers()
     */
    private FibonacciNumbers(int f1) {
        this.f1 = f1;
    }

    /**
     * Возвращает новую последовательность.
     *
     * @return новая последовательность.
     * @see #create(int)
     */
    public static FibonacciNumbers create() {
        return new FibonacciNumbers();
    }

    /**
     * Возвращает новую последовательность с первым членом f1.
     *
     * @param f1 первый член.
     * @return новая последовательность.
     * @see #create()
     */
    public static FibonacciNumbers create(int f1) {
        return new FibonacciNumbers(f1);
    }

    /**
     * Возвращает первый член.
     *
     * @return первый член.
     * @see #setF1(int)
     */
    public int getF1() {
        return f1;
    }

    /**
     * Устанавливает первый член.
     *
     * @param f1 первый член.
     * @see #getF1()
     */
    public void setF1(int f1) {
        this.f1 = f1;
    }

    /**
     * Возвращает n-й член последователности чисел Фибоначчи.
     *
     * @param n номер члена.
     * @return n-й член последователности.
     */
    public long F(long n) {
        if(n == 1) return f1;
        else if(n == 2) return 1;
        else return F(n - 1) + F(n - 2);
    }

    /**
     * Возвращает сумму n-первых членов последовательности.
     *
     * @param n количество первых членов последовательности, участвующих в суммировании.
     * @return сумма n-первых членов.
     * @see #F(long)
     */
    @Override
    public double S(long n) {
        double sum = 0.0;

        for(long m = 1; m <= n; m++)
            sum += F(m);

        return sum;
    }

    /**
     * Возвращает предел числовой последователности.
     *
     * @return предел.
     */
    @Override
    public double lim() {
        return Double.POSITIVE_INFINITY;
    }

    /**
     * Возвращает предел последователности частичных сумм.
     *
     * @return предел последователности частичных сумм.
     */
    @Override
    public double limSn() {
        return Double.POSITIVE_INFINITY;
    }
}
