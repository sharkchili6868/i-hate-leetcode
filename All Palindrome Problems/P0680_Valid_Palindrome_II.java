public class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while(l < r) {
        	if (s.charAt(l) == s.charAt(r)) {
        		l++;
        		r--;
        	} else {
        		if (check(s, l + 1, r) ||check(s, l, r - 1)) return true;
                return false;
        	}
        }

        return true;
    }

    private boolean check(String s, int i, int j) {
    	while(i < j) {
    		if (s.charAt(i) != s.charAt(j)) return false;
    		else {
    			i++;
    			j--;
    		}
    	}

    	return true; 
    }
}
