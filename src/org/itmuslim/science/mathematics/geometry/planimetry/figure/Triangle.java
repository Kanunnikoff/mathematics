/*
 * @(#)Triangle.java     1.0  17.09.2012
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
 * Треуго́льник (в евклидовом пространстве) — это геометрическая фигура, которая состоит из трёх точек, не лежащих на
 * одной прямой, и трёх отрезков, соединяющих эти три точки. Три точки, образующие треугольник, называются вершинами
 * треугольника, а прямолинейные отрезки — сторонами треугольника. Стороны треугольника образуют в вершинах
 * треугольника три угла. Другими словами, треугольник — это многоугольник, у которого имеется ровно три угла. Если три
 * точки лежат на одной прямой, то «треугольник» с вершинами в трёх данных точках называется вырожденным. Все остальные
 * треугольники невырожденные.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  17.09.2012
 */
public class Triangle extends Polygon {

    protected Triangle() {
        super();
    }

    protected Triangle(Point[] points, double[] angles, double[] sides) {
        super(points, angles, sides);
    }

    public static Triangle create() {
        return new Triangle();
    }

    public static Triangle create(Point[] points, double[] angles, double[] sides) {
        return new Triangle(points, angles, sides);
    }

    public Point pointA() {
        return point(0);
    }

    public Point pointB() {
        return point(1);
    }

    public Point pointC() {
        return point(2);
    }

    public double angleA() {
        return angle(0);
    }

    public double angleB() {
        return angle(1);
    }

    public double angleC() {
        return angle(2);
    }

    public double sideA() {
        return side(0);
    }

    public double sideB() {
        return side(1);
    }

    public double sideC() {
        return side(2);
    }

    @Override
    public double square() {

        return 0; // TODO
    }
}
