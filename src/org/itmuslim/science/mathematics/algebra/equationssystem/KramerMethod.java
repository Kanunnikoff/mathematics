/*
 * @(#)KramerMethod.java        1.0 28.02.2013
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
package org.itmuslim.science.mathematics.algebra.equationssystem;

import org.itmuslim.science.mathematics.algebra.matrix.EmptyMatrixException;
import org.itmuslim.science.mathematics.algebra.matrix.Matrix;
import org.itmuslim.science.mathematics.algebra.matrix.NotEqualDimensionsException;
import org.itmuslim.science.mathematics.algebra.vector.Vector;

/**
 * Метод Крамера (правило Крамера) — способ решения квадратных систем линейных алгебраических уравнений с ненулевым
 * определителем основной матрицы (причём для таких уравнений решение существует и единственно). Назван по имени
 * Габриэля Крамера (1704–1752), придумавшего метод.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 28.02.2013
 */
public class KramerMethod {
    /**
     * Создаёт новый объект для решения системы уравнений точным методом Крамера.
     */
    private KramerMethod() {
    }

    /**
     * Выполняет решение системы уравнений точным методом Крамера.
     *
     * @param system система уравнений.
     * @return вектор-решение системы.
     * @throws EmptyMatrixException если матрица A пуста (нет элементов).
     * @throws NotEqualDimensionsException если число строк матрицы не совпадает с числом элементов
     * вектора B.
     * @see Matrix
     * @see Vector
     * @see EquationsSystem
     */
    public static Vector solve(EquationsSystem system) throws EmptyMatrixException, NotEqualDimensionsException {
        Matrix a = system.getA();
        Vector b = system.getB();

        double delta = a.determinant();
        if(-0.00000001 < delta && delta < 0.00000001)
            return null;

        Vector x = Vector.create(b.dimension());

        for(int i = 0; i < x.dimension(); i++) {
            x.getCoordinates()[i] = a.replaceColumn(b, i).determinant() / delta;
        }

        return x;
    }
}
