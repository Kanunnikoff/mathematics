/*
 * @(#)MersenneNumbers.java        1.0 14.02.2013
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
 * Числа Мерсе́нна — числа вида M(n)=2^n - 1 , где n — натуральное число.
 * Названы в честь французского математика Марена Мерсенна.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 */
public class MersenneNumbers {
    /**
     * Создаёт новый объект для рассчёта чисел Мерсенна.
     */
    private MersenneNumbers() {
    }

    /**
     * Возвращает число Мерсенна для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить число Мерсенна.
     * @return число Мерсенна под номером n.
     */
    public static long get(long n) {
        if(n <= 0)
            return -1;

        return (long) Math.pow(2, n) - 1;
    }
}
