/*
 * @(#)CenteredHexagonalNumber.java        1.0 17.02.2013
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
 * Центрированные шестиугольные числа – это центрированные фигурные числа, которые представляют шестиугольник с точкой
 * в центре и все остальные окружающие точки находятся в шестиугольной решётке.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CenteredHexagonalNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта центрированных шестиугольных чисел.
     */
    private CenteredHexagonalNumber() {
    }

    /**
     * Возвращает центрированное шестиугольное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить центрированное шестиугольное число.
     * @return центрированное шестиугольное число под номером n.
     */
    public static long get(long n) {
        return n*n*n - (n - 1)*(n - 1)*(n - 1);
    }
}
