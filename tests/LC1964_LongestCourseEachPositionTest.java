import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1964_LongestCourseEachPositionTest {

    LC1964_LongestCourseEachPosition lc1964_longestCourseEachPosition = new LC1964_LongestCourseEachPosition();

    @Test
    void longestObstacleCourseAtEachPosition1() {
        int[] obstacles = {1, 2, 3, 2};
        int[] expected = {1, 2, 3, 3};
        int[] actual = lc1964_longestCourseEachPosition.longestObstacleCourseAtEachPosition(obstacles);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void longestObstacleCourseAtEachPosition2() {
        int[] obstacles = {2, 2, 1};
        int[] expected = {1, 2, 1};
        int[] actual = lc1964_longestCourseEachPosition.longestObstacleCourseAtEachPosition(obstacles);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void longestObstacleCourseAtEachPosition3() {
        int[] obstacles = {3, 1, 5, 6, 4, 2};
        int[] expected = {1, 1, 2, 3, 2, 2};
        int[] actual = lc1964_longestCourseEachPosition.longestObstacleCourseAtEachPosition(obstacles);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void longestObstacleCourseAtEachPosition4() {
        int[] obstacles = {3, 3, 1, 1, 1, 5, 5, 4, 3};
        int[] expected = {1, 2, 1, 2, 3, 4, 5, 4, 4};
        int[] actual = lc1964_longestCourseEachPosition.longestObstacleCourseAtEachPosition(obstacles);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void longestObstacleCourseAtEachPosition5() {
        int[] obstacles = {3, 3, 1, 1, 1, 5, 5, 4, 3};
        int[] expected = {1, 2, 1, 2, 3, 4, 5, 4, 4};
        int[] actual = lc1964_longestCourseEachPosition.longestObstacleCourseAtEachPosition(obstacles);

        Assertions.assertArrayEquals(expected, actual);
    }
}
