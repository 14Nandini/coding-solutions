class Solution {
    int sumOfMatrix(int[][] Grid) { 
        int N = Grid.length;         // Total rows
        int M = Grid[0].length;      // Total columns
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum = sum + Grid[i][j];
            }
        }
        return sum;
    }
}
