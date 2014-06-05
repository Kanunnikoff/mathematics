/*
 * @(#)Hyperbola.java        1.0 04.11.2012
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
 * Гипе́рбола (др.-греч. ὑπερβολή, от др.-греч. βαλειν — «бросать», ὑπερ — «сверх») — геометрическое место точек M
 * Евклидовой плоскости, для которых абсолютное значение разности расстояний от M до двух выделенных точек  и
 * (называемых фокусами) постоянно.
 *
 * @author Dmitry Tsechoev (OPCTXO).
 * @version 1.0 04.11.2012
 */
public class Hyperbola implements Figure {
    /**
     * Большая полуось.
     */
    private double a;

    /**
     * Прицельный параметр.
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
     * Создаёт новую гиперболу.
     *
     * @see #Hyperbola(double, double)
     * @see #Hyperbola(double, double, double)
     * @see #Hyperbola(double, double, double, double)
     */
    private Hyperbola() {
    }

    /**
     * Создаёт новую гиперболу с большой полуосью a и прицельным параметром b.
     *
     * @param a большая полуось.
     * @param b прицельный параметр.
     * @see #Hyperbola()
     * @see #Hyperbola(double, double, double)
     * @see #Hyperbola(double, double, double, double)
     */
    private Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Создаёт новую гиперболу с большой полуосью a, прицельным параметром b и фокальным расстоянием c.
     *
     * @param a большая полуось.
     * @param b прицельный параметр.
     * @param c фокальное расстояние.
     * @see #Hyperbola()
     * @see #Hyperbola(double, double)
     * @see #Hyperbola(double, double, double, double)
     */
    private Hyperbola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Создаёт новую гиперболу с большой полуосью a, прицельным параметром b, фокальным расстоянием c и
     * эксцентриситетом e.
     *
     * @param a большая полуось.
     * @param b прицельный параметр.
     * @param c фокальное расстояние.
     * @param e эксцентриситет.
     * @see #Hyperbola()
     * @see #Hyperbola(double, double)
     * @see #Hyperbola(double, double, double)
     */
    private Hyperbola(double a, double b, double e, double c) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
    }

    /**
     * Возвращает новую гиперболу.
     *
     * @see #create(double, double)
     * @see #create(double, double, double)
     * @see #create(double, double, double, double)
     */
    public static Hyperbola create() {
        return new Hyperbola();
    }

    /**
     * Возвращает новую гиперболу с большой полуосью a и прицельным параметром b.
     *
     * @param a большая полуось.
     * @param b прицельный параметр.
     * @return новая гипербола.
     * @see #create()
     * @see #create(double, double, double)
     * @see #create(double, double, double, double)
     */
    public static Hyperbola create(double a, double b) {
        return new Hyperbola(a, b);
    }

    /**
     * Возвращает новую гиперболу с большой полуосью a, прицельным параметром b и фокальным расстоянием c.
     *
     * @param a большая полуось.
     * @param b прицельный параметр.
     * @param c фокальное расстояние.
     * @return новая гипербола.
     * @see #create()
     * @see #create(double, double)
     * @see #create(double, double, double, double)
     */
    public static Hyperbola create(double a, double b, double c) {
        return new Hyperbola(a, b, c);
    }

    /**
     * Возвращает новую гиперболу с большой полуосью a, прицельным параметром b, фокальным расстоянием c и
     * эксцентриситетом e.
     *
     * @param a большая полуось.
     * @param b прицельный параметр.
     * @param c фокальное расстояние.
     * @param e эксцентриситет.
     * @return новая гипербола.
     * @see #create()
     * @see #create(double, double)
     * @see #create(double, double, double)
     */
    public static Hyperbola create(double a, double b, double c, double e) {
        return new Hyperbola(a, b, c, e);
    }

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
     * Возвращает прицельный параметр.
     *
     * @return прицельный параметр.
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
     * Устанавливает прицельный параметр.
     *
     * @param b прицельный параметр.
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
