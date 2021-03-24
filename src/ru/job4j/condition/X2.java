package ru.job4j.condition;

import org.junit.Assert;

public class X2 {

    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        //a = 1, b = 1, c = 1, x = 1
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

}
