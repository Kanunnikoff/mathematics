/*
 * @(#)Cone.java     1.0  14.09.2012
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
 * Ко́нус (от др.-греч. κώνος «шишка») — тело, полученное объединением всех лучей, исходящих из одной точки
 * (вершины конуса) и проходящих через плоскую поверхность. Иногда конусом называют часть такого тела, полученную
 * объединением всех отрезков, соединяющих вершину и точки плоской поверхности (последнюю в таком случае называют
 * основанием конуса, а конус называют опирающимся на данное основание). Также можно сказать, что это тело, полученное
 * при вращении прямоугольного треугольника вокруг одного из его катетов.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  14.09.2012
 */
public class Cone implements Shape {
    /**
     * Радиус основания.
     */
    private double R;

    /**
     * Радиус верхнего основания (в случае усечённого конуса).
     */
    private double r;

    /**
     * Длина образующей.
     */
    private double l;

    /**
     * Высота.
     */
    private double h;

    /**
     * Угол раствора.
     */
    private double alpha;

    /**
     * Создаёт новый конус.
     */
    private Cone() {
    }

    /**
     * Создаёт новый конус.
     *
     * @param R радиус основания.
     * @param l длина образующей.
     */
    private Cone(double R, double l) {
        this.R = R;
        this.l = l;
    }

    /**
     * Создаёт новый конус.
     *
     * @param R радиус основания.
     * @param h высота.
     * @param l длина образующей.
     * @param r радиус верхнего основания.
     */
    private Cone(double R, double h, double l, double r) {
        this.R = R;
        this.h = h;
        this.l = l;
        this.r = r;
    }

    /**
     * Создаёт новый конус.
     *
     * @param R радиус основания.
     * @param h высота.
     * @param l длина образующей.
     * @param r радиус верхнего основания.
     * @param alpha угол раствора конуса.
     */
    private Cone(double R, double h, double l, double r, double alpha) {
        this.R = R;
        this.h = h;
        this.l = l;
        this.r = r;
        this.alpha = alpha;
    }

    /**
     * Возвращает новый конус.
     *
     * @return новый конус.
     * @see #create(double, double)
     * @see #create(double, double, double, double)
     * @see #create(double, double, double, double, double)
     */
    public static Cone create() {
        return new Cone();
    }

    /**
     * Возвращает новый конус.
     *
     * @param R радиус основания.
     * @param l длина образующей.
     * @return новый конус.
     * @see #create()
     * @see #create(double, double, double, double)
     * @see #create(double, double, double, double, double)
     */
    public static Cone create(double R, double l) {
        return new Cone(R, l);
    }

    /**
     * Возвращает новый конус.
     *
     * @param R радиус основания.
     * @param h высота.
     * @param l длина образующей.
     * @param r радиус верхнего основания.
     * @return новый конус.
     * @see #create()
     * @see #create(double, double)
     * @see #create(double, double, double, double, double)
     */
    public static Cone create(double R, double h, double l, double r) {
        return new Cone(R, h, l, r);
    }

    /**
     * Возвращает новый конус.
     *
     * @param R радиус основания.
     * @param h высота.
     * @param l длина образующей.
     * @param r радиус верхнего основания.
     * @param alpha угол раствора конуса.
     * @return новый конус.
     * @see #create()
     * @see #create(double, double)
     * @see #create(double, double, double, double)
     */
    public static Cone create(double R, double h, double l, double r, double alpha) {
        return new Cone(R, h, l, r, alpha);
    }

    /**
     * Возвращает радиус основания.
     *
     * @return радиус основания.
     * @see #setRadius(double)
     */
    public double getRadius() {
        return R;
    }

    /**
     * Устанавливает радиус основания.
     *
     * @param R радиус основания.
     * @see #getRadius()
     */
    public void setRadius(double R) {
        this.R = R;
    }

    /**
     * Возвращает радиус верхнего основания (в случае усечённого конуса).
     *
     * @return радиус верхнего основания.
     * @see #setUpperRadius(double)
     */
    public double getUpperRadius() {
        return r;
    }

    /**
     * Устанавливает радиус верхнего основания (в случае усечённого конуса)..
     *
     * @param r радиус верхнего основания.
     * @see #getUpperRadius()
     */
    public void setUpperRadius(double r) {
        this.r = r;
    }

    /**
     * Возвращает длину образующей.
     *
     * @return длина образующей.
     * @see #setGeneratrixLength(double)
     */
    public double getGeneratrixLength() {
        return l;
    }

    /**
     * Устанавливает длину образующей.
     *
     * @param l длина образующей.
     * @see #getGeneratrixLength()
     */
    public void setGeneratrixLength(double l) {
        this.l = l;
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
     * Возвращает угол раствора конуса.
     *
     * @return угол раствора конуса.
     * @see #setConeAngle(double)
     */
    public double getConeAngle() {
        return alpha;
    }

    /**
     * Устанавливает угол раствора конуса.
     *
     * @param alpha угол раствора конуса.
     * @see #getConeAngle()
     */
    public void setConeAngle(double alpha) {
        this.alpha = alpha;
    }

    /**
     * Возвращает площадь боковой поверхности.
     *
     * @return площадь боковой поверхности.
     */
    public double lateralSurfaceSquare() {
        return Math.PI * (R + r) * l;
    }

    /**
     * Возвращает площадь полной поверхности.
     *
     * @return площадь полной поверхонсти.
     */
    public double totalSurfaceSquare() {
        return lateralSurfaceSquare() + Math.PI * Math.pow(R, 2) + Math.PI * Math.pow(r, 2);
    }

    /**
     * Возвращает объём.
     *
     * @return объём.
     */
    public double volume() {
        return (1 / 3) * Math.PI * h * (Math.pow(R, 2) + R*r + Math.pow(r, 2));
    }

    /**
     * Возвращает угол сектора в развертке боковой поверхности конуса.
     *
     * @return угол развёртки.
     */
    public double sweepAngle() {
        return (360 * R) / l;
    }

    /**
     * Возвращает телесный угол при вершине прямого кругового конуса.
     *
     * @return телесный угол.
     */
    public double solidAngle() {
        return 2*Math.PI * (1 - Math.cos(alpha / 2));
    }
}
