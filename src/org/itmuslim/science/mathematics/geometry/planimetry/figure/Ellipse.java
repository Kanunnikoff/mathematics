/*
 * @(#)Ellipse.java        1.0 04.11.2012
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
 * Э́ллипс (др.-греч. ἔλλειψις — опущение, недостаток, в смысле недостатка эксцентриситета до 1) — геометрическое место
 * точек M Евклидовой плоскости, для которых сумма расстояний до двух данных точек  и  (называемых фокусами) постоянна и
 * больше расстояния между фокусами
 *
 * @author Dmitry Tsechoev (OPCTXO).
 * @version 1.0 04.11.2012
 */
public class Ellipse implements Figure {
    /**
     * Большая полуось.
     */
    private double a;

    /**
     * Малая полуось.
     */
    private double b;

    /**
     * Фокальное расстояние.
     */
    private double c;

    /**
     * Эксцентриситет.
     */
    private double e;

    /**
     * Фокальный параметр.
     */
    private double p;

    /**
     * Возвращает большую полуось.
     *
     * @return большая полуось.
     * @see #setA(double)
     */
    public double getA() {
        if(isZero(a)) {
            if(!isZero(c) && !isZero(b))
                return Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            else if(!isZero(c) && !isZero(e))
                return c / e;
            else if(!isZero(b) && !isZero(e))
                return Math.sqrt(Math.pow(b, 2) / (Math.pow(e, 2) - 1));
        }

        return a;
    }

    /**
     * Устанавливает большую полуось.
     *
     * @param a большая полуось.
     * @see #getA()
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Возвращает малую полуось.
     *
     * @return малая полуось.
     * @see #setB(double)
     */
    public double getB() {
        if(isZero(b)) {
            if(!isZero(c) && !isZero(a))
                return Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            else if(!isZero(a) && !isZero(e))
                return Math.sqrt(Math.pow(a, 2) * (Math.pow(e, 2) - 1));
        }

        return b;
    }

    /**
     * Устанавливает малую полуось.
     *
     * @param b малая полуось.
     * @see #getB()
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Возвращает фокальное расстояние.
     *
     * @return фокальное расстояние.
     * @see #setC(double)
     */
    public double getC() {
        if(isZero(c)) {
            if(!isZero(a) && !isZero(b))
                return Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));
            else if(!isZero(a) && !isZero(e))
                return a * e;
        }

        return c;
    }

    /**
     * Устанавливает фокальное расстояние.
     *
     * @param c фокальное расстояние.
     * @see #getC()
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Возвращает эксцентриситет.
     *
     * @return эксцентриситет.
     * @see #setE(double)
     */
    public double getE() {
        if(isZero(e)) {
            if(!isZero(c) && !isZero(a))
                return c / a;
            else if(!isZero(a) && !isZero(b))
                return Math.sqrt(Math.pow(b, 2) / Math.pow(a, 2) + 1);
        }

        return e;
    }

    /**
     * Устанавливает эксцентриситет.
     *
     * @param e эксцентриситет.
     * @see #getE()
     */
    public void setE(double e) {
        this.e = e;
    }

    /**
     * Возвращает фокальный параметр.
     *
     * @return фокальный параметр.
     */
    public double getP() {
        if(isZero(p))
            if(!isZero(a) && !isZero(b))
                return Math.pow(b, 2) / a;

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

    /**
     * Возвращает перицентрическое расстояние.
     *
     * @return перицентрическое расстояние.
     */
    public double pericentricDistance() {
        return a * (getE() - 1);
    }

    /**
     * Возвращает кривизну.
     *
     * @param x абсцисса точки.
     * @param y ордината точки.
     * @return кривизна.
     * @see #curvatureRadius(double, double)
     */
    public double curvature(double x, double y) {
        return a*b / Math.pow(Math.pow(a, 2) * Math.pow(y, 2) / Math.pow(b, 2) + Math.pow(b, 2) * Math.pow(x, 2) / Math.pow(a, 2), 3 / 2);
    }

    /**
     * Возвращает радиус кривизны.
     *
     * @param x абсцисса точки.
     * @param y ордината точки.
     * @return радиус кривизны
     * @see #curvature(double, double)
     */
    public double curvatureRadius(double x, double y) {
        return 1 / curvature(x, y);
    }

    public double perimeter() {
        return 0;  // в данном случае метод не применим
    }

    public double square() {
        return 0;  // в данном случае метод не применим
    }

    /**
     * Возвращает признак того, что заданное число является нулём.
     * Данная усложнённая проверка вызвана тем обстоятельством, что вещественные числа знаком равенства "=" сравнить
     * не удастся.
     *
     * @param value число для проверки на ноль.
     * @return true, если число является нулём; false - в противном случае.
     */
    public boolean isZero(double value) {
        return -0.0000000001 < value && value < 0.0000000001;
    }

    /**
     * Возвращает положительное y-значение гиперболы в заданной точке x. Для полной картины нужно учитывать и
     * отрицательное y-значение.
     *
     * @param x x-значение на оси ординат.
     * @return y-значение на оси абсцисс.
     */
    public double y(double x) {
        return Math.sqrt(Math.pow(getB(), 2) * (Math.pow(x, 2) / Math.pow(getA(), 2) - 1));
    }

    /**
     * Возвращает положительное y-значение асимптоты в заданной точке x. Для второй асимптоты нужно учитывать и
     * отрицательное y-значение.
     *
     * @param x x-значение на оси ординат.
     * @return y-значение на оси абсцисс.
     */
    public double asymptote(double x) {
        return getB()*x / getA();
    }

    /**
     * Возвращает y-значение касательной в точке (x0; y0) в заданной точке x.
     *
     * @param x x-значение на оси ординат.
     * @return y-значение на оси абсцисс.
     */
    public double tangent(double x, Point point) {
        return point.getY() + Math.pow(getB(), 2)*point.getX()*(x - point.getX()) / (Math.pow(getA(), 2)*point.getY());
    }

    /**
     * Возвращает y-значение нормали в точке (x0; y0) в заданной точке x.
     *
     * @param x x-значение на оси ординат.
     * @return y-значение на оси абсцисс.
     */
    public double normal(double x, Point point) {
        return point.getY() - Math.pow(getA(), 2)*point.getY()*(x - point.getX()) / (Math.pow(getB(), 2)*point.getX());
    }
}
