/*
 * @(#)Superfaktorial.java        1.0 14.02.2013
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
 * Нейл Слоан и Саймон Плоуф (англ.) в 1995 году определили суперфакториал как произведение первых n факториалов.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 * @since MathLib 1.0
 */
public class SuperFaktorial {
    /**
     * Создаёт новый суперфакториал.
     */
    private SuperFaktorial() {
    }

    /**
     * Возвращает значение суперфакториала для целочисленного значения n.
     *
     * @param n натуральное число (n>0), для которого требуется вычислить суперфакториал.
     * @return значение суперфакториала.
     * @since MathLib 1.0
     */
    public static long value(long n) {
        if(n < 0)
            return -1;

        long value = 1;
        for (long i = 2; i <= n; i++)
            value *= Factorial.value(i);

        return value;
    }
}
