class Solution {
	public int minSubarraySum(int[] arr) {
		// code here
		int minSum = arr[0];
		int currSum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
		    
			if (currSum > 0) currSum = arr[i];
			else currSum += arr[i];
			
			if (currSum < minSum) minSum = currSum;
		}
		
		return minSum;
	}
}
