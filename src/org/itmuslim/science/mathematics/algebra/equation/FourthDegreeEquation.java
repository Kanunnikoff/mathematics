/*
 * @(#)FourthDegreeEquation.java   1.0       05.02.2012 00:00
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
package org.itmuslim.science.mathematics.algebra.equation;

import java.util.List;

/**
 * Class description...
 *
 * @author Dmitry Tsechoev (OPCTXO)
 * @version 1.0       05.02.2012
 */
public class FourthDegreeEquation implements Equation {
    public FourthDegreeEquation(double a, double b, double c) {
        //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public List<Double> solve() {
        return null;
    }

    /**
     * Возвращает результат вычисления значения функции f(x) = a<inf>n</inf>*x<sup>n</sup> +
     * a<inf>n-1</inf>*x<sup>n-1</sup> + ... + a<inf>1</inf>.
     *
     * @param x значение аргумента.
     * @return значение функции.
     */
    @Override
    public double f(double x) { // TODO
        return 0;
    }
}
