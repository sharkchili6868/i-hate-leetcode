public class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int maxlen = 0;

        for(int i = 0; i < s.length(); i++) {
        	int s1 = expandFromMiddle(s, i, i);
        	int s2 = expandFromMiddle(s, i, i + 1);

        	int max = Math.max(s1, s2);
        	if (max > maxlen) {
        		maxlen = max;
        		start = i - (max - 1) / 2;
        	}
        }

        return s.substring(start, start + maxlen);
    }

    public int expandFromMiddle(String s, int i, int j) {
    	while(i >= 0 && j < s.length()) {
    		if (s.charAt(i) == s.charAt(j)) {
    			i--;
    			j++;
    		} else break;
    	}

    	return j - i - 1;
    }
}