/*
 * @(#)Polygon.java     1.0  17.09.2012
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
 * Многоуго́льник — это геометрическая фигура, определяется как замкнутая ломаная. Вершины ломаной называются вершинами
 * многоугольника, а отрезки — сторонами многоугольника.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Polygon implements Figure {
    protected Point[] points;
    protected double[] angles;
    protected double[] sides;

    protected Polygon() {
    }

    protected Polygon(Point[] points, double[] angles, double[] sides) {
        this.points = points;
        this.angles = angles;
        this.sides = sides;
    }

    public static Polygon create() {
        return new Polygon();
    }

    public static Polygon create(Point[] points, double[] angles, double[] sides) {
        return new Polygon(points, angles, sides);
    }

    public double pointsCount() {
        return points.length;
    }

    public double anglesCount() {
        return angles.length;
    }

    public double sidesCount() {
        return sides.length;
    }

    public Point point(int i) {
        return points[i];
    }

    public double angle(int i) {
        return angles[i];
    }

    public double side(int i) {
        return sides[i];
    }

    public double perimeter() {
        double perimeter = 0.0;
        for (double side : sides) perimeter += side;

        return perimeter;
    }

    public double square() {
        return 0; // TODO
    }
}
