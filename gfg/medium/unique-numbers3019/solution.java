class solution {
	ArrayList<Integer> uniqueNumbers(int l, int r) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = l; i <= r; i++) { 
			boolean isUnique = true; 
			boolean[] seen = new boolean[10]; 
			
			if (i == 0) {
				list.add(i);
				continue;
			}
			
			int num = i;
			while (num > 0) {
				int digit = num % 10; 
				
				if (seen[digit]) {
					isUnique = false;
					break;
				}
				
				seen[digit] = true; 
				num /= 10; 
			}
			
			if (isUnique) list.add(i); 
		}
		
		return list;
	}
}
