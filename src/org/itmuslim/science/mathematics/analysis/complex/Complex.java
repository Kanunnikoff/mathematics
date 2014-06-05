/*
 * @(#)Complex.java        1.0 07.01.2013
 *
 * Copyright (c) 2013 Dmitry Tsechoev
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
package org.itmuslim.science.mathematics.analysis.complex;

/**
 * Комплексное число.
 *
 * @author Dmitry Tsechoev
 * @version 1.0 07.01.2013
 */
public class Complex {
    /**
     * Действительная часть.
     */
    private double real;
    /**
     * Мнимая часть.
     */
    private double imaginary;

    /**
     * Создаёт новое комплексное число.
     */
    private Complex() {
    }

    /**
     * Создаёт новое комплексное число с действительной частью <i>real</i> и мнимой частью <i>imaginary</i>.
     *
     * @param real действительная часть.
     * @param imaginary мнимая часть.
     */
    private Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Возвращает новое комплексное число.
     */
    public static Complex create() {
        return new Complex();
    }

    /**
     * Возвращает новое комплексное число с действительной частью <i>real</i> и мнимой частью <i>imaginary</i>.
     *
     * @param real действительная часть.
     * @param imaginary мнимая часть.
     */
     public static Complex create(double real, double imaginary) {
        return new Complex(real, imaginary);
    }

    /**
     * Возвращает действительную часть.
     *
     * @return действительная часть.
     * @see #setReal(double)
     */
    public double getReal() {
        return real;
    }

    /**
     * Устанавливает действительную часть.
     *
     * @param real дейстивительная часть.
     * @see #getReal()
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Возвращает мнимую часть.
     *
     * @return мнимая часть.
     * @see #setImaginary(double)
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Устанавливает мнимую часть.
     *
     * @param imaginary мнимая часть.
     * @see #getImaginary()
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Возвращает копию данного комплексного числа.
     *
     * @return копия данного комплексного числа.
     * @see #create(double, double) ()
     */
    public Complex copy() {
        return create(real, imaginary);
    }

    /**
     * Возвращает результат сложения заданного комплексного числа с данным.
     *
     * @param complex заданное комплексное число.
     * @return результат сложения.
     * @see #create(double, double)
     */
    public Complex add(Complex complex) {
        return create(real + complex.getReal(), imaginary + complex.getImaginary());
    }

    /**
     * Возвращает результат умножения заданного числа на данное.
     *
     * @param complex множитель.
     * @return результат умножения.
     * @see #create(double, double)
     * @see #multiply(double)
     */
    public Complex multiply(Complex complex) {
        return create(real * complex.getReal() - imaginary * complex.getImaginary(), real * complex.getImaginary() + imaginary * complex.getReal());
    }

    /**
     * Возвращает результат умножения заданного комплексного числа на вещественное число.
     *
     * @param a множитель.
     * @return результат умножения.
     * @see #create(double, double)
     * @see #multiply(Complex)
     */
    public Complex multiply(double a) {
        return create(real * a, imaginary * a);
    }

    /**
     * Возвращает число, противоположное данному.
     *
     * @return противоположное число.
     * @see #multiply(double)
     */
    public Complex negate() {
        return multiply(-1);
    }

    /**
     * Возвращает результат вычитания заданного числа из данного.
     *
     * @param complex вычитаемое.
     * @return результат вычитания.
     * @see #add(Complex)
     * @see #negate()
     */
    public Complex subtract(Complex complex) {
        return add(complex.negate());
    }

    /**
     * Возвращает результат деления данного числа на заданное.
     *
     * @param complex делитель.
     * @return результат деления.
     * @see #create(double, double)
     */
    public Complex divide(Complex complex) {
        double r = (real * complex.getReal() + imaginary * complex.getImaginary()) / (Math.pow(complex.getReal(), 2) + Math.pow(complex.getImaginary(), 2));
        double i = (imaginary * complex.getReal() - real * complex.getImaginary()) / (Math.pow(complex.getReal(), 2) + Math.pow(complex.getImaginary(), 2));
        return create(r, i);
    }

    /**
     * Возвращает число, комплексно сопряжённое данному.
     *
     * @return сопряжённое число.
     * @see #create(double, double)
     */
    public Complex conjugate() {
        return create(real, -imaginary);
    }

    /**
     * Возвращает модуль комплексного числа.
     *
     * @return модуль числа.
     */
    public double module() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    /**
     * Возвращает аргумент числа.
     *
     * @return аргумент.
     */
    public double arg() {
        return Math.atan(imaginary / real);
    }

    /**
     * Возвращает признак равенства заданного числа с данным.
     *
     * @param complex заданное число.
     * @return true, если числа равны; false - в противном случае.
     */
    public boolean equal(Complex complex) {
        return (-0.0000000001 < real - complex.getReal() && real - complex.getReal() < 0.0000000001) &&
               (-0.0000000001 < imaginary - complex.getImaginary() && imaginary - complex.getImaginary() < 0.0000000001);
    }
}
