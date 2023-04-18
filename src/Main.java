public class Main {
    public static void main(String[] args) {

        RegularExpressionMatching10 regularExpressionMatching10 = new RegularExpressionMatching10();

        String input = "wasdaqweawuio";
        String pattern = "wa.*w.*w";

        System.out.println(regularExpressionMatching10.isMatch(input, pattern));
    }
}
