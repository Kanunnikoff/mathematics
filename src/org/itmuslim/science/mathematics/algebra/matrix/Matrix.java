/*
 * @(#)Matrix.java     1.0  28.03.2012
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
package org.itmuslim.science.mathematics.algebra.matrix;

import org.itmuslim.science.mathematics.algebra.vector.Vector;

import java.util.Random;

/**
 * Матрица вещественных чисел.
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0  28.03.2012
 */
public class Matrix {
    private double[][] elements;
    private int rowsCount;
    private int columnsCount;

    /**
     * Возвращает элементы.
     *
     * @return элементы вещественного типа.
     */
    public double[][] getElements() {
        return elements;
    }

    /**
     * Возвращает элемент с индексами i и j.
     *
     * @param i номер строки.
     * @param j номер столбца.
     * @return элемент с индексами i и j.
     * @see #set(int, int, double)
     */
    public double get(int i, int j) {
        return elements[i][j];
    }

    /**
     * Устанавливает значение для элемента с индексами i и j.
     *
     * @param i номер строки.
     * @param j номер столбца.
     * @param value значение.
     * @see #get(int, int)
     */
    public void set(int i, int j, double value) {
        elements[i][j] = value;
    }

    /**
     * Возвращает количество строк.
     *
     * @return количество строк.
     * @see #getColumnsCount()
     */
    public int getRowsCount() {
        return rowsCount;
    }

    /**
     * Возвращает количество столбцов.
     *
     * @return количество столбцов.
     * @see #getRowsCount()
     */
    public int getColumnsCount() {
        return columnsCount;
    }

    /**
     * Создаёт новую матрицу с указанным числом строк и столбцов.
     *
     * @param rowsCount количество строк.
     * @param columnsCount количество столбцов.
     */
    private Matrix(int rowsCount, int columnsCount) {
        elements = new double[rowsCount][columnsCount];
        this.rowsCount = rowsCount;
        this.columnsCount = columnsCount;
    }

    /**
     * Возвращает новую матрицу.
     *
     * @param rowsCount количество строк.
     * @param columnsCount количество столбцов.
     * @return матрица с указанным числом строк и столбцов.
     */
    public static Matrix create(int rowsCount, int columnsCount) {
        return new Matrix(rowsCount, columnsCount);
    }

    /**
     * Вычисляет определитель.
     *
     * @return вещественное число.
     * @throws EmptyMatrixException если матрица пуста.
     * @see #isEmpty()
     * @see #determinant()
     */
    public double determinant() throws EmptyMatrixException {
        double det = 0.0;

        if(isEmpty()) throw new EmptyMatrixException("matrix is empty");
        else if(columnsCount == 1) return elements[0][0];
        else if(columnsCount == 2) return elements[0][0] * elements[1][1] - elements[0][1] * elements[1][0];
        else if(columnsCount == 3) {
            det = elements[0][0] * elements[1][1] * elements[2][2] + elements[0][1] * elements[1][2] * elements[2][0] + elements[1][0] * elements[2][1] * elements[0][2];
            det -= elements[0][2] * elements[1][1] * elements[2][0] + elements[0][1] * elements[1][0] * elements[2][2] + elements[0][0] * elements[1][2] * elements[2][1];
        } else {
            for(int j = 0; j < columnsCount; j++)
                det += Math.pow(-1, j) * elements[1][j] * matrixForMinor(1, j).determinant();
        }

        return det;
    }

    /**
     * Возвращает матрицу с вычеркнутыми i-й строкой и j-м столбцом (матрица для минора, нужного для алгебраического
     * дополнения).
     *
     * @param ia строка для вычёркивания.
     * @param ja столбец для вычёркивания.
     * @return матрица с вычеркнутыми i-й строкой и j-м столбцом.
     * @see #create(int, int)
     * @see #getElements()
     */
    private Matrix matrixForMinor(int ia, int ja) {
        Matrix matrix = create(rowsCount - 1, columnsCount - 1);

        int n = 0;
        for(int i = 0; i < rowsCount; i++) {
            int m = 0;
            for(int j = 0; j < columnsCount; j++)
                if(i != ia && j != ja)
                    matrix.getElements()[n][m++] = elements[i][j];

            if(n != ia) n++;
        }

        return matrix;
    }

    /**
     * Копирует данную матрицу.
     *
     * @return копия данной матрицы (тоже матрица, естественно).
     * @see #create(int, int)
     * @see #getElements
     */
    public Matrix copy() {
        Matrix matrix = create(rowsCount, columnsCount);

        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                matrix.getElements()[i][j] = elements[i][j];

        return matrix;
    }

    /**
     * Возвращает матрицу, противоположную данной.
     *
     * @return противоположная данной матрица.
     * @see #multiply(double)
     */
    public Matrix negate() {
        return multiply(-1);
    }

    /**
     * Возвращает обратную  матрицу по отношению к данной.
     * Обратная матрица — такая матрица <code>A<sup>−1</sup></code>, при умножении на которую исходная матрица
     * <code>A</code> даёт в результате единичную матрицу E.
     *
     * @return матрица, обратная к данной.
     * @see #determinant()
     * @see #cofactorsMatrix()
     * @see #transpose()
     * @see #multiply(double)
     * @throws EmptyMatrixException если матрица пуста.
     * @throws InvertMatrixNotPresentException если определитель матрицы равен нулю (обратной матрицы не существует).
     * @throws NotEqualDimensionsException если матрица не квадратная.
     */
    public Matrix invert() throws InvertMatrixNotPresentException, NotEqualDimensionsException, EmptyMatrixException {
        double det = determinant();
        if(-0.0000000001 < det && det < 0.0000000001) throw new InvertMatrixNotPresentException("determinant is zero");
        if(rowsCount != columnsCount) throw new NotEqualDimensionsException("matrix must be square");

        return cofactorsMatrix().transpose().multiply(1 / det);
    }

    /**
     * Возвращает матрицу алгебраических дополнений.
     *
     * @return матрица алгебраических дополнений.
     * @see #create(int, int)
     * @see #getElements()
     * @see #determinant()
     * @throws EmptyMatrixException если матрица пуста.
     */
    public Matrix cofactorsMatrix() throws EmptyMatrixException {
        Matrix matrix = create(rowsCount, columnsCount);

        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                matrix.getElements()[i][j] = matrixForMinor(i, j).determinant();

        return matrix;
    }

    /**
     * Транспонирует.
     *
     * @return транспонированная по отношенибю к данной матрица.
     * @see #create(int, int)
     * @see #getElements()
     */
    public Matrix transpose() {
        Matrix matrix = create(rowsCount, columnsCount);

        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                matrix.getElements()[i][j] = elements[j][i];

        return matrix;
    }

    /**
     * Выполняет сложение с указанной матрицей.
     *
     * @param matrix матрица для сложения с данной.
     * @return результат сложения (матрица).
     * @see #create(int, int)
     * @see #getElements()
     * @throws NotEqualDimensionsException если размерности  матриц не совпадают.
     */
    public Matrix add(Matrix matrix) throws NotEqualDimensionsException {
        if(rowsCount != matrix.getRowsCount() || columnsCount != matrix.getColumnsCount())
            throw new NotEqualDimensionsException("dimensions of the matrices must be equal");
        Matrix result = create(rowsCount, columnsCount);

        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                result.getElements()[i][j] = elements[i][j] + matrix.getElements()[i][j];

        return result;
    }

    /**
     * Выполняет вычитание указанной матрицы.
     *
     * @param matrix матрица для вычитания из данной.
     * @return результат вычитания (матрица).
     * @see #add(Matrix)
     * @see #negate()
     * @throws NotEqualDimensionsException если размерности  матриц не совпадают.
     */
    public Matrix subtract(Matrix matrix) throws NotEqualDimensionsException {
        return add(matrix.negate());
    }

    /**
     * Выполняет умножение на указанную матрицу.
     *
     * @param matrix матрица для умножения с данной.
     * @return результат умножения.
     * @see #getRowsCount()
     * @see #getElements()
     * @see #multiply(double)
     * @throws NotEqualDimensionsException если каличество столбцов первой матрицы не совпадает с количеством строк второй.
     */
    public Matrix multiply(Matrix matrix) throws NotEqualDimensionsException {
        if(columnsCount != matrix.getRowsCount())
            throw new NotEqualDimensionsException("columns count in the first matrix must be equal rows count in the second one");

        Matrix result = Matrix.create(rowsCount, matrix.getColumnsCount());

        for(int i = 0; i < rowsCount; i++) {
            for(int k = 0; k < matrix.getColumnsCount(); k++) {
                double summ = 0.0;
                for(int j = 0; j < matrix.getRowsCount(); j++) {
                    summ += elements[i][j] * matrix.getElements()[j][k];
                    result.getElements()[i][k] = summ;
                }
            }
        }

        return result;
    }

    /**
     * Выполняет умножение на число.
     *
     * @param a число для умножения на данную матрицу.
     * @return результат умножения (матрица).
     * @see #copy()
     * @see #getElements()
     * @see #multiply(Matrix)
     */
    public Matrix multiply(double a) {
        Matrix matrix = copy();

        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                matrix.getElements()[i][j] = a * matrix.getElements()[i][j];

        return matrix;
    }

    /**
     * Определяет, вырожденная матрица или нет.
     *
     * @return true, если вырожденная; false - в противном случае.
     * @throws EmptyMatrixException если матрица пуста.
     */
    public boolean isSingular() throws EmptyMatrixException {
        double det = determinant();
        return -0.0000000001 < det && det < 0.0000000001;
    }

    /**
     * Случайным образом запролняет матрицу.
     */
    public void fillAtRandom() {
        Random random = new Random();
        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++) {
                int a = random.nextInt(10);
                if(a < 5) elements[i][j] = -random.nextInt(10);
                else elements[i][j] = random.nextInt(10);
            }
    }

    /**
     * Выводит матрицу на экран.
     */
    public void printToScreen() {
        for(int i = 0; i < rowsCount; i++) {
            System.out.print("(");
            for(int j = 0; j < columnsCount; j++) {
                System.out.print("  " + elements[i][j]);
            }
            System.out.println(" )");
        }
    }

    /**
     * Возвращает признак того, что матрица нулевая.
     * Нулевая матрица — это матрица, все элементы которой равны нулю.
     *
     * @return true, если нулевая; false - в противном случае.
     * @see #isIdentity()
     */
    public boolean isZero() {
        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                if(0.0000000001 < elements[i][j] || elements[i][j] < -0.0000000001) {
                    return false;
                }

        return true;
    }

    /**
     * Возвращает признак того, что матирица является единичной.
     * Единичная матрица — квадратная матрица, элементы главной диагонали которой равны единице, а остальные равны нулю.
     *
     * @return true, если единичная; false - в противном случае.
     * @see #isZero()
     * @throws NotEqualDimensionsException если матрица не квадратная.
     */
    public boolean isIdentity() throws NotEqualDimensionsException {
        if(rowsCount != columnsCount) throw new NotEqualDimensionsException("matrix must be square");
        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                if(i == j && (1 + 0.0000000001 < elements[i][j] || elements[i][j] < 1 - 0.0000000001)) {
                    return false;
                } else
                if(i != j && (0.0000000001 < elements[i][j] || elements[i][j] < -0.0000000001)) {
                    return false;
                }

        return true;
    }

    /**
     * Возвращает признак того, что матрица диагональная.
     * Диагональная матрица — квадратная матрица, все элементы которой, стоящие вне главной диагонали, равны нулю.
     *
     * @return true, если диагональная; false - в противном случае.
     * @throws NotEqualDimensionsException если матрица не квадратная.
     */
    public boolean isDiagonal() throws NotEqualDimensionsException {
        if(rowsCount != columnsCount) throw new NotEqualDimensionsException("matrix must be square");
        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                if(i != j && (0.0000000001 < elements[i][j] || elements[i][j] < -0.0000000001)) {
                    return false;
                }

        return true;
    }

    /**
     * Возвращает признак того, что матрица пуста.
     *
     * @return true, если пуста; false - в противном случае.
     */
    public boolean isEmpty() {
        return columnsCount == 0;
    }

    /**
     * Возвращает признак того, что матрицы равны.
     *
     * @param matrix матрица, равенство с которой нужно проверить.
     * @return true, если равны; false - в противном случае.
     * @see #getRowsCount()
     * @see #getColumnsCount()
     * @see #getElements()
     */
    public boolean isEqual(Matrix matrix) {
        if(rowsCount != matrix.getRowsCount() || columnsCount != matrix.getColumnsCount()) return false;

        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++)
                if(0.0000000001 < elements[i][j] - matrix.getElements()[i][j] || elements[i][j] - matrix.getElements()[i][j] < -0.0000000001)
                    return false;

        return true;
    }

    /**
     * Вставляет новый столбец.
     *
     * @param column вектор-столбец.
     * @param position позиция для вставки (номер столбца).
     * @return новая матрица со вставленным столбцом.
     * @throws NotEqualDimensionsException если количество строк матрицы и количество элементов вставляемого столбца не
     * совпадают.
     * @see Vector
     * @see #insertRow(Vector, int)
     */
    public Matrix insertColumn(Vector column, int position) throws NotEqualDimensionsException {
        if(rowsCount != column.dimension()) throw new NotEqualDimensionsException();

        Matrix result = Matrix.create(rowsCount, columnsCount + 1);

        int k = 0;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount + 1; j++) {
                if(j < position) {
                    result.getElements()[i][j] = elements[i][j];
                } else if(j == position) {
                    result.getElements()[i][j] = column.getCoordinates()[k++];
                } else {
                    result.getElements()[i][j] = elements[i][j - 1];
                }
            }
        }

        return result;
    }

    /**
     * Вставляет новую стороку.
     *
     * @param row вектор-строка.
     * @param position позиция для вставки (номер строки).
     * @return новая матрица со вставленной строкой.
     * @throws NotEqualDimensionsException если количество столбцов матрицы и количество элементов вставляемой строки не
     * совпадают.
     * @see Vector
     * @see #insertColumn(Vector, int)
     */
    public Matrix insertRow(Vector row, int position) throws NotEqualDimensionsException {
        if(columnsCount != row.dimension()) throw new NotEqualDimensionsException();

        Matrix result = Matrix.create(rowsCount + 1, columnsCount);

        int k = 0;
        for (int j = 0; j < columnsCount; j++) {
            for (int i = 0; i < rowsCount + 1; i++) {
                if(i < position) {
                    result.getElements()[i][j] = elements[i][j];
                } else if(i == position) {
                    result.getElements()[i][j] = row.getCoordinates()[k++];
                } else {
                    result.getElements()[i][j] = elements[i - 1][j];
                }
            }
        }

        return result;
    }

    /**
     * Заменяет столбец.
     *
     * @param column вектор-стобец.
     * @param position позиция для замены (номер столбца).
     * @return новая матрица с заменённым столбцом.
     * @throws NotEqualDimensionsException если количество строк матрицы и количество элементов нового столбца не
     * совпадают.
     * @see Vector
     * @see #replaceRow(Vector, int)
     */
    public Matrix replaceColumn(Vector column, int position) throws NotEqualDimensionsException {
        if(rowsCount != column.dimension()) throw new NotEqualDimensionsException();

        Matrix result = copy();

        int k = 0;
        for (int i = 0; i < rowsCount; i++)
            result.getElements()[i][position] = column.getCoordinates()[k++];

        return result;
    }

    /**
     * Заменяет строку.
     *
     * @param row вектор-строка.
     * @param position позиция для замены (номер строки).
     * @return новая матрица с заменённой строкой.
     * @throws NotEqualDimensionsException если количество столбцов матрицы и количество элементов новой строки не
     * совпадают.
     * @see Vector
     * @see #replaceColumn(Vector, int)
     */
    public Matrix replaceRow(Vector row, int position) throws NotEqualDimensionsException {
        if(columnsCount != row.dimension()) throw new NotEqualDimensionsException();

        Matrix result = copy();

        int k = 0;
        for (int j = 0; j < columnsCount; j++)
            result.getElements()[position][j] = row.getCoordinates()[k++];

        return result;
    }

}