/*
 * @(#)CenteredPentagonalNumber.java        1.0 17.02.2013
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
 * Центрированное пятиугольное число – это центрированное фигурное число, которое представляет пятиугольник, который
 * содержит точку в центре и все точки, окружающие центр лежат в пятиугольных слоях.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CenteredPentagonalNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта центрированных пятиугольных чисел.
     */
    private CenteredPentagonalNumber() {
    }

    /**
     * Возвращает центрированное пятиугольное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить центрированное пятиугольное число.
     * @return центрированное пятиугольное число под номером n.
     */
    public static long get(long n) {
        return (5*(n - 1)*(n - 1) + 5*(n - 1) + 2) / 2;
    }
}
