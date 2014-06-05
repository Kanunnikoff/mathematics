/*
 * @(#)Superduperfactorial.java        1.0 11.02.2013
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
package org.itmuslim.science.mathematics.combinatorics.factorial;

/**
 * Идея была обобщена в 2000 году Генри Боттомли (англ.), что привело к гиперфакториалам (англ. Superduperfactorial),
 * которые являются произведением первых n суперфакториалов.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 11.02.2013
 * @since MathLib 1.0
 */
public class SuperDuperFactorial {
    /**
     * Создаёт новый гиперфакториал.
     */
    private SuperDuperFactorial() {
    }

    /**
     * Возвращает значение гиперфакториала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить гиперфакториал.
     * @return значение гиперфакториала.
     * @since MathLib 1.0
     */
    public static long value(long n) {
        if(n < 0)
            return -1;

        long value = 1;
        for (long i = 2; i <= n; i++)
            value *= SuperFaktorial.value(i);

        return value;
    }
}
