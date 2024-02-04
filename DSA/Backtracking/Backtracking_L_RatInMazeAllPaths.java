package DSA.Backtracking;

public class Backtracking_L_RatInMazeAllPaths {
    static void ratInAMaze(int maze[][], int n) {
        /*
         * Your class should be named Solution.
         * Write your code here
         */
        ratInAMazeHelper(maze,0,0,new int[n][n]);
    }

    public static void ratInAMazeHelper(int maze[][],int row,int col, int path[][]){
        // System.out.println("row : " + row + " col : "+ col + " mazeLength : " + path.length);
        // Base case If row and Col at the last index of matrix then rat has reached the end point
        if( row == path.length-1 && col == path.length-1){
            path[row][col] = 1;
            for(int[] rows: path){
                for(int cell: rows){
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
            path[row][col] = 0;
            return;
        }

        // checking if the rat going outside of the matix
        if(row < 0 || col < 0 || row >= maze.length || col >= maze.length){
            return;
        }

        // checking is the current path is closed or getting repeted
        if(maze[row][col] == 0 || path[row][col] == 1){
            return;
        }


        // marking the current patth
        path[row][col] = 1;

        // going right
        ratInAMazeHelper(maze, row, col+1, path);

        // going down
        ratInAMazeHelper(maze, row+1, col, path);

        //going left
        ratInAMazeHelper(maze, row, col-1, path);

        //going top
        ratInAMazeHelper(maze, row-1, col, path);

        path[row][col] = 0;
        return;

    }
}
