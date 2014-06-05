/*
 * @(#)EulerNumberType1.java        1.0 17.02.2013
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
package org.itmuslim.science.mathematics.combinatorics;

import org.itmuslim.science.mathematics.combinatorics.factorial.Factorial;

/**
 * В комбинаторике числом Эйлера I рода из n по k, называется количество перестановок порядка n с k подъёмами.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class EulerNumberTypeTriangle1 {
    /**
     * Создаёт новый объект треугольника чисел Эйлера первого рода.
     */
    private EulerNumberTypeTriangle1() {
    }

    /**
     * Возвращает элемент треугольника чисел Эйлера первого рода, находящийся в n-й строке и k-й диагонали.
     *
     * @param n номер строки.
     * @param k номер диагонали.
     * @return элемент треугольника чисел Эйлера первого рода.
     */
    public static long get(long n, long k) {
        long sum = 0;

        for (long i = 0; i <= k; i++)
            sum += Combination.value(n + 1, i, false) * Math.pow(k + 1 - i, n) * Math.pow(-1, i);

        return sum;
    }

    /**
     * Возвращает сумму элементов n-й строки.
     *
     * @param n номер строки.
     * @return сумма элементов.
     */
    public static long getSum(long n) {
        return Factorial.value(n);
    }
}
