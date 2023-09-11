package Array.Array2D;

import java.util.Scanner;

public class LargestRowOrColumn {
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
            findLargest(take2DArrayInput());
        }
    }

    public static void findLargest(int[][] mat){
        if(mat.length==0){
            System.out.println("row 0 -2147483648");
            return;
        }
        int sCol[] =new int[mat[0].length];
        int maxSumOfRow = Integer.MIN_VALUE;
        int rowPos = 0;

        for(int row = 0;row<mat.length;row++){
            int rowSum = 0;
            for(int col = 0; col<mat[row].length;col++){
                rowSum += mat[row][col];
                sCol[col] += mat[row][col];
            }
            if(rowSum>maxSumOfRow){
                maxSumOfRow = rowSum;
                rowPos = row;
            }

        }
        int colPos = 0;
        int maxSumOfCol = Integer.MIN_VALUE;
        for (int j=0;j<sCol.length;j++) {
            if (sCol[j] > maxSumOfCol){
                maxSumOfCol = sCol[j];
                colPos = j;
            }
        }

        if(maxSumOfCol>maxSumOfRow)
            System.out.print("column " + colPos + " " + maxSumOfCol);
        else
            System.out.print("row " + rowPos + " " + maxSumOfRow);
        System.out.println();
    }
}
