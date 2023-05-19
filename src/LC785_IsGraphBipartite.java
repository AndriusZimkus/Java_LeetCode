import java.util.HashSet;
import java.util.Set;

public class LC785_IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {              //This graph might be a disconnected graph. So check each unvisited node.
            if (colors[i] == 0 && !validColor(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean validColor(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int next : graph[node]) {
            if (!validColor(graph, colors, -color, next)) {
                return false;
            }
        }
        return true;
    }

    public boolean isBipartiteMyAttempt(int[][] graph) {

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        return helper(setA, setB, 0, graph);
    }

    private boolean helper(Set<Integer> setA, Set<Integer> setB, int startingIndex, int[][] graph) {

        if (startingIndex >= graph.length) {
            return true;
        }


        int[] edges = graph[startingIndex];
        boolean tryA = false;
        boolean tryB = false;
        Set<Integer> localSetA = null;
        Set<Integer> localSetB = null;

        if (!setA.contains(startingIndex) && !setB.contains(startingIndex)) {
            tryA = true;
            tryB = true;
        } else if (setA.contains(startingIndex)) {
            tryA = true;
        } else if (setB.contains(startingIndex)) {
            tryB = true;
        }

        if (tryA) {
            localSetA = new HashSet<>(setA);
            localSetB = new HashSet<>(setB);

            localSetA.add(startingIndex);

            for (int j = 0; j < edges.length; j++) {

                if (localSetA.contains(edges[j])) {
                    tryA = false;
                    break;
                }

                localSetB.add(edges[j]);
            }

            if (tryA) {
                tryA = helper(localSetA, localSetB, startingIndex + 1, graph);
            }

        }

        if (tryB) {
            localSetA = new HashSet<>(setA);
            localSetB = new HashSet<>(setB);
            localSetB.add(startingIndex);

            for (int j = 0; j < edges.length; j++) {

                if (localSetB.contains(edges[j])) {
                    tryB = false;
                    break;
                }

                localSetA.add(edges[j]);

            }

            if (tryB) {
                tryB = helper(localSetA, localSetB, startingIndex + 1, graph);
            }


        }

        return tryA || tryB;
    }


//        for (int i = startingIndex; i < graph.length; i++) {
//            setA.add(i);
//            int[] edges = graph[i];
//            boolean tryA = false;
//            boolean tryB = false;
//
//
//            for (int j = 0; j < edges.length; j++) {
//                if (setA.contains(i) && setB.contains(i)) {
//                    return false;
//                }
//                if (!setA.contains(i)) {
//                    tryA = true;
//                }
//                if (!setB.contains(i)) {
//                    tryB = true;
//                }
//
//                if (tryA) {
//                    Set<Integer> localSetA = new HashSet<>(setA);
//                    localSetA.add(i);
//                    helper(localSetA, setB, i, graph);
//                }
//                if (tryB) {
//                    Set<Integer> localSetB = new HashSet<>(setB);
//                    localSetB.add(i);
//                    helper(localSetB, setA, i, graph);
//                }
//
//            }
//        }
//
//
//        return true;
//    }
}
