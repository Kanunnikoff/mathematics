/*
 * @(#)Equation.java   1.0       21.01.2012 22:22
 * Copyright (c) 2012 Dmitry Tsechoev.
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
package org.itmuslim.science.mathematics.algebra.equation;

import java.util.List;

/**
 * Линейное алгебраическое уравнение n-й степени.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0       21.01.2012
 */
public interface Equation {
    /**
     * Возвращает результат решения уравнения.
     *
     * @return список корней уравнения.
     */
    List<Double> solve();

    /**
     * Возвращает результат вычисления значения функции f(x) = a<inf>n</inf>*x<sup>n</sup> +
     * a<inf>n-1</inf>*x<sup>n-1</sup> + ... + a<inf>1</inf>.
     *
     * @param x значение аргумента.
     * @return значение функции.
     */
    double f(double x);
}
