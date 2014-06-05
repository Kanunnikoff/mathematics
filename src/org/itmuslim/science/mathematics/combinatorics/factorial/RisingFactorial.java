/*
 * @(#)RisingFactorial.java        1.0 14.02.2013
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

/**
 * Возрастающий факториал.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 * @since MathLib 1.0
 */
public class RisingFactorial {
    /**
     * Создаёт новый возрастающий факториал.
     */
    private RisingFactorial() {
    }

    /**
     * Возвращает значение возрастающего факториала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить возрастающий факториал.
     * @param k натуральное число.
     * @return значение возрастающего факториала.
     * @since MathLib 1.0
     */
    public static long value(long n, long k) {
        if(n < 0)
            return -1;

        return Factorial.value(n + k - 1) / Factorial.value(n - 1);
    }
}
