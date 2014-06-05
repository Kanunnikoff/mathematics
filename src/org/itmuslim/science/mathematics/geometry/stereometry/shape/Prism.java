/*
 * @(#)Prism.java     1.0  14.09.2012
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
 * Призма (от др.-греч. πρίσμα (лат. prisma) «нечто отпиленное») — многогранник, две грани которого являются
 * конгруэнтными (равными) многоугольниками, лежащими в параллельных плоскостях, а остальные грани — параллелограммами,
 * имеющими общие стороны с этими многоугольниками. Или (равносильно) — это многогранник, в основаниях которого лежат
 * равные многоугольники, а боковые грани — параллелограммы.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  14.09.2012
 */
public class Prism implements Shape {
    /**
     * Высота призмы.
     */
    private double h;
    /**
     * Длина бокового ребра.
     */
    private double l;

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
     * Возвращает длину бокового ребра.
     *
     * @return длина бокового ребра.
     * @see #setLateralEdgeLength(double)
     */
    public double getLateralEdgeLength() {
        return l;
    }

    /**
     * Устанавливает длину бокового ребра.
     *
     * @param l длина бокового ребра.
     * @see #getLateralEdgeLength()
     */
    public void setLateralEdgeLength(double l) {
        this.l = l;
    }

    /**
     * Создаёт новую призму.
     */
    private Prism() {
    }

    /**
     * Создаёт новую призму.
     *
     * @param h высота.
     * @param l длина бокового ребра.
     */
    private Prism(double h, double l) {
        this.h = h;
        this.l = l;
    }

    /**
     * Возвращает новую призму.
     *
     * @return новая призма.
     * @see #create(double, double)
     */
    public static Prism create() {
        return new Prism();
    }

    /**
     * Возвращает новую призму.
     *
     * @param h высота.
     * @param l длина бокового ребра.
     * @return новая призма.
     * @see #create()
     */
    public static Prism create(double h, double l) {
        return new Prism(h, l);
    }

    /**
     * Возвращает площадь боковой поверхности.
     *
     * @return площадь боковой поверхности.
     */
    @Override
    public double lateralSurfaceSquare() {
        return 0;  // TODO
    }

    /**
     * Возвращает площадь полной поверхности.
     *
     * @return площадь полной поверхонсти.
     */
    @Override
    public double totalSurfaceSquare() {
        return 0;  // TODO
    }

    /**
     * Возвращает объём.
     *
     * @return объём.
     */
    @Override
    public double volume() {
        return 0;  // TODO Объём призмы равен произведению её высоты на площадь основания
    }
}
