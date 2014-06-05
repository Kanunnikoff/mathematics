/*
 * @(#)Primorial.java        1.0 14.02.2013
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
package org.itmuslim.science.mathematics.combinatorics.factorial;

import org.itmuslim.science.mathematics.numberstheory.prime.EratosthenesSieve;

/**
 * Праймориал или примориал (англ. primorial) числа n обозначается n# и определяется как произведение всех простых
 * чисел, не превышающих n.
 * Например, 11# = 12# = 2 · 3 · 5 · 7 · 11 = 2310.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 * @since MathLib 1.0
 */
public class Primorial {
    /**
     * Создаёт новый примориал.
     */
    private Primorial() {
    }

    /**
     * Возвращает значение примориала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить примориал.
     * @return значение примориала.
     * @since MathLib 1.0
     */
    public static long value(int n) {
        if(n < 0)
            return -1;

        long value = 1;
        long[] prime = EratosthenesSieve.prime(n);
        for (long p : prime)
            value *= p;

        return value;
    }
}
