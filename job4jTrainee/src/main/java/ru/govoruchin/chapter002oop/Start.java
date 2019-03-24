package ru.govoruchin.chapter002oop;
import java.util.Arrays;
/**
 * Тестовая задача: кофе-машина.
 * Реализовать метод выдачи сдачи для автомата.
 * В автомате монеты наминалом 1 2 5 10 и купюры.
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Start {
    public static int main(String[] args) {
        CoffeeMashine mashine = new CoffeeMashine();
        int[] cash = mashine.changes(50, 35);
        System.out.println(Arrays.toString(cash));
        return 0;
    }
}
