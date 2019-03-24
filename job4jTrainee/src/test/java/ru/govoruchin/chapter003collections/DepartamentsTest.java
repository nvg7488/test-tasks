package ru.govoruchin.chapter003collections;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DepartamentsTest {
    @Test
    public void testInc() {
        String[] array = {
                "K1\\SK1",
                "K1\\SK2",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"};
        Departments departments = new Departments();
        String[] expected = {
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"};
        assertThat(departments.sortInc(array), is(expected));
    }

    @Test
    public void testDec() {
        String[] array = {
                "K1\\SK1",
                "K1\\SK2",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K2",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"};
        Departments departments = new Departments();
        String[] expected = {
                "K2",
                "K2\\SK1\\SSK2",
                "K2\\SK1\\SSK1",
                "K1\\SK2",
                "K1\\SK1",
                "K1\\SK1\\SSK2",
                "K1\\SK1\\SSK1"};
        assertThat(departments.sortDec(array), is(expected));
    }
}