/*
 * @(#)Parabola.java        1.0 04.11.2012
 *
 * Copyright (c) 2012 Dmitry Tsechoev.
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
package org.itmuslim.science.mathematics.geometry.planimetry.figure;

import org.itmuslim.science.mathematics.geometry.planimetry.Point;

/**
 * Пара́бола (греч. παραβολή — приложение) — геометрическое место точек, равноудалённых от данной прямой (называемой
 * директрисой параболы) и данной точки (называемой фокусом параболы).
 *
 * @author Dmitry Tsechoev (OPCTXO).
 * @version 1.0 04.11.2012
 */
public class Parabola implements Figure {
    /**
     * Фокальный параметр.
     */
    private double p;

    /**
     * Создаёт новую параболу.
     * @see #Parabola(double)
     */
    private Parabola() {
    }

    /**
     * Создаёт новую параболу.
     *
     * @param p фокальный параемтр.
     * @see #Parabola()
     */
    private Parabola(double p) {
        this.p = p;
    }

    /**
     * Возвращает новую параболу.
     *
     * @return новая парабола.
     * @see #create(double)
     */
    public static Parabola create() {
        return new Parabola();
    }

    /**
     * Возвращает новую параболу с фокальным параметром p.
     *
     * @param p фокальный параметр.
     * @return новая парабола.
     * @see #create()
     */
    public static Parabola create(double p) {
        return new Parabola(p);
    }

    /**
     * Возвращает фокальный параметр.
     *
     * @return фокальный параметр.
     */
    public double getP() {
        return p;
    }

    /**
     * Устанавливает фокальный параметр.
     *
     * @param p фокальный параметр.
     */
    public void setP(double p) {
        this.p = p;
    }

    public double perimeter() {
        return 0;  // в данном случае метод не применим
    }

    public double square() {
        return 0;  // в данном случае метод не применим
    }

    /**
     * Возвращает x-значение гиперболы в заданной точке y.
     *
     * @param y y-значение на оси ординат.
     * @return x-значение на оси абсцисс.
     */
    public double x(double y) {
        return Math.pow(y, 2) / (2*p);
    }

    /**
     * Возвращает y-значение гиперболы в заданной точке x.
     *
     * @param x x-значение на оси абсцисс.
     * @return y-значение на оси ординат.
     */
    public double y(double x) {
        return Math.pow(x, 2) / (2*p);
    }

    /**
     * Возвращает y-значение касательной в точке (x0; y0) в заданной точке x.
     *
     * @param x x-значение на оси ординат.
     * @return y-значение на оси абсцисс.
     */
    public double tangent(double x, Point point) {
        return (p / point.getY()) * (x + point.getX());
    }
}
