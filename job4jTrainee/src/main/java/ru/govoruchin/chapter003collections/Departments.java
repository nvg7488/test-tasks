package ru.govoruchin.chapter003collections;

import java.util.*;

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
        String[] toSort = this.missing(departments);
        Set<String> sorted = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        sorted.addAll(Arrays.asList(toSort));
        String[] resultArray = new String[sorted.size()];
        return sorted.toArray(resultArray);
    }

    public String[] sortDec(String[] departments) {
        String[] toSort = this.missing(departments);
        Set<String> sorted = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int minimal = Math.min(o1.length(), o2.length());
                for (int index = 0; index < minimal; index++) {
                    Character leftChar = o1.charAt(index);
                    Character rightChar = o2.charAt(index);
                    if (rightChar.compareTo(leftChar) != 0) {
                        return rightChar - leftChar;
                    }
                }
                return o1.length() - o2.length();
            }
        });
        sorted.addAll(Arrays.asList(toSort));
        String[] result = new String[sorted.size()];
        return sorted.toArray(result);
    }

    public String[] missing(String[] departments) {
        Set<String> departmentsSet = new TreeSet<>();
        departmentsSet.addAll(Arrays.asList(departments));
        for (String department : departments) {
            ArrayList<Integer> positions = new ArrayList<>();
            for (int position = 0; position < department.length(); position++) {
                if (department.charAt(position) == '\\') {
                    positions.add(position);
                }
            }
            for (Integer position : positions) {
                char[] departmentAsChar = department.toCharArray();
                String code = new String(departmentAsChar, 0, position);
                departmentsSet.add(code);
            }
        }
        return departmentsSet.toArray(new String[departmentsSet.size()]);
    }
}