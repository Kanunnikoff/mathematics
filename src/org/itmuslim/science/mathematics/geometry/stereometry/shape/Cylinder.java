/*
 * @(#)Cylinder.java     1.0  13.09.2012
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
 * Цили́ндр (др.-греч. κύλινδρος — валик, каток) — геометрическое тело, ограниченное цилиндрической поверхностью и
 * двумя параллельными плоскостями, пересекающими её. Цилиндрическая поверхность — поверхность, получаемая таким
 * поступательным движением прямой (образующей) в пространстве, что выделенная точка образующей движется вдоль плоской
 * кривой (направляющей). Часть поверхности цилиндра, ограниченная цилиндрической поверхностью называется боковой
 * поверхностью цилиндра. Другая часть, ограниченная параллельными плоскостями, это основания цилиндра. Таким образом,
 * граница основания будет по форме совпадать с направляющей.
 *
 * В большинстве случаев под цилиндром подразумевается прямой круговой цилиндр, у которого направляющая — окружность и
 * основания перпендикулярны образующей. У такого цилиндра имеется ось симметрии.
 *
 * Другие виды цилиндра — эллиптический, гиперболический, параболический. Согласно определению, призма также является
 * разновидностью цилиндра.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  13.09.2012
 */
public class Cylinder implements Shape {
    /**
     * Радиус.
     */
    private double R;

    /**
     * Высота.
     */
    private double h;

    /**
     * Возвращает радиус основания.
     *
     * @return радиус основания.
     * @see #setRadius(double)
     */
    public double getRadius() {
        return R;
    }

    /**
     * Устанавливает радиус основания.
     *
     * @param R радиус основания.
     * @see #getRadius()
     */
    public void setRadius(double R) {
        this.R = R;
    }

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
     * Создаёт новый цилиндр.
     */
    private Cylinder() {
    }

    /**
     * Создаёт новый цилиндр.
     *
     * @param R радиус основания.
     * @param h высота.
     */
    private Cylinder(double R, double h) {
        this.R = R;
        this.h = h;
    }

    /**
     * Возвращает новый цилиндр.
     *
     * @return новый цилиндр.
     * @see #create(double, double)
     */
    public static Cylinder create() {
        return new Cylinder();
    }

    /**
     * Возвращает новый цилиндр.
     *
     * @param R раидус основания.
     * @param h высота.
     * @return новый цилиндр.
     * @see #create()
     */
    public static Cylinder create(double R, double h) {
        return new Cylinder(R, h);
    }

    /**
     * Возвращает площадь боковой поверхности.
     *
     * @return площадь боковой поверхности.
     */
    public double lateralSurfaceSquare() {
        return 2 * Math.PI * R * h;
    }

    /**
     * Возвращает площадь полной поверхности.
     *
     * @return площадь полной поверхонсти.
     */
    public double totalSurfaceSquare() {
        return 2 * Math.PI * R * (h + R);
    }

    /**
     * Возвращает объём.
     *
     * @return объём.
     */
    public double volume() {
        return Math.PI * Math.pow(R, 2) * h;
    }
}
