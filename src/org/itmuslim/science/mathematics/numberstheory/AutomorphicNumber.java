/*
 * @(#)AutomorphicNumber.java        1.0 17.02.2013
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
package org.itmuslim.science.mathematics.numberstheory;

import org.itmuslim.science.mathematics.algebra.numericalsequence.NumericalSequence;

/**
 * Автоморфное число — число, десятичная запись квадрата которого оканчивается цифрами самого этого числа.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class AutomorphicNumber implements NumericalSequence {
    /**
     * Создаёт новый объект для рассчёта автоморфных чисел.
     */
    private AutomorphicNumber() {
    }

    /**
     * Возвращает автоморфное число для целочисленного значения n.
     *
     * @param n целое неотрицательное число (n>=0), для которого требуется вычислить автоморфное число.
     * @return автоморфное число под номером n.
     */
    public static long get(long n) {
        long limit = (long) Math.sqrt(Long.MAX_VALUE);
        long result = -1;
        long count = 0;

        for(long i = 0; i <= limit; i++) {
            if(Long.toString(i * i).endsWith(Long.toString(i))) {
                count++;
                if(count == n) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }

    /**
     * Возвращает сумму n-первых членов последовательности.
     *
     * @param n количество первых членов последовательности, участвующих в суммировании.
     * @return сумма n-первых членов.
     */
    @Override
    public double S(long n) {
        return -1;
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
