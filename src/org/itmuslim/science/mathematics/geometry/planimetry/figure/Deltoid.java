/*
 * @(#)Deltoid.java     1.0  17.09.2012
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
 * Дельтоид — четырёхугольник, обладающий двумя парами сторон одинаковой длины. В отличие от параллелограмма, равными
 * являются не противоположные, а две пары смежных сторон. Выпуклый дельтоид имеет форму, похожую на воздушного змея.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Deltoid extends Quadrangle {
    protected Deltoid() {
        super();
    }

    protected Deltoid(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Deltoid create() {
        return new Deltoid();
    }

    public static Deltoid create(Point[] points, double[] angles, double[] sides) {
        return new Deltoid(points, angles, sides);
    }

    @Override
    public double square() {

        return 0; // TODO
    }
}
