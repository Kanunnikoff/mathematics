/*
 * @(#)Dot.java     1.0  17.09.2012
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
package org.itmuslim.science.mathematics.geometry.stereometry;

/**
 * В геометрии, топологии и близких разделах математики то́чкой называют абстрактный объект в пространстве, не имеющий
 * ни объёма, ни площади, ни длины, ни каких-либо других измеримых характеристик. Таким образом, точкой называют
 * нульмерный объект. Точка является одним из фундаментальных понятий в математике; любая геометрическая фигура
 * считается состоящей из точек.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Point {
    /**
     * x-координата.
     */
    private double x;
    /**
     * y-координата.
     */
    private double y;
    /**
     * z-координата.
     */
    private double z;

    /**
     * Получает x-координату.
     *
     * @return x-координата.
     * @see #setX(double)
     */
    public double getX() {
        return x;
    }

    /**
     * Устанавливает x-координату.
     *
     * @param x x-координата.
     * @see #getX()
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Получает y-координату.
     *
     * @return y-координата.
     * @see #setY(double)
     */
    public double getY() {
        return y;
    }

    /**
     * Устанавливает y-координату.
     *
     * @param y y-координата.
     * @see #getY()
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Получает z-координату.
     *
     * @return z-координата.
     * @see #setZ(double)
     */
    public double getZ() {
        return z;
    }

    /**
     * Устанавливает z-координату.
     *
     * @param z z-координата.
     * @see #getZ()
     */
    public void setZ(double z) {
        this.z = z;
    }
}
