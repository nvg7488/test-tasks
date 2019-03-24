package ru.govoruchin.chapter003collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Тестовая задача: Отсортировать департаменты.
 * В организации было решено ввести справочник подразделений.
 * Коды подразделений представлены в виде массива строк.
 * Реализовать возможность сортировки массива кодов подразделений по возрастанию и убыванию,
 * при которых сохранялась бы иерархическая структура (показано далее в примерах сортировки),
 * т.к. отсортированный массив используется для отображения категорий пользователю.
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Departments {
    public String[] sortInc(String[] departments) {
        Set<String> sorted = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        sorted.addAll(Arrays.asList(departments));
        String[] result = new String[sorted.size()];
        return sorted.toArray(result);
    }

    public String[] sortDec(String[] departments) {
        Set<String> sorted = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int min = Math.min(o1.length(), o2.length());
                for (int index = 0; index < min; index++) {
                    Character left = o1.charAt(index);
                    Character right = o2.charAt(index);
                    if (right.compareTo(left) != 0) {
                        return right - left;
                    }
                }
                return o1.length() - o2.length();
            }
        });
        sorted.addAll(Arrays.asList(departments));
        String[] result = new String[sorted.size()];
        return sorted.toArray(result);
    }
}
