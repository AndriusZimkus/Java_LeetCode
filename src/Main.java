public class Main {
    public static void main(String[] args) {

        RegularExpressionMatching10 regularExpressionMatching10 = new RegularExpressionMatching10();

        String input = "aaa";
        String pattern = "a*a";

        input = "aaa";
        pattern = "a*a";

        boolean result = regularExpressionMatching10.isMatch(input, pattern);
        System.out.println(result);
    }
}
