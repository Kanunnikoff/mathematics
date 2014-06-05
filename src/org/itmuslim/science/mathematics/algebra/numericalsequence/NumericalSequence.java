/*
 * @(#)Progression.java     1.0.0  22.01.13
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
package org.itmuslim.science.mathematics.algebra.numericalsequence;

/**
 * Числовая последовательность.
 *
 * @author Dmitry Tsechoev
 * @version 1.0.0
 */
public interface NumericalSequence {
    /**
     * Возвращает сумму n-первых членов последовательности.
     *
     * @param n количество первых членов последовательности, участвующих в суммировании.
     * @return сумма n-первых членов.
     */
    double S(long n);

    /**
     * Возвращает предел числовой последователности.
     *
     * @return предел.
     */
    double lim();

    /**
     * Возвращает предел последователности частичных сумм.
     *
     * @return предел последователности частичных сумм.
     */
    double limSn();
}
