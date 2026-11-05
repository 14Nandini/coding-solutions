class Solution {
	int lastIndex(String s, char c) {
		// code here
		int indx = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) indx = i;
		}
		return indx;
	}
}
