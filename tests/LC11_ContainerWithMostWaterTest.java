import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC11_ContainerWithMostWaterTest {

    LC11_ContainerWithMostWater lc11_containerWithMostWater = new LC11_ContainerWithMostWater();

    @Test
    void maxArea1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int actual = lc11_containerWithMostWater.maxArea(height);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxArea2() {
        int[] height = {2, 1, 1, 1, 10, 10, 1, 1, 1, 2};
        int expected = 18;
        int actual = lc11_containerWithMostWater.maxArea(height);
        Assertions.assertEquals(expected, actual);
    }
}
