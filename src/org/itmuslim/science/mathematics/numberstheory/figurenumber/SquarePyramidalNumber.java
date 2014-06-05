/*
 * @(#)SquarePyramidalNumber.java        1.0 17.02.2013
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
 * В математике пирамида́льное число́ или квадра́тное пирамида́льное число́ — фигурное число, представляющее собой
 * количество сложенных сфер в пирамиде с квадратным основанием. Квадратные пирамидальные числа также выражают
 * количество квадратов в сетке N × N.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class SquarePyramidalNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта пирамидальных чисел.
     */
    private SquarePyramidalNumber() {
    }

    /**
     * Возвращает пирамидальное число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить пирамидальное число.
     * @return пирамидальное число под номером n.
     */
    public static long get(long n) {
        return n*(n + 1)*(2*n + 1) / 6;
    }
}
