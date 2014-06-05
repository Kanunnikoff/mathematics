/*
 * @(#)JacobiMethod.java     1.0.0  25.02.13
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
package org.itmuslim.science.mathematics.algebra.numericalmethod.equationssystem;

import org.itmuslim.science.mathematics.algebra.matrix.Matrix;
import org.itmuslim.science.mathematics.algebra.vector.Vector;

/**
 * Метод Якоби численного решения системы линейных алгебраических уравнений.
 *
 * @author Dmitry Tsechoev 25.02.13 17:14
 * @version 1.0.0
 */
public class JacobiMethod {
    /**
     * Создаёт новый объект для решения системы уравнений.
     */
    private JacobiMethod() {
    }

    /**
     * Выполняет решение системы уравнений численным методом Якоби.
     *
     * @param system система уравнений.
     * @param e заданная точность.
     * @return вектор-решение системы.
     * @see Matrix
     * @see Vector
     * @see EquationsSystem
     */
    public static Vector solve(EquationsSystem system, double e) {
        Matrix a = system.getA();
        Vector b = system.getB();

        Vector x = Vector.create(b.dimension());
        Vector x0 = Vector.create(b.dimension());
        double max;

        do {
            for (int i = 0; i < b.dimension(); i++) {
                double sum = 0.0;
                for (int j = 0; j < b.dimension(); j++) {
                    if(i != j) {
                        sum += a.get(i, j) * x.get(j);
                    }
                }
                x0.set(i,(b.get(i) - sum) / a.get(i, i));
            }

            max = Math.abs(x0.get(0) - x.get(0));

            for (int i = 0; i < b.dimension(); i++) {
                if(Math.abs(x0.get(i) - x.get(i)) > max) {
                    max = Math.abs(x0.get(i) - x.get(i));
                }
                x.set(i, x0.get(i));
            }
        } while (max > e);

        return x;
    }
}
