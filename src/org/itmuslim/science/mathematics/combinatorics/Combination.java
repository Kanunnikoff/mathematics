/*
 * @(#)Combination.java        1.0 11.02.2013
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

import org.itmuslim.science.mathematics.combinatorics.factorial.Factorial;

/**
 * В комбинаторике сочетанием из n по k называется набор  элементов, выбранных из данного множества, содержащего
 * различных элементов. Наборы, отличающиеся только порядком следования элементов (но не составом), считаются
 * одинаковыми, этим сочетания отличаются от размещений.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 11.02.2013
 */
public class Combination {
    /**
     * Создаёт новое сочетание.
     */
    private Combination() {
    }

    /**
     * Возвращает число сочетаний из n по k.
     *
     * @param n количество элементов оригинального набора.
     * @param k количество элементов предполагаемых наборов.
     * @param repetitions признак сочетаний с повторениями.
     * @return число сочетаний.
     */
    public static long value(long n, long k, boolean repetitions) {
        if(repetitions)
            return Factorial.value(n + k - 1) / (Factorial.value(k) * Factorial.value(n - 1));
        else
            return Factorial.value(n) / (Factorial.value(k) * Factorial.value(n - k));
    }

    /**
     * Производящая функция.
     *
     * @param x аргумент.
     * @param n количество элементов оригинального набора.
     * @param repetitions признак сочетаний с повторениями.
     * @return значение.
     */
    public static double f(double x, long n, boolean repetitions) {
        if(repetitions)
            return Math.pow(1 - x, -n);
        else
            return Math.pow(1 + x, n);
    }

    /**
     * Двумерная производящая функция.
     *
     * @param x аргумент 1.
     * @param y аргумент 2.
     * @param repetitions признак сочетаний с повторениями.
     * @return значение.
     */
    public static double f2(double x, double y, boolean repetitions) {
        if(repetitions)
            return (1 - x) / (1 - x - y);
        else
            return 1 / (1 - y - x*y);
    }
}
