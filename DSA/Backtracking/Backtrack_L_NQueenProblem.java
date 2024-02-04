package DSA.Backtracking;

public class Backtrack_L_NQueenProblem {
    public static void placeNQueens(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        placeNQueensHelper(new int[n][n], n, 0 );

    }

    public static void placeNQueensHelper(int[][] arr, int n, int row){
        if(row == n){
            for(int[] i : arr){
                for(int j : i){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n ; i++){
            if(isSafe(arr,n,row,i)){
                arr[row][i] = 1;
                placeNQueensHelper(arr,n,row+1);
                arr[row][i] = 0;
            }
        }
        return;
    }

    public static boolean isSafe(int[][] arr, int n, int row, int col){
        for(int i = row ; i >= 0; i--){
            if(arr[i][col] == 1){
                return false;
            }
        }

        for(int i = row, j = col ; i >= 0 && j >= 0 ; i--, j-- ){
            if(arr[i][j] == 1){
                return false;
            }
        }

        for(int i = row, j = col ; i >= 0 && j < n ; i--, j++ ){
            if(arr[i][j] == 1){
                return false;
            }
        }

        return true;
    }

}
