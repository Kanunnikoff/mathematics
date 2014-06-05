/*
 * @(#)Rhomb.java     1.0  17.09.2012
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
 * Ромб (др.-греч. ῥόμβος, лат. rombus «бубен») — это четырёхугольник, у которого все стороны равны. Ромб является
 * параллелограммом. Ромб с прямыми углами называется квадратом.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Rhomb extends Parallelogram {
    protected Rhomb() {
        super();
    }

    protected Rhomb(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Rhomb create() {
        return new Rhomb();
    }

    public static Rhomb create(Point[] points, double[] angles, double[] sides) {
        return new Rhomb(points, angles, sides);
    }

    @Override
    public double square() {

        return 0; // TODO
    }
}
