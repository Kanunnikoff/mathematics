/*
 * @(#)Quadrangle.java     1.0  17.09.2012
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
 * Четырёхугольник — это геометрическая фигура (многоугольник), состоящая из четырёх точек (вершин), никакие три из
 * которых не лежат на одной прямой, и четырёх отрезков (сторон), попарно соединяющих эти точки. Различают выпуклые и
 * невыпуклые четырёхугольники.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Quadrangle extends Triangle {
    protected Quadrangle() {
        super();
    }

    protected Quadrangle(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Quadrangle create() {
        return new Quadrangle();
    }

    public static Quadrangle create(Point[] points, double[] angles, double[] sides) {
        return new Quadrangle(points, angles, sides);
    }

    public Point pointD() {
        return point(3);
    }

    public double angleD() {
        return angle(3);
    }

    public double sideD() {
        return side(3);
    }

    @Override
    public double square() {
        return -1;  // TODO
    }
}
