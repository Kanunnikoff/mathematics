/*
 * @(#)Placement.java        1.0 11.02.2013
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
 * В комбинаторике размещением называется расположение «предметов» (объектов) на некоторых «местах» при условии, что
 * каждое место занято в точности одним предметом и все предметы различны. Более формально, размеще́нием (из n по k)
 * называется упорядоченный набор из k различных элементов из некоторого множества различных же n элементов.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 11.02.2013
 */
public class Placement {
    /**
     * Создаёт новое размещение.
     */
    private Placement() {
    }

    /**
     * Возвращает число размещений из n по k.
     *
     * @param n количество элементов оригинального набора.
     * @param k количество элементов предполагаемых наборов.
     * @param repetitions признак размещений с повторениями.
     * @return число размещений.
     */
    public static long value(long n, long k, boolean repetitions) {
        if(repetitions)
            return (long) Math.pow(n, k);
        else
            return Factorial.value(n) / Factorial.value(n - k);
    }
}
