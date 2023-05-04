import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC649_Dota2SenateTest {

    LC649_Dota2Senate lc649_dota2Senate = new LC649_Dota2Senate();

    @Test
    void predictPartyVictory1() {
        String senate = "RD";
        String expected = "Radiant";
        String actual = lc649_dota2Senate.predictPartyVictory(senate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void predictPartyVictory2() {
        String senate = "RDD";
        String expected = "Dire";
        String actual = lc649_dota2Senate.predictPartyVictory(senate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void predictPartyVictory3() {
        String senate = "RRRRDDDDDD";
        String expected = "Radiant";
        String actual = lc649_dota2Senate.predictPartyVictory(senate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void predictPartyVictory4() {
        String senate = "RRRRDDDDDDD";
        String expected = "Dire";
        String actual = lc649_dota2Senate.predictPartyVictory(senate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void predictPartyVictory5() {
        String senate = "RDDDRRDR";
        String expected = "Dire";
        String actual = lc649_dota2Senate.predictPartyVictory(senate);

        Assertions.assertEquals(expected, actual);
    }

}
