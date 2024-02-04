package DSA.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class mainFunction {
    public static void main(String[] args)throws NumberFormatException, IOException {
//        _Backtracking_L_RatInAMaze();
//        _Backtracking_L_RatInMazeAllPaths();
        _Backtrack_L_NQueenProblem();

    }


    public static void _Backtracking_L_RatInAMaze() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maze[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maze[i][j] = s.nextInt();
            }
        }
        System.out.println(Backtracking_L_RatInAMaze.ratInAMaze(maze));
    }

    public static void _Backtracking_L_RatInMazeAllPaths() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] maze = new int[20][20];
        for (int i = 0; i < n; i++)
        {
            StringTokenizer tk = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++)
            {
                maze[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        Backtracking_L_RatInMazeAllPaths.ratInAMaze(maze, n);
    }

    public static void _Backtrack_L_NQueenProblem() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Backtrack_L_NQueenProblem.placeNQueens(n);
    }
}
