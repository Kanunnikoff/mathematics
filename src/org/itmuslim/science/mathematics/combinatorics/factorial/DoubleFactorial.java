/*
 * @(#)DoubleFactorial.java        1.0 11.02.2013
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
 * Двойной факториал числа n обозначается n!! и определяется как произведение всех натуральных чисел в отрезке [1,n],
 * имеющих ту же чётность что и n.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 11.02.2013
 * @since MathLib 1.0
 */
public class DoubleFactorial {
    /**
     * Создаёт новый двойной факториал.
     */
    private DoubleFactorial() {
    }

    /**
     * Возвращает значение двойного факториала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить двойной факториал.
     * @return значение двойного факториала.
     * @since MathLib 1.0
     */
    public static long value(long n) {
        if(n < 0)
            return -1;

        if(n == 0 || n == 1)
            return 1;

        if(n % 2 == 0) {
            long k = n / 2;
            return (long) Math.pow(2, k) * Factorial.value(k);
        }
        else {
            long k = (n - 1) / 2;
            return Factorial.value(n) / ((long) Math.pow(2, k) * Factorial.value(k));
        }
    }
}
