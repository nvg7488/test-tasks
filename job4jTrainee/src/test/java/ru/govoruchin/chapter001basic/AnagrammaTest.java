package ru.govoruchin.chapter001basic;
/**
 * @author Николай Говорухин (govoruchin_nv@mail.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class AnagrammaTest {
    @Test
    public void testTrue() {
        Anagramma anagramma = new Anagramma();
        assertThat(anagramma.words("мама", "амма"), is(true));
    }

    @Test
    public void testFalse() {
        Anagramma anagramma = new Anagramma();
        assertThat(anagramma.words("мама", "мапа"), is(false));
    }
}
