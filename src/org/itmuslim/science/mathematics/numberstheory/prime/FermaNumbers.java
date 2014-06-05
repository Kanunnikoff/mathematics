/*
 * @(#)FermaNumbers.java        1.0 14.02.2013
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
 * Числа Ферма — числа вида F(n)=2^(2^n) + 1, где n — неотрицательное целое число.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 */
public class FermaNumbers {
    /**
     * Создаёт новый объект для рассчёта чисел Ферма.
     */
    private FermaNumbers() {
    }

    /**
     * Возвращает число Ферма для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить число Ферма.
     * @return число Ферма под номером n.
     */
    public static long get(long n) {
        if(n < 0)
            return -1;

        return (long) Math.pow(2, Math.pow(2, n)) + 1;
    }
}
