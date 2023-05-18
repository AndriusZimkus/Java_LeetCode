import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LC1557_MinNumberVerticesToReachAllTest {

    LC1557_MinNumberVerticesToReachAll lc1557_minNumberVerticesToReachAll = new LC1557_MinNumberVerticesToReachAll();

    @Test
    void findSmallestSetOfVertices1() {
        int n = 6;
        int[][] edgesMatrix = {{0, 1}, {0, 2}, {2, 5}, {3, 4}, {4, 2}};
        List<List<Integer>> edges = new ArrayList<>();
        for (int[] edge : edgesMatrix) {

            List<Integer> intList = new ArrayList<Integer>(edge.length);
            for (int i : edge) {
                intList.add(i);
            }

            edges.add(intList);
        }

        List<Integer> expected = new ArrayList<>(List.of(0, 3));
        List<Integer> actual = lc1557_minNumberVerticesToReachAll.findSmallestSetOfVertices(n, edges);
        Collections.sort(actual);

        Assertions.assertIterableEquals(expected, actual);

    }

    @Test
    void findSmallestSetOfVertices2() {
        int n = 5;
        int[][] edgesMatrix = {{0, 1}, {2, 1}, {3, 1}, {1, 4}, {2, 4}};
        List<List<Integer>> edges = new ArrayList<>();
        for (int[] edge : edgesMatrix) {

            List<Integer> intList = new ArrayList<Integer>(edge.length);
            for (int i : edge) {
                intList.add(i);
            }

            edges.add(intList);
        }

        List<Integer> expected = new ArrayList<>(List.of(0, 2, 3));
        List<Integer> actual = lc1557_minNumberVerticesToReachAll.findSmallestSetOfVertices(n, edges);
        Collections.sort(actual);

        Assertions.assertIterableEquals(expected, actual);

    }
}
