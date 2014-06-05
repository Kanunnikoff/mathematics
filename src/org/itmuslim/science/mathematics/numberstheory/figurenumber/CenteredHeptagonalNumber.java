/*
 * @(#)CenteredHeptagonalNumber.java        1.0 17.02.2013
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
 * Центрированное семиугольное число — это центрированное фигурное число, которое представляет семиугольник с точкой в
 * середине и все окружающие точки лежат на семиугольных слоях.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CenteredHeptagonalNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта центрированных семиугольных чисел.
     */
    private CenteredHeptagonalNumber() {
    }

    /**
     * Возвращает центрированное семиугольное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить центрированное семиугольное число.
     * @return центрированное семиугольное число под номером n.
     */
    public static long get(long n) {
        return (7*n*n - 7*n + 2) / 2;
    }
}
