/*
 * @(#)FlatNumber.java        1.0 17.02.2013
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
package org.itmuslim.science.mathematics.numberstheory.figurenumber;

/**
 * Плоские числа — числа, представимые в виде произведения двух сомножителей, то есть составные.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class FlatNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта плоских чисел.
     */
    private FlatNumber() {
    }

    /**
     * Возвращает плоское число для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить плоское число.
     * @return плоское число под номером n.
     */
    public static long get(long n) {
        long result = -1;
        long count = 0;

        for(long i = 4; true; i++) {
            if(isFlat(i)) {
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
     * Возвращает признак плоскости числа.
     *
     * @param n число для проверки на плоскость.
     * @return true, если число плоское; false - в противном случае.
     */
    private static boolean isFlat(long n) {
        long count = 0;
        long m = n;

        while (m != 1) {
            for(long i = 2; i <= m; i++) {
                if(m % i == 0) {
                    if(i != n)
                        count++;
                    m = m / i;
                    break;
                }
            }
        }

        return count >= 2;
    }
}
