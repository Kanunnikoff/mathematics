/*
 * @(#)Quadrate.java     1.0  17.09.2012
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
 * Квадра́т — правильный четырёхугольник или ромб, у которого все углы прямые, или параллелограмм, у которого все
 * стороны и углы равны.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Quadrate extends Rectangle {
    protected Quadrate() {
        super();
    }

    protected Quadrate(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Quadrate create() {
        return new Quadrate();
    }

    public static Quadrate create(Point[] points, double[] angles, double[] sides) {
        return new Quadrate(points, angles, sides);
    }

    @Override
    public double square() {

        return 0; // TODO
    }
}
