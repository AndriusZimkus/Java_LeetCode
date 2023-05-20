import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LC399_EvaluateDivisionTest {

    LC399_EvaluateDivision lc399_evaluateDivision = new LC399_EvaluateDivision();

    @Test
    void calcEquation1() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(new ArrayList<>(List.of("a", "b")));
        equations.add(new ArrayList<>(List.of("b", "c")));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(List.of("a", "c")));
        queries.add(new ArrayList<>(List.of("b", "a")));
        queries.add(new ArrayList<>(List.of("a", "e")));
        queries.add(new ArrayList<>(List.of("a", "a")));
        queries.add(new ArrayList<>(List.of("x", "x")));

        double[] expected = {6.0, 0.5, -1, 1, -1};
        double[] actual = lc399_evaluateDivision.calcEquation(equations, values, queries);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void calcEquation2() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(new ArrayList<>(List.of("a", "b")));
        equations.add(new ArrayList<>(List.of("b", "c")));
        equations.add(new ArrayList<>(List.of("bc", "cd")));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(List.of("a", "c")));
        queries.add(new ArrayList<>(List.of("c", "b")));
        queries.add(new ArrayList<>(List.of("bc", "cd")));
        queries.add(new ArrayList<>(List.of("cd", "bc")));

        double[] expected = {3.75, 0.4, 5, 0.2};
        double[] actual = lc399_evaluateDivision.calcEquation(equations, values, queries);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void calcEquation3() {
        List<List<String>> equations = new ArrayList<>();
        equations.add(new ArrayList<>(List.of("a", "b")));
        double[] values = {0.5};
        List<List<String>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(List.of("a", "b")));
        queries.add(new ArrayList<>(List.of("b", "a")));
        queries.add(new ArrayList<>(List.of("a", "c")));
        queries.add(new ArrayList<>(List.of("x", "y")));

        double[] expected = {0.5, 2, -1, -1};
        double[] actual = lc399_evaluateDivision.calcEquation(equations, values, queries);

        Assertions.assertArrayEquals(expected, actual);

    }
}
