import java.util.HashMap;

public class LC3_LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int length = 0;
        int currentSubstringStartIndex = 0;
        HashMap<Character, Integer> currentCharIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);


            if (!currentCharIndexMap.containsKey(x)) {
                currentCharIndexMap.put(x, i);

            } else {
                if (currentCharIndexMap.size() > length) {
                    length = currentCharIndexMap.keySet().size();
                }
                currentSubstringStartIndex = currentCharIndexMap.get(x);
                i = currentSubstringStartIndex;
                currentCharIndexMap = new HashMap<>();
            }


        }
        if (currentCharIndexMap.size() > length) {
            length = currentCharIndexMap.keySet().size();
        }
        return length;
    }
}
