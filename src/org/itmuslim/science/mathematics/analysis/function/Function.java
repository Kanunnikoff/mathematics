/*
 * @(#)Function.java   1.0       23.01.2012
 * Copyright (c) 2013 Dmitry Tsechoev.
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
package org.itmuslim.science.mathematics.analysis.function;

/**
 * Class description...
 *
 * @author Dmitry Tsechoev
 * @version 1.0.0
 */
public class Function {
    private Function() {
    }

    public static Function create() {
        return new Function();
    }

    public double y(double x) {
        return 0.0;
    }

    /**
     * Возвращает значение первой производной данной функции в точке с заданным приращением аргумента.
     *
     * @param x0 значение аргумента (точка на оси абсцисс), для которого следует вычислить значение производной.
     * @param deltaX приращение аргумента (шаг).
     * @return значение производной в точке.
     */
    public double derivative(double x0, double deltaX) {
        return (y(x0 + deltaX) - y(x0 - deltaX)) / (2*deltaX);
    }

    /**
     * Возвращает значение второй производной данной функции в точке с заданным приращением аргумента.
     *
     * @param x0 значение аргумента (точка на оси абсцисс), для которого следует вычислить значение производной.
     * @param deltaX приращение аргумента (шаг).
     * @return значение производной в точке.
     */
    public double derivative2(double x0, double deltaX) {
        return (y(x0 + deltaX) - 2*y(x0) + y(x0 - deltaX)) / Math.pow(deltaX, 2);
    }

    /**
     * Возвращает значение третьей производной данной функции в точке с заданным приращением аргумента.
     *
     * @param x0 значение аргумента (точка на оси абсцисс), для которого следует вычислить значение производной.
     * @param deltaX приращение аргумента (шаг).
     * @return значение производной в точке.
     */
    public double derivative3(double x0, double deltaX) {
        return (y(x0 + 2*deltaX) - 2*y(x0 + deltaX) + 2*y(x0 - deltaX) - y(x0 - 2*deltaX)) / (2*Math.pow(deltaX, 3));
    }
}
