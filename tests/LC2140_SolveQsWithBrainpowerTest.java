import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2140_SolveQsWithBrainpowerTest {

    LC2140_SolveQsWithBrainpower lc2140_solveQsWithBrainpower = new LC2140_SolveQsWithBrainpower();

    @Test
    void mostPoints1() {
        int[][] questions = {{3, 2}, {4, 3}, {4, 4}, {2, 5}};
        long expected = 5;
        long actual = lc2140_solveQsWithBrainpower.mostPoints(questions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void mostPoints2() {
        int[][] questions = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        long expected = 7;
        long actual = lc2140_solveQsWithBrainpower.mostPoints(questions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void mostPoints3() {
        int[][] questions = {{1, 1}, {2, 2}, {3, 2}, {4, 3}, {5, 2}, {6, 3}, {7, 2}, {8, 3}, {9, 2}, {
                10, 3}, {11, 2}, {12, 3}, {13, 2}, {14, 3}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {
                15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {
                15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {
                15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {15, 2}, {
                15, 2}, {15, 2}, {15, 2}};

        long expected = 224;
        long actual = lc2140_solveQsWithBrainpower.mostPoints(questions);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void mostPoints4() {
        // Case 33
        int[][] questions = {{67, 1}, {41, 2}, {77, 1}, {37, 4}, {26, 1}, {61, 4}, {42, 4}, {68, 5}, {85, 4}, {55, 4}, {68, 3}, {
                36, 5}, {35, 5}, {15, 5}, {52, 3}, {23, 3}, {53, 2}, {87, 2}, {68, 4}, {38, 5}, {57, 1}, {34, 3}, {59, 4}, {12, 4}, {64, 4}, {
                89, 3}, {80, 2}, {6, 2}, {68, 5}, {35, 1}, {18, 2}, {76, 1}, {59, 2}, {24, 4}, {33, 2}, {59, 4}, {15, 5}, {47, 4}, {77, 2}, {
                16, 3}, {75, 1}, {86, 4}, {8, 2}, {92, 3}, {32, 3}, {83, 4}, {81, 1}, {21, 5}, {91, 1}, {25, 2}, {5, 3}, {6, 3}, {21, 1}, {
                34, 5}, {57, 5}, {76, 5}, {31, 5}, {22, 3}, {2, 4}, {79, 5}, {75, 3}, {63, 3}, {78, 5}, {19, 2}, {50, 4}, {78, 5}, {81, 2}, {
                79, 1}, {57, 2}, {58, 1}, {74, 3}, {63, 2}, {24, 1}, {22, 1}, {4, 2}, {100, 2}, {43, 3}, {1, 1}, {3, 1}, {74, 4}, {42, 1}, {
                8, 5}, {32, 2}, {2, 3}, {38, 3}, {12, 5}, {100, 4}, {21, 5}, {14, 2}, {69, 4}, {51, 1}, {14, 5}, {30, 3}, {96, 3}, {65, 2}, {
                74, 1}, {74, 5}};
        long expected = 1728;
        long actual = lc2140_solveQsWithBrainpower.mostPoints(questions);

        Assertions.assertEquals(expected, actual);
    }
}
