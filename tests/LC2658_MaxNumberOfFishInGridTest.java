import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC2658_MaxNumberOfFishInGridTest {

    LC2658_MaxNumberOfFishInGrid lC2658_MaxNumberOfFishInGrid = new LC2658_MaxNumberOfFishInGrid();

    @Test
    void findMaxFish1() {
        int[][] grid = {{0, 2, 1, 0}, {4, 0, 0, 3}, {1, 0, 0, 4}, {0, 3, 2, 0}};

        int expected = 7;
        int actual = lC2658_MaxNumberOfFishInGrid.findMaxFish(grid);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxFish2() {
        int[][] grid = {{4, 5, 5}, {0, 10, 0}};

        int expected = 24;
        int actual = lC2658_MaxNumberOfFishInGrid.findMaxFish(grid);

        Assertions.assertEquals(expected, actual);
    }

}
