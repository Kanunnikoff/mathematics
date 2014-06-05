/*
 * @(#)GaussMethod.java        1.0 08.06.2013
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
 * Ме́тод Га́усса — классический метод решения системы линейных алгебраических уравнений (СЛАУ).
 * Это метод последовательного исключения переменных, когда с помощью элементарных преобразований
 * система уравнений приводится к равносильной системе треугольного вида, из которой последовательно,
 * начиная с последних (по номеру) переменных, находятся все остальные переменные.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 08.06.2013
 */
public class GaussMethod {
    /**
     * Создаёт новый объект для решения системы уравнений точным методом Гаусса.
     */
    private GaussMethod() {
    }

    /**
     * Выполняет решение системы уравнений точным методом Гаусса.
     *
     * @param system система уравнений.
     * @return вектор-решение системы.
     * @throws org.itmuslim.science.mathematics.algebra.matrix.EmptyMatrixException если матрица A пуста (нет элементов).
     * @throws org.itmuslim.science.mathematics.algebra.matrix.NotEqualDimensionsException если число строк матрицы не совпадает с числом элементов
     * вектора B.
     * @see org.itmuslim.science.mathematics.algebra.matrix.Matrix
     * @see org.itmuslim.science.mathematics.algebra.vector.Vector
     * @see EquationsSystem
     */
    public static Vector solve(EquationsSystem system) throws EmptyMatrixException, NotEqualDimensionsException {
        Matrix a = system.getA();
        Vector b = system.getB();

        double delta = a.determinant();
        if(-0.00000001 < delta && delta < 0.00000001) // TODO
            return null;



        return null;
    }
}
