class Solution {
    void dfs(char[][] grid, int row, int col)
    {
        if(row < 0 || row >= grid.length || col< 0 || 
        col>= grid[0].length || grid[row][col] == '0')
        {
            return;
        }

        grid[row][col] = '0';
        dfs(grid,row, col+1); // right
        dfs(grid, row , col - 1); // left
        dfs(grid , row + 1, col); // down
        dfs(grid,row - 1, col); // up
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == '1')
                {
                    count++;
                    dfs(grid, i , j);
                }
            }
        }
        return count;
    }
}