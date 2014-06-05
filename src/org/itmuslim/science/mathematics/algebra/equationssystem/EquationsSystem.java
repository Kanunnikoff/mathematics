/*
 * @(#)EquationsSystem.java        1.0 02.02.2013
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

import org.itmuslim.science.mathematics.algebra.matrix.Matrix;
import org.itmuslim.science.mathematics.algebra.vector.Vector;

/**
 * Система линейных алгебраических уравнений.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 02.02.2013
 */
public class EquationsSystem {
    /**
     * Матрица, составленная из кооэфициентов при неизвестных.
     */
    private Matrix a;
    /**
     * Вектор-столбец свободных членов.
     */
    private Vector b;

    /**
     * Возвращает матрицу коэффициентов.
     *
     * @return матрица.
     */
    public Matrix getA() {
        return a;
    }

    /**
     * Устанавливает матрицу коэффициентов.
     *
     * @param a матрица.
     */
    public void setA(Matrix a) {
        this.a = a;
    }

    /**
     * Возвращает столбец свободных членов.
     *
     * @return стобец.
     */
    public Vector getB() {
        return b;
    }

    /**
     * Устанавливает столбец свободных членов.
     *
     * @param b столбец.
     */
    public void setB(Vector b) {
        this.b = b;
    }

    /**
     * Создаёт новый объект системы уравнений.
     */
    private EquationsSystem() {
    }

    /**
     * Возвращает новый объект системы уравнений.
     *
     * @return система уравнений.
     */
    public static EquationsSystem create() {
        return new EquationsSystem();
    }

    /**
     * Создаёт новый объект системы уравнений c матрицей коэффициентов a и вектором-столбцом
     * свободных членов b.
     */
    private EquationsSystem(Matrix a, Vector b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Возвращает новый объект системы уравнений c матрицей коэффициентов a и вектором-столбцом
     * свободных членов b.
     */
    public static EquationsSystem create(Matrix a, Vector b) {
        return new EquationsSystem(a, b);
    }
}
