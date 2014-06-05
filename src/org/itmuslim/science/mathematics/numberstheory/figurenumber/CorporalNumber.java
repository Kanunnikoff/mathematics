/*
 * @(#)CorporalNumber.java        1.0 17.02.2013
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
 * Телесные числа — числа, представимые произведением трёх сомножителей.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CorporalNumber {
    /**
     * Создаёт новый объект для рассчёта телесных чисел.
     */
    private CorporalNumber() {
    }

    /**
     * Возвращает телесное число для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить телесное число.
     * @return телесное число под номером n.
     */
    public static long get(long n) {
        long result = -1;
        long count = 0;

        for(long i = 8; true; i++) {
            if(isCorporal(i)) {
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
     * Возвращает признак телесности числа.
     *
     * @param n число для проверки на телесность.
     * @return true, если число телесное; false - в противном случае.
     */
    private static boolean isCorporal(long n) {
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

        return count >= 3;
    }
}
