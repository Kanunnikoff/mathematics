/*
 * @(#)TetrahedralNumber.java        1.0 17.02.2013
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
 * Тетраэдрические числа — это фигурные числа, которые представляют пирамиду, в основании которой лежит треугольник.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class TetrahedralNumber implements FigureNumber {
    /**
     * Создаёт новый объект для рассчёта тетраэдрических чисел.
     */
    private TetrahedralNumber() {
    }

    /**
     * Возвращает тетраэдрическое число для целочисленного значения n.
     *
     * @param n натуральное число (n>=1), для которого требуется вычислить тетраэдрическое число.
     * @return тетраэдрическое число под номером n.
     */
    public static long get(long n) {
        return n*(n - 1)*(n - 2) / 6;
    }
}
