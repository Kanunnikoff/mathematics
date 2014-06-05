/*
 * @(#)CentralBinomialCoefficient.java        1.0 21.02.2013
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
 * В математике n-й центральный биномиальный коэффициент определяется следующим выражением в терминах биномиальных
 * коэффициентов:
 * C(2n)(n) = (2n)! / (n!)^2
 *
 * @author Dmitry Tsechoev
 * @version 1.0 21.02.2013
 */
public class CentralBinomialCoefficient {
    /**
     * Создаёт новый объект для рассчёта центральных биномиальных коэффициентов.
     */
    private CentralBinomialCoefficient() {
    }

    /**
     * Возвращает n-е число в последовательноти центральных биномиальных коэффициентов.
     *
     * @param n целое неотрицательное число - индекс элемента в последовательности центральных биномиальных коэффициентов.
     * @return n-е число в последовательности центральных биномиальных коэффициентов.
     */
    public static long get(long n) {
        return Factorial.value(2*n) / (long) Math.pow(Factorial.value(n), 2);
    }

    /**
     * Производящая функция.
     *
     * @param x аргумент.
     * @return значение.
     */
    public static double f(double x) {
        return 1 / Math.sqrt(1 - 4*x);
    }
}
