/*
 * @(#)ProtNumbers.java        1.0 14.02.2013
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
package org.itmuslim.science.mathematics.numberstheory.prime;

/**
 * В теории чисел число Прота, названное в честь математика Франсуа Прота (англ.), представляет собой число вида
 * k * 2^n + 1, где k является нечётным положительным целым числом и n — положительное целое число, причём k < 2^n.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 */
public class ProtNumbers {
    /**
     * Создаёт новый объект для рассчёта чисел Прота.
     */
    private ProtNumbers() {
    }

    /**
     * Возвращает число Прота.
     *
     * @param n натуральное число.
     * @param k натуральное нечётное число.
     * @return число Прота.
     */
    public static long get(long n, long k) {
        if(n <= 0 || k <= 0 || k % 2 == 0 || k >= Math.pow(2, n))
            return -1;

        return k * (long) Math.pow(2, n) + 1;
    }
}
