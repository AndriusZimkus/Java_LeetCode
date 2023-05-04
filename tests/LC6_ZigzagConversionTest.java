import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC6_ZigzagConversionTest {

    LC6_ZigzagConversion lc6_zigzagConversion = new LC6_ZigzagConversion();

    @Test
    void convert1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String actual = lc6_zigzagConversion.convert(s, numRows);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String actual = lc6_zigzagConversion.convert(s, numRows);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convert3() {
        String s = "A";
        int numRows = 1;
        String expected = "A";
        String actual = lc6_zigzagConversion.convert(s, numRows);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convert4() {
        String s = "A";
        int numRows = 2;
        String expected = "A";
        String actual = lc6_zigzagConversion.convert(s, numRows);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convert5() {
        String s = "AB";
        int numRows = 1;
        String expected = "AB";
        String actual = lc6_zigzagConversion.convert(s, numRows);

        Assertions.assertEquals(expected, actual);
    }
}
