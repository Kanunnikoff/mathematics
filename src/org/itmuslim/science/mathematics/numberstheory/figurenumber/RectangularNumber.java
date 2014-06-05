/*
 * @(#)RectangularNumber.java        1.0 17.02.2013
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
 * Прямоугольное число – это число, являющееся произведением двух последовательных целых чисел, то есть, n (n + 1).
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class RectangularNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта прямоугольных чисел.
     */
    private RectangularNumber() {
    }

    /**
     * Возвращает прямоугольное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить прямоугольное число.
     * @return прямоугольное число под номером n.
     */
    public static long get(long n) {
        return n * (n + 1);
    }
}
