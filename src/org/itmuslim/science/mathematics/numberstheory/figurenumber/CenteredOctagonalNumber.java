/*
 * @(#)CenteredOctagonalNumber.java        1.0 17.02.2013
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
 * Центрированное восьмиугольное число – это центрированное фигурное число, которое представляет восьмиугольник с точкой
 * в середине и все окружающие точки лежат на восьмиугольных слоях.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CenteredOctagonalNumber {
    /**
     * Создаёт новый объект для рассчёта центрированных восьмиугольных чисел.
     */
    private CenteredOctagonalNumber() {
    }

    /**
     * Возвращает центрированное восьмиугольное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить центрированное восьмиугольное число.
     * @return центрированное восьмиугольное число под номером n.
     */
    public static long get(long n) {
        return (long) Math.pow(2*n - 1, 2);
    }
}
