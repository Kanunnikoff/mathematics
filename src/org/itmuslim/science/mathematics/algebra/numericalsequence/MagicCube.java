/*
 * @(#)MagicCube.java        1.0 21.02.2013
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
 * Магический куб является трёхмерной версией магического квадрата.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 21.02.2013
 */
public class MagicCube {
    /**
     * Создаёт новый объект для рассчёта магических констант.
     */
    private MagicCube() {
    }

    /**
     * Возвращает магическую константу для целочисленного значения n.
     *
     * @param n натуральное число (n>=3), для которого требуется вычислить магическую константу.
     * @return магическая константа под номером n.
     */
    public static long getMagicConstant(long n) {
        return n * (n*n*n + 1) / 2;
    }
}
