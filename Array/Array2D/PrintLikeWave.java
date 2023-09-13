package Array.Array2D;

import java.util.Scanner;

public class PrintLikeWave {
    public static Scanner sc = new Scanner(System.in);

    public static int[][] take2DArrayInput() {
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i =0;i<row;i++) {
            for(int j =0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int repeat = sc.nextInt();
        for(int i = 0; i<repeat; i++) {
            PrintWave(take2DArrayInput());
        }
    }
    public static void PrintWave(int[][] mat){
        if(mat.length==0)
            return;
        for(int col=0;col<mat[0].length;col++){
            for(int row=0;row<mat.length;row++){
                if(col%2==0){
                    System.out.print(mat[row][col]+ " ");
                }
                else{
                    System.out.print(mat[mat.length-1-row][col]+ " ");
                }
            }
        }
        System.out.println();
    }
}
