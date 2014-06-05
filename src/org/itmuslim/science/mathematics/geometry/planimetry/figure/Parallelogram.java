/*
 * @(#)Parallelogram.java     1.0  17.09.2012
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
 * Параллелогра́мм (др.-греч. παραλληλόγραμμον от παράλληλος — параллельный и γραμμή — линия) — это четырёхугольник,
 * у которого противоположные стороны попарно параллельны, то есть лежат на параллельных прямых. Частными случаями
 * параллелограмма являются прямоугольник, квадрат и ромб.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Parallelogram extends Quadrangle {
    protected Parallelogram() {
        super();
    }

    protected Parallelogram(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Parallelogram create() {
        return new Parallelogram();
    }

    public static Parallelogram create(Point[] points, double[] angles, double[] sides) {
        return new Parallelogram(points, angles, sides);
    }

    @Override
    public double square() {

        return 0; // TODO
    }
}
