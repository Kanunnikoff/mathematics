/*
 * @(#)WoodNumbers.java        1.0 14.02.2013
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
 * В теории чисел число Вудала (Wn) — любое натуральное число вида W(n) = n × 2^n − 1 для некоторого натурального n.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 */
public class WoodNumbers {
    /**
     * Создаёт новый объект для рассчёта чисел Вудала.
     */
    private WoodNumbers() {
    }

    /**
     * Возвращает число Вудала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить число Вудала.
     * @return число Вудала под номером n.
     */
    public static long get(long n) {
        if(n <= 0)
            return -1;

        return n * (long) Math.pow(2, n) - 1;
    }
}
