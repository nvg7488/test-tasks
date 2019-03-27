package ru.govoruchin.chapter001basic;
import java.util.Arrays;
/**
 * Тестовая задача:
 * Реализовать алгоритм проверки являются ли два слова анаграммой.
 * Анаграмма - это механизм получения нового слово путем перестановки букв.
 * Например:
 * мама, амма = true
 * мама, мааа = false
 *
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
public class Anagramma {
    public boolean words(String word1, String word2) {
        boolean result;
        char[] ch1 = word1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = word2.toCharArray();
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}