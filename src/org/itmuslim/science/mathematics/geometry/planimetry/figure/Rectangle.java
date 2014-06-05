/*
 * @(#)Rectangle.java     1.0  17.09.2012
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
 * Прямоугольник — параллелограмм, квадрат , у которого равны только параллельные прямые и углы равны 90 градусов.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Rectangle extends Parallelogram {
    protected Rectangle() {
        super();
    }

    protected Rectangle(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Rectangle create() {
        return new Rectangle();
    }

    public static Rectangle create(Point[] points, double[] angles, double[] sides) {
        return new Rectangle(points, angles, sides);
    }

    @Override
    public double square() {

        return 0; // TODO
    }
}
