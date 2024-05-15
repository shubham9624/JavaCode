package JavaCode;
class Rat_IN_Maze{

    static boolean isBlock(int maze[][],int way[][],int row ,int col,int n)
    {
        if(row>=0 && row<n && col>=0 && col<n && maze[row][col]==1 && way[row][col]==0)
        {
            return true;
        }
        return false;
    }
    static void ratInAMaze(int maze[][], int n) {
		
        int res[][]=new int[n][n];
        ratInAMazeHelper(maze, 0, 0, n, res);
       

	}
    static void ratInAMazeHelper(int maze[][],int row,int col, int n,int res[][]) {
		
        if(row==n-1 && col==n-1)
        {
            res[row][col]=1;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if(isBlock(maze, res, row, col, n))
        {
            res[row][col]=1;
           ratInAMazeHelper(maze, row+1, col, n, res);
           ratInAMazeHelper(maze, row, col+1, n, res);
           ratInAMazeHelper(maze, row-1, col, n, res);
           ratInAMazeHelper(maze, row, col-1, n, res);

            res[row][col]=0;
        }
    }
}