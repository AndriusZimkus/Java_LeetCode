public class LC11_ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, Math.min(height[j], height[i]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else j--;
        }

        return maxArea;
    }

    public int maxAreaOn2(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                maxArea = Math.max(maxArea, Math.min(height[j], height[i]) * (i - j));
            }
        }

        return maxArea;
    }
}
