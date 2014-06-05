/*
 * @(#)RectangularParallelepiped.java     1.0  12.09.2012
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
package org.itmuslim.science.mathematics.geometry.stereometry.shape;

/**
 * Прямоугольный параллелепипед — параллелепипед, все грани которого являются прямоугольниками.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  12.09.2012
 */
public class RectangularParallelepiped extends Parallelepiped {
    /**
     * Создаёт новый прямоугольный параллелепипед.
     */
    private RectangularParallelepiped() {
        super();
    }

    /**
     * Создаёт новый прямоугольный параллелепипед.
     *
     * @param a длина.
     * @param b ширина.
     * @param c высота.
     */
    private RectangularParallelepiped(double a, double b, double c) {
        super(a, b, c);
    }

    /**
     * Возвращает новый прямоугольный параллелепипед.
     *
     * @return новый прямоугольный параллелепипед.
     * @see #create(double, double, double)
     */
    public static RectangularParallelepiped create() {
        return new RectangularParallelepiped();
    }

    /**
     * Возвращает новый прямоугольный параллелепипед.
     *
     * @param a длина.
     * @param b ширина.
     * @param c высота.
     * @return новый прямоугольный параллелепипед.
     * @see #create()
     */
    public static RectangularParallelepiped create(double a, double b, double c) {
        return new RectangularParallelepiped(a, b, c);
    }

    /**
     * Возвращает площадь боковой поверхности.
     *
     * @return площадь боковой поверхности.
     */
    @Override
    public double lateralSurfaceSquare() {
        return 2*c * (a + b);
    }

    /**
     * Возвращает площадь полной поверхности.
     *
     * @return площадь полной поверхонсти.
     */
    @Override
    public double totalSurfaceSquare() {
        return 2 * (a*b + b*c + a*c);
    }

    /**
     * Возвращает объём.
     *
     * @return объём.
     */
    @Override
    public double volume() {
        return a * b * c;
    }

    /**
     * Возвращает диагональ.
     *
     * @return диагональ.
     */
    public double diagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
    }
}
