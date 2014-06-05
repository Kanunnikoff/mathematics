/*
 * @(#)Result.java     1.0.0  31.01.13
 *
 * Copyright (c) 2013 Dmitry Tsechoev.
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
package org.itmuslim.science.mathematics.algebra.numericalmethod.equation;

/**
 * Обёртка для корня уравнения.
 *
 * @author Dmitry Tsechoev 31.01.13 17:03
 * @version 1.0.0
 */
public class Root {
    /**
     * Значение корня.
     */
    private double value;
    /**
     * Признак наличия корня.
     */
    private boolean present;
    /**
     * Количество итераций для достижения корня.
     */
    private int iterationsCount;

    /**
     * Возвращает значение корня.
     *
     * @return корень.
     * @see #setValue(double)
     */
    public double getValue() {
        return value;
    }

    /**
     * Устанавливает значение корня.
     *
     * @param value корень.
     * @see #getValue()
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Возвращает признак наличия корня.
     *
     * @return true, если корень есть; false - в противном случае.
     * @see #setPresent(boolean)
     */
    public boolean isPresent() {
        return present;
    }

    /**
     * Устаналивает признак наличия корня.
     *
     * @param present признак наличия корня.
     * @see #isPresent()
     */
    public void setPresent(boolean present) {
        this.present = present;
    }

    /**
     * Возвращает количество итераций для достижения корня.
     *
     * @return количество итераций.
     * @see #setIterationsCount(int)
     */
    public int getIterationsCount() {
        return iterationsCount;
    }

    /**
     * Устанавливает количество итераций для достижения корня.
     *
     * @param iterationsCount количество итераций.
     * @see #getIterationsCount()
     */
    public void setIterationsCount(int iterationsCount) {
        this.iterationsCount = iterationsCount;
    }

    /**
     * Создаёт новую обёртку для корня.
     * @see #Root(double, boolean)
     * @see #Root(double, boolean, int)
     */
    public Root() {
    }

    /**
     * Создаёт новую обёртку для корня.
     * @param value значение корня.
     * @param present признак наличия корня.
     * @see #Root()
     * @see #Root(double, boolean, int)
     */
    public Root(double value, boolean present) {
        this.value = value;
        this.present = present;
    }

    /**
     * Создаёт новую обёртку для корня.
     * @param value значение корня.
     * @param present признак наличия корня.
     * @param iterationsCount количество итераций для достижения корня.
     * @see #Root()
     * @see #Root(double, boolean)
     */
    public Root(double value, boolean present, int iterationsCount) {
        this.value = value;
        this.present = present;
        this.iterationsCount = iterationsCount;
    }
}
