/*
 * @(#)LineNumber.java        1.0 17.02.2013
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
 * Линейные числа — числа, не разлагающиеся на сомножители, то есть их ряд совпадает с рядом простых чисел, дополненным
 * единицей.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class LineNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта линейных чисел.
     */
    private LineNumber() {
    }

    /**
     * Возвращает линейное число для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить линейное число.
     * @return линейное число под номером n.
     */
    public static long get(long n) {
        long result = -1;
        long count = 0;

        for(long i = 1; true; i++) {
            if(isLine(i)) {
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
     * Возвращает признак линейности (прстоты) числа.
     *
     * @param n число для проверки на линейность.
     * @return true, если число линейное; false - в противном случае.
     */
    private static boolean isLine(long n) {
        for(long i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }
}
