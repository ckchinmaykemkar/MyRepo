class Solution {
    public int minPathSum(int[][] grid) {
        return helper(0,0,grid);

    }
    public int helper(int row,int col,int[][] grid){
        int rowEnd=grid.length-1;
        int colEnd=grid[0].length-1;
        if(row==rowEnd && col==colEnd)return grid[row][col];

        if(row>rowEnd || col>colEnd){
            return Integer.MAX_VALUE;
        }

        int left=helper(row+1,col,grid);
        int right=helper(row,col+1,grid);
        return grid[row][col]+Math.min(left,right);
    }
}