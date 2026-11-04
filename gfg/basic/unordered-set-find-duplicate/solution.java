class Solution {
	public List<Integer> findDuplicates(int[] arr) {
		// code here
		int max = 0;
          for (int num : arr) {
              if (num > max) {
                  max = num;
              }
          }

          int[] freq = new int[max + 1];
          for (int num : arr) {
              freq[num]++;
          }

          ArrayList<Integer> result = new ArrayList<>();
          HashSet<Integer> added = new HashSet<>();

          for (int num : arr) {
              if (freq[num] > 1 && !added.contains(num)) {
                  result.add(num);
                  added.add(num);
              }
          }

          if (result.isEmpty()) {
              result.add(-1);
          }

          return result;
	}
}
