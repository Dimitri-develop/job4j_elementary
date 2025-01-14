package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        //a = 10, b = 0, c = 0, x = 2
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /*Ожидаемое значение. */
        int expected = 40;
        /*Результат вычисления. */
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

        //a = 1, b = 1, c = 1, x = 1
    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /*Ожидаемое значение. */
        int expected = 3;
        /*Результат вычисления. */
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

        //a = 0, b = 1, c = 1, x = 1
    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /*Ожидаемое значение. */
        int expected = 2;
        /*Результат вычисления. */
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

        //a = 1, b = 1, c = 0, x = 1
    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /*Ожидаемое значение. */
        int expected = 2;
        /*Результат вычисления. */
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

        //a = 1, b = 1, c = 1, x = 0
    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /*Ожидаемое значение. */
        int expected = 1;
        /*Результат вычисления. */
        int rsl = X2.calc(a, b, c, x);
        /*Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }
}