/*
 * @(#)Circle.java     1.0  18.09.2012
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

/**
 * Class description...
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  18.09.2012
 */
public class Circle extends Ellipse {
    /**
     * Радиус.
     */
    private double r;
    /**
     * x-координата центра.
     */
    private double a;
    /**
     * y-координата центра.
     */
    private double b;

    /**
     * Создаёт новую окружность.
     */
    private Circle() {
    }

    /**
     * Создаёт новую окружность.
     * @param r радиус.
     */
    private Circle(double r) {
        this.r = r;
    }

    /**
     * Возвращает новую окружность.
     *
     * @return новая окружность.
     * @see #create(double)
     */
    public static Circle create() {
        return new Circle();
    }

    /**
     * Возвращает новую окружность.
     *
     * @param r радиус.
     * @return новая окружность.
     * @see #create()
     */
    public static Circle create(double r) {
        return new Circle(r);
    }

    /**
     * Возвращает радиус.
     *
     * @return радиус.
     * @see #setRadius(double)
     */
    public double getRadius() {
        return r;
    }

    /**
     * Устанавливает радиус.
     *
     * @param r радиус.
     * @see #getRadius()
     */
    public void setRadius(double r) {
        this.r = r;
    }

    /**
     * Возвращает x-координату центра.
     *
     * @return x-координата центра.
     * @see #setA(double)
     */
    public double getA() {
        return a;
    }

    /**
     * Устанавливает x-координату центра.
     *
     * @param a x-координата центра.
     * @see #getA()
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Возвращает y-координату центра.
     *
     * @return y-координата центра.
     * @see #setB(double)
     */
    public double getB() {
        return b;
    }

    /**
     * Устанавливает y-координату центра.
     *
     * @param b y-координата центра.
     * @see #getB()
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Возвращает длину окружности.
     *
     * @return длина окружности.
     */
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    /**
     * Возвращает площадь круга.
     *
     * @return площадь.
     */
    public double square() {
        return Math.PI * Math.pow(r, 2);
    }
}
