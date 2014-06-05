/*
 * @(#)EratosthenesSieve.java        1.0 14.02.2013
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
package org.itmuslim.science.mathematics.numberstheory.prime;

/**
 * Решето́ Эратосфе́на — алгоритм нахождения всех простых чисел до некоторого целого числа n, который приписывают
 * древнегреческому математику Эратосфену Киренскому.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 14.02.2013
 */
public class EratosthenesSieve {
    /**
     * Создаёт новый объект для нахождения простых чисел методом решета Эратосфена.
     */
    private EratosthenesSieve() {
    }

    /**
     * Возвращает массив всех простых чисел до целого числа n.
     *
     * @param n целое число, до которого требуется найти все простые числа.
     * @return массив простых чисел.
     */
    public static long[] prime(int n) {
        long[] array = new long[n - 1];

        long p = array[0] = 2;
        for (int i = 1; i < array.length; i++)
            array[i] = array[i - 1] + 1;

        while (p*p <= n) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] >= 2*p && array[i] % p == 0)
                    array[i] = -1;
            }

            for (long a : array) {
                if(a != -1 && a > p) {
                    p = a;
                    break;
                }
            }
        }

        int primeCount = 0;
        for (long a : array) {
            if(a != -1)
                primeCount++;
        }

        long[] result = new long[primeCount];
        int j = 0;
        for (long a : array)
            if (a != -1)
                result[j++] = a;

        return result;
    }
}
