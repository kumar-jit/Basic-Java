package Array.Array2D;

import java.util.Scanner;

public class RowWiseSum {
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
            rowSum(take2DArrayInput());
        }
    }

    public static void rowSum(int[][] arr){
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
