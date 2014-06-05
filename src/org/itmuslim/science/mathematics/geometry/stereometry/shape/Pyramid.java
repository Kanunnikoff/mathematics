/*
 * @(#)Pyramid.java     1.0  14.09.2012
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
 * Пирами́да (др.-греч. πυραμίς, род. п. πυραμίδος) — многогранник, основание которого — многоугольник, а остальные
 * грани — треугольники, имеющие общую вершину[1]. По числу углов основания различают пирамиды треугольные,
 * четырёхугольные и т. д. Пирамида является частным случаем конуса.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  14.09.2012
 */
public class Pyramid implements Shape {
    /**
     * Высота.
     */
    private double h;

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
     * Создаёт новую пирамиду.
     */
    private Pyramid() {
    }

    /**
     * Создаёт новую пирамиду.
     *
     * @param h высота.
     */
    private Pyramid(double h) {
        this.h = h;
    }

    /**
     * Возвращает новую пирамиду.
     *
     * @return новая пирамида.
     * @see #create(double)
     */
    public static Pyramid create() {
        return new Pyramid();
    }

    /**
     * Возвращает новую пирамиду.
     *
     * @param h высота.
     * @return новая пирамида.
     * @see #create()
     */
    public static Pyramid create(double h) {
        return new Pyramid(h);
    }

    /**
     * Возвращает площадь боковой поверхности.
     *
     * @return площадь боковой поверхности.
     */
    @Override
    public double lateralSurfaceSquare() {
        return 0; // TODO
    }

    /**
     * Возвращает площадь полной поверхности.
     *
     * @return площадь полной поверхонсти.
     */
    @Override
    public double totalSurfaceSquare() {
        return 0; // TODO
    }

    /**
     * Возвращает объём.
     *
     * @return объём.
     */
    @Override
    public double volume() {
        return 0; // TODO
    }
}
