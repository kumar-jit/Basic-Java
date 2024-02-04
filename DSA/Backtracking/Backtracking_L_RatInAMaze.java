package DSA.Backtracking;

public class Backtracking_L_RatInAMaze {
    public static boolean ratInAMaze(int maze[][]){

        return ratInAMazeHelper(maze, 0, 0, new int[maze.length][maze.length]);
    }

    public static boolean ratInAMazeHelper(int maze[][],int row,int col, int path[][]){

        // Base case If row and Col at the last index of matrix then rat has reached the end point
        if(row == maze.length-1 && col == maze.length-1){
            return true;
        }

        // checking if the rat going outside of the matix
        if(row < 0 || col < 0 || row >= maze.length || col >= maze.length){
            return false;
        }

        // checking is the current path is closed or getting repeted
        if(maze[row][col] == 0 || path[row][col] == 1){
            return false;
        }


        // marking the current patth
        path[row][col] = 1;

        // going right
        if(ratInAMazeHelper(maze, row, col+1, path)){
            return true;
        }

        // going down
        if(ratInAMazeHelper(maze, row+1, col, path)){
            return true;
        }

        //going left
        if(ratInAMazeHelper(maze, row, col-1, path)){
            return true;
        }

        //going top
        if(ratInAMazeHelper(maze, row-1, col, path)){
            return true;
        }

        path[row][col] = 0;
        return false;

    }
}
