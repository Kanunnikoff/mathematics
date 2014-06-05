/*
 * @(#)Cube.java     1.0  12.09.2012
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
 * Куб или правильный гексаэдр — правильный многогранник, каждая грань которого представляет собой квадрат. Частный
 * случай параллелепипеда и призмы.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  12.09.2012
 */
public class Cube extends Parallelepiped {
    /**
     * Создаёт новый куб.
     */
    private Cube() {
        super();
    }

    /**
     * Создаёт новый куб.
     *
     * @param a сторона куба.
     */
    private Cube(double a) {
        super(a, a, a);
    }

    /**
     * Возвращает новый куб.
     *
     * @return новый куб.
     * @see #create(double a)
     */
    public static Cube create() {
        return new Cube();
    }

    /**
     * Возвращает новый куб.
     *
     * @param a сторона куба.
     * @return новый куб.
     * @see #create()
     */
    public static Cube create(double a) {
        return new Cube(a);
    }

    /**
     * Возвращает площадь боковой поверхности.
     *
     * @return площадь боковой поверхности.
     */
    @Override
    public double lateralSurfaceSquare() {
        return 4*Math.pow(a, 2);
    }

    /**
     * Возвращает площадь полной поверхности.
     *
     * @return площадь полной поверхонсти.
     */
    @Override
    public double totalSurfaceSquare() {
        return 6*Math.pow(a, 2);
    }

    /**
     * Возвращает объём.
     *
     * @return объём.
     */
    @Override
    public double volume() {
        return Math.pow(a, 3);
    }

    /**
     * Возвращает радиус вписанной сферы.
     *
     * @return радиус.
     * @see #sphereRadius()
     */
    public double inscribedSphereRadius() {
        return 0.5 * a;
    }

    /**
     * Возвращает радиус описанной сферы.
     *
     * @return радиус.
     * @see #inscribedSphereRadius()
     */
    public double sphereRadius() {
        return (Math.sqrt(3) / 2) * a;
    }
}
