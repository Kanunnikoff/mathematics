/*
 * @(#)Trapeze.java     1.0  17.09.2012
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
 * Трапе́ция (от др.-греч. τραπέζιον — «столик»; τράπεζα — «стол, еда») — четырёхугольник, у которого только одна пара
 * противолежащих сторон параллельна.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Trapeze extends Quadrangle {
    /**
     * Высота.
     */
    private double h;
    /**
     * Радиус вписанной окружности.
     */
    private double r;
    /**
     * Угол при основании.
     */
    private double alpha;

    /**
     * Создаёт новую трапецию.
     */
    protected Trapeze() {
        super();
    }

    /**
     * Создаёт новую трапецию.
     *
     * @param points точки (вершины).
     * @param angles углы.
     * @param sides длины сторон.
     */
    protected Trapeze(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    /**
     * Возвращает новую трапецию.
     *
     * @return новая трапеция.
     */
    public static Trapeze create() {
        return new Trapeze();
    }

    /**
     * Создаёт новую трапецию.
     *
     * @param points точки (вершины).
     * @param angles углы.
     * @param sides длины сторон.
     * @return новая трапеция.
     */
    public static Trapeze create(Point[] points, double[] angles, double[] sides) {
        return new Trapeze(points, angles, sides);
    }

    /**
     * Возвращает высоту.
     *
     * @return высота.
     * @see #setHeight(double)
     */
    public double getHeight() {
        return h;
    }

    /**
     * Устанавливает высоту.
     *
     * @param h высота.
     * @see #getHeight()
     */
    public void setHeight(double h) {
        this.h = h;
    }

    /**
     * Возвращает радиус вписанной окружности.
     *
     * @return радиус вписанной окружности.
     * @see #setRadius(double)
     */
    public double getRadius() {
        return r;
    }

    /**
     * Устанавливает радиус вписанной окружности.
     *
     * @param r радиус вписанной окружности.
     * @see #getRadius()
     */
    public void setRadius(double r) {
        this.r = r;
    }

    /**
     * Возвращает угол при основании.
     *
     * @return угол при основании.
     * @see #setAlpha(double)
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * Устанавливает угол при основании.
     *
     * @param alpha угол при основании.
     * @see #getAlpha()
     */
    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    /**
     * Возвращает центральную линию трапеции.
     *
     * @return центральная линия.
     */
    public double centerLine() {
        return (sideB() + sideD()) / 2;
    }

    /**
     * Возвращает площадь.
     *
     * @return площадь.
     */
    @Override
    public double square() {
        return centerLine() * h;
    }
}
