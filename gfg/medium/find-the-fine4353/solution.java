class Solution {
	
	public long totalFine(int date, int car[], int fine[]) {
		// code here
		boolean isEven = false;
		if (date % 2 == 0)
			isEven = true;
		long res = 0;
		for (int i = 0; i < fine.length; i++) {
			if (isEven && car[i] % 2 != 0)
				res += fine[i];
		    else if (!isEven && car[i] % 2 == 0)
		        res += fine[i];
		}
		return res;
	}
}
