class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }
        
        return maxArea;
    }
    
    private int dfs(int[][] grid, int r, int c) {
        // Check boundary conditions and if the current cell is water (0)
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        
        // Mark the cell as visited by changing it to 0
        grid[r][c] = 0;
        
        // Count current cell (1) + recursive area of 4-directional neighbors
        int area = 1;
        area += dfs(grid, r + 1, c); // Down
        area += dfs(grid, r - 1, c); // Up
        area += dfs(grid, r, c + 1); // Right
        area += dfs(grid, r, c - 1); // Left
        
        return area;
    }
}