import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC58_LengthOfLastWordTest {

    LC58_LengthOfLastWord lc58_lengthOfLastWord = new LC58_LengthOfLastWord();

    @Test
    void lengthOfLastWord1() {
        String s = "Hello World";
        int expected = 5;
        int actual = lc58_lengthOfLastWord.lengthOfLastWord(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lengthOfLastWord2() {
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        int actual = lc58_lengthOfLastWord.lengthOfLastWord(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lengthOfLastWord3() {
        String s = "luffy is still joyboy";
        int expected = 6;
        int actual = lc58_lengthOfLastWord.lengthOfLastWord(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lengthOfLastWord4() {
        String s = "a ";
        int expected = 1;
        int actual = lc58_lengthOfLastWord.lengthOfLastWord(s);

        Assertions.assertEquals(expected, actual);

    }
}
