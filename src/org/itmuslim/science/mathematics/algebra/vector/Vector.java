/*
 * @(#)Vector.java     1.0  29.03.2012
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
package org.itmuslim.science.mathematics.algebra.vector;

/**
 * Вектор.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  29.03.2012
 */
public class Vector {
    private double[] coordinates;

    /**
     * Возвращает набор координат вектора.
     *
     * @return массив координат вещественного типа.
     */
    public double[] getCoordinates() {
        return coordinates;
    }

    /**
     * Возвращает i-ю координату вектора.
     *
     * @param i координата.
     * @return координата вектора под номером i.
     * @see #set(int, double)
     */
    public double get(int i) {
        return coordinates[i];
    }

    /**
     * Устанавливает значение координаты под номером i.
     *
     * @param i номер координаты.
     * @param value новое значение.
     * @see #get(int)
     */
    public void set(int i, double value) {
        coordinates[i] = value;
    }

    /**
     * Создаёт новый вектор с заданным количеством нулевых координат.
     *
     * @param count число координат.
     */
    private Vector(int count) {
        coordinates = new double[count];
    }

    /**
     * Создаёт новый вектор из набора планируемых координат.
     *
     * @param coordinates планируемые координаты.
     */
    private Vector(double[] coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Возвращает новый вектор с заданным количеством нулевых координат.
     *
     * @param count число координат.
     * @return новый вектор.
     * @see #Vector(int)
     */
    public static Vector create(int count) {
        return new Vector(count);
    }

    /**
     * Возвращает новый вектор из набора планируемых координат.
     *
     * @param coordinates планируемые координаты.
     * @return новый вектор.
     * @see #Vector(double[])
     */
    public static Vector create(double[] coordinates) {
        return new Vector(coordinates);
    }

    /**
     * Возвращает размерность вектора (число координат).
     *
     * @return размерность.
     */
    public int dimension() {
        return coordinates.length;
    }

    /**
     * Возвращает копию данного вектора.
     *
     * @return вектор-копия.
     * @see #create(double[])
     */
    public Vector copy() {
        return create(coordinates.clone());
    }

    /**
     * Возвращает вектор, обратный данному (противоположные по направлению).
     *
     * @return вектор, противоположный по направлению к данному.
     * @see #multiply(double)
     */
    public Vector negate() {
        return multiply(-1);
    }

    /**
     * Возвращает результат сложения двух векторов.
     *
     * @param vector вектор для сложения с данным.
     * @return вектор, получившийся в результате сложения двух векторов.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #getCoordinates()
     * @see #create(int)
     */
    public Vector add(Vector vector) throws NotEqualDimensionsException {
        if (coordinates.length != vector.getCoordinates().length) throw new NotEqualDimensionsException();
        Vector result = create(coordinates.length);

        for (int i = 0; i < coordinates.length; i++)
            result.getCoordinates()[i] = coordinates[i] + vector.getCoordinates()[i];

        return result;
    }

    /**
     * Возвращает результат вычитания одного вектора из другого.
     *
     * @param vector вычитаемый вектор.
     * @return вектор, получившийся в результате вычитания векторов.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #negate()
     * @see #add(Vector)
     */
    public Vector subtract(Vector vector) throws NotEqualDimensionsException {
        return add(vector.negate());
    }

    /**
     * Возвращает результат умножения вектора на число (скаляр).
     *
     * @param a скаляр для умножения на данный вектор.
     * @return вектор, получившийся в результате умножения данного вектора на число.
     * @see #getCoordinates()
     * @see #copy()
     */
    public Vector multiply(double a) {
        Vector vector = copy();

        for (int i = 0; i < coordinates.length; i++)
            vector.getCoordinates()[i] = a * vector.getCoordinates()[i];

        return vector;
    }

    /**
     * Возвращает длину вектора.
     *
     * @return вещественное значение длины.
     */
    public double length() {
        double sum = 0.0;
        for (double coordinate : coordinates)
            sum += Math.pow(coordinate, 2);

        return Math.sqrt(sum);
    }

    /**
     * Возвращает результат скалярного произведения векторов.
     *
     * @param vector вектор, скалярное произведение с которым нужно вычислить.
     * @return вещественное значение скалярного произведения.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #multiply(Vector, double)
     * @see #getCoordinates()
     */
    public double multiply(Vector vector) throws NotEqualDimensionsException {
        if (coordinates.length != vector.getCoordinates().length) throw new NotEqualDimensionsException();

        double sum = 0.0;
        for (int i = 0; i < coordinates.length; i++)
            sum += coordinates[i] * vector.getCoordinates()[i];

        return sum;
    }

    /**
     * Возвращает результат скалярного произведения векторов.
     *
     * @param vector вектор, скалярное произведение с которым нужно вычислить.
     * @param angle  угол между векторами.
     * @return вещественное значение скалярного произведения.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #multiply(Vector)
     * @see #getCoordinates()
     * @see #length()
     */
    public double multiply(Vector vector, double angle) throws NotEqualDimensionsException {
        if (coordinates.length != vector.getCoordinates().length) throw new NotEqualDimensionsException();

        return length() * vector.length() * Math.cos(angle);
    }

    /**
     * Проверяет векторы на ортогональность (перпендикулярность).
     *
     * @param vector вектор, ортогональность которого с данным нужно проверить.
     * @return true, если векторы ортогональны; false - в противном случае.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #multiply(Vector)
     * @see #angle(Vector)
     * @see #isCollinear(Vector)
     */
    public boolean isOrthogonal(Vector vector) throws NotEqualDimensionsException {
        double scalarMultiplication = multiply(vector);
        return -0.0000000001 < scalarMultiplication && scalarMultiplication < 0.0000000001;
    }

    /**
     * Возвращает угол между векторами.
     *
     * @param vector вектор, угол между которым и данным нужно рассчитать.
     * @return вещественное значение угла.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #length()
     * @see #multiply(Vector)
     */
    public double angle(Vector vector) throws NotEqualDimensionsException {
        if (isZero() || vector.isZero()) return 0.0;
        else return Math.acos(multiply(vector) / (length() * vector.length()));
    }

    /**
     * Возвращает признак того, что вектор нулевой.
     *
     * @return true, если вектор нулевой; false - в противном случае.
     * @see #length()
     */
    public boolean isZero() {
        double length = length();
        return -0.0000000001 < length && length < 0.0000000001;
    }

    /**
     * Возвращает признак коллинеарности векторов.
     *
     * @param vector вектор, коллинеарность которого с данным нужно проверить.
     * @return true, если векторы коллинеарны; false - в противном случае.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     * @see #angle(Vector)
     * @see #isOrthogonal(Vector)
     */
    public boolean isCollinear(Vector vector) throws NotEqualDimensionsException {
        double angle = angle(vector);
        return (-0.0000000001 < angle && angle < 0.0000000001) || (180 - 0.0000000001 < angle && angle < 180 + 0.0000000001);
    }

    /**
     * Возвращает признак сонаправленности векторов.
     *
     * @param vector вектор, сонаправленность которого с данным нужно проверить.
     * @return true, если векторы сонаправлены; false - в противном случае.
     * @throws NotEqualDimensionsException если размерности векторов не совпадают.
     */
    public boolean isDirected(Vector vector) throws NotEqualDimensionsException {
        double angle = angle(vector);
        return -0.0000000001 < angle && angle < 0.0000000001;
    }
}
