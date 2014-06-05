/*
 * @(#)Ball.java     1.0  12.09.2012
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
 * Шар — геометрическое тело; совокупность всех точек пространства, находящихся от центра на расстоянии не больше
 * заданного. Это расстояние называется радиусом шара. Шар образуется вращением полукруга около его неподвижного
 * диаметра. Этот диаметр называется осью шара, а оба конца указанного диаметра — полюсами шара. Поверхность шара
 * называется сферой.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  12.09.2012
 */
public class Ball implements Shape {
    /**
     * Радиус.
     */
    private double R;
    /**
     * x-координата центра.
     */
    private double a;
    /**
     * y-координата центра.
     */
    private double b;
    /**
     * z-координата центра.
     */
    private double c;

    /**
     * Возвращает радиус.
     *
     * @return радиус.
     * @see #setRadius(double)
     */
    public double getRadius() {
        return R;
    }

    /**
     * Устанавливает радиус.
     *
     * @param R радиус.
     * @see #getRadius()
     */
    public void setRadius(double R) {
        this.R = R;
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
     * Устанавливает z-координату центра.
     *
     * @param c z-координата центра.
     * @see #getC()
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Возвращает z-координату центра.
     *
     * @return z-координата центра.
     * @see #setC(double)
     */
    public double getC() {
        return c;
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
     * Создаёт новый шар.
     */
    private Ball() {
    }

    /**
     * Создаёт новый шар.
     *
     * @param R радиус шара.
     */
    private Ball(double R) {
        this.R = R;
    }

    /**
     * Возвращает новый шар.
     *
     * @return новый шар.
     * @see #create(double)
     */
    public static Ball create() {
        return new Ball();
    }

    /**
     * Возвращает новый шар.
     *
     * @param R радиус шара.
     * @return новый шар.
     * @see #create
     */
    public static Ball create(double R) {
        return new Ball(R);
    }

    /**
     * Возвращает площадь поверхности шара.
     *
     * @return вещественное число, представляющее площадь поверхности.
     */
    public double lateralSurfaceSquare() {
        return 4 * Math.PI * Math.pow(R, 2);
    }

    /**
     * Возвращает площадь поверхности шара.
     *
     * @return вещественное число, представляющее площадь поверхности.
     */
    public double totalSurfaceSquare() {
        return 4 * Math.PI * Math.pow(R, 2);
    }

    /**
     * Возвращает объём шара.
     *
     * @return вещественное число, представляющее объём.
     */
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(R, 3);
    }

    /**
     * Возвращает площадь сферического сегмента.
     *
     * @param h высота сегмента.
     * @return площадь сферического сегмента.
     */
    public double sphericalSegmentArea(double h) {
        return 2 * Math.PI * R * h;
    }

    /**
     * Возвращает объём шарового сегмента.
     *
     * @param h высота сегмента.
     * @return объём шарового сегмента.
     */
    public double sphericalSegmentVolume(double h) {
        return (1 / 3) * Math.PI * Math.pow(h, 2) * (3*R - h);
    }

    /**
     * Возвращает объём шарового сектора.
     *
     * @param h высота сегмента.
     * @return объём шарового сектора.
     */
    public double sphericalSectorVolume(double h) {
        return (2 / 3) * Math.PI * Math.pow(R, 2) * h;
    }
}
