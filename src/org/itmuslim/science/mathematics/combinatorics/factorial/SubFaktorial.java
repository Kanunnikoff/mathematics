/*
 * @(#)Subfaktorial.java        1.0 11.02.2013
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
 * Субфакториал числа n (обозначение: !n) определяется как количество беспорядков порядка n, то есть перестановок
 * порядка n без неподвижных точек. Название субфакториал происходит из аналогии с факториалом, определяющим общее
 * количество перестановок.
 *
 * В частности, !n есть число способов положить n писем в n конвертов (по одному в каждый), чтобы ни одно не попало
 * в соответствующий конверт (т. н. Задача о письмах).
 *
 * @author Dmitry Tsechoev
 * @version 1.0 11.02.2013
 * @since MathLib 1.0
 */
public class SubFaktorial {
    /**
     * Создаёт новый субфакториал.
     */
    private SubFaktorial() {
    }

    /**
     * Возвращает значение субфакториала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить субфакториал.
     * @return значение субфакториала.
     * @since MathLib 1.0
     */
    public static long value(long n) {
        if(n < 0)
            return -1;

        long summ = 0;
        long nFactorial = Factorial.value(n);

        for (long k = 0; k <= n; k++) {
            summ += Math.pow(-1, k) * (nFactorial / Factorial.value(k));
        }

        return summ;
    }
}
