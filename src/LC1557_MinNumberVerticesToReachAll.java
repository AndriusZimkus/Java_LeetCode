import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1557_MinNumberVerticesToReachAll {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        boolean[] includedVerteces = new boolean[n];
        Arrays.fill(includedVerteces, true);

        List<Integer> vertexSet = new ArrayList<>();

        for (List<Integer> edge : edges) {
            int vertexTo = edge.get(1);
            includedVerteces[vertexTo] = false;
        }

        for (int i = 0; i < includedVerteces.length; i++) {
            if (includedVerteces[i]) {
                vertexSet.add(i);
            }
        }

        return vertexSet;
    }
}
