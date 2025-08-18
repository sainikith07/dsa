import java.util.*;

class Solution {
    public int longestkSubstr(String s, int k) {
        int n = s.length();
        int maxLen = -1;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(s.charAt(j));
                if (set.size() == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else if (set.size() > k) {
                    break;
                }
            }
        }

        return maxLen;
    }
}
