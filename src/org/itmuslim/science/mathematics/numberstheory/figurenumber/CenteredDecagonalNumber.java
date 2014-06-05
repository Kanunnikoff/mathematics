/*
 * @(#)CenteredDecagonalNumber.java        1.0 17.02.2013
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
 * Центрированное десятиугольное число — это центрированное фигурное число, которое представляет десятиугольник с
 * точкой в середине и все окружающие точки лежат на десятиугольных слоях.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CenteredDecagonalNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта центрированных десятиугольных чисел.
     */
    private CenteredDecagonalNumber() {
    }

    /**
     * Возвращает центрированное десятиугольное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить центрированное десятиугольное число.
     * @return центрированное десятиугольное число под номером n.
     */
    public static long get(long n) {
        return 5 * (n*n - n) + 1;
    }
}
