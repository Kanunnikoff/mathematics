/*
 * @(#)MagicQuadrant.java        1.0 21.02.2013
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
 * Маги́ческий, или волше́бный квадра́т — это квадратная таблица nxn, заполненная n^2 числами таким образом, что сумма
 * чисел в каждой строке, каждом столбце и на обеих диагоналях одинакова.
 * Сумма чисел в каждой строке, столбце и на диагоналях называется магической константой, M.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 21.02.2013
 */
public class MagicQuadrant {
    /**
     * Создаёт новый объект для рассчёта магических констант.
     */
    private MagicQuadrant() {
    }

    /**
     * Возвращает магическую константу для целочисленного значения n.
     *
     * @param n натуральное число (n>=3), для которого требуется вычислить магическую константу.
     * @return магическая константа под номером n.
     */
    public static long getMagicConstant(long n) {
        return n * (n*n + 1) / 2;
    }
}
