/*
 * @(#)PascalTriangle.java        1.0 11.02.2013
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
package org.itmuslim.science.mathematics.combinatorics;

/**
 * Треугольник Паскаля — бесконечная таблица биномиальных коэффициентов, имеющая треугольную форму. В этом треугольнике
 * на вершине и по бокам стоят единицы. Каждое число равно сумме двух расположенных над ним чисел. Строки треугольника
 * симметричны относительно вертикальной оси. Назван в честь Блеза Паскаля. Имеет применение в теории вероятностей.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 11.02.2013
 */
public class PascalTriangle {
    /**
     * Создаёт новый объект треугольника Паскаля.
     */
    private PascalTriangle() {
    }

    /**
     * Возвращает элемент треугольника Паскаля, находящийся в n-й строке и k-й диагонали.
     *
     * @param n номер строки.
     * @param k номер диагонали.
     * @return элемент треугольника Паскаля.
     */
    public static long get(long n, long k) {
        return Combination.value(n, k, false);
    }

    /**
     * Возвращает треугольное число n-й строки.
     *
     * @param n номер строки.
     * @return треугольное число.
     */
    public static long getTriangularNumber(long n) {
        return get(n, 2);
    }

    /**
     * Возвращает тетраэдическое число n-й строки.
     *
     * @param n номер строки.
     * @return тетраэдическое число.
     */
    public static long getTetrahedralNumber(long n) {
        return get(n, 3);
    }

    /**
     * Возвращает сумму элементов n-й строки.
     *
     * @param n номер строки.
     * @return сумма элементов.
     */
    public static long getSum(long n) {
        return (long) Math.pow(2, n);
    }
}
