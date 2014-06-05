/*
 * @(#)CatalanNumber.java        1.0 17.02.2013
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
 * Числа Катала́на — числовая последовательность, встречающаяся во многих задачах комбинаторики. Последовательность
 * названа в честь бельгийского математика Каталана, хотя была известна ещё Л. Эйлеру.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 17.02.2013
 */
public class CatalanNumber {
    /**
     * Создаёт новый объект для рассчёта чисел Каталана.
     */
    private CatalanNumber() {
    }

    /**
     * Возвращает n-е число Каталана.
     *
     * @param n целое неотрицательное число - индекс элемента в последовательности чисел Каталана.
     * @return n-е число Каталана.
     */
    public static long get(long n) {
        return Combination.value(2*n, n, false) / (n + 1);
    }

    /**
     * Производящая функция.
     *
     * @param x аргумент.
     * @return значение.
     */
    public static double f(double x) {
        return (1 - Math.sqrt(1 - 4*x)) / 2*x;
    }
}
