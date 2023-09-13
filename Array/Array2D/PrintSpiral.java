package Array.Array2D;

import java.util.Scanner;

public class PrintSpiral {
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
            SpiralPrint(take2DArrayInput());
        }
    }
    public static void SpiralPrint(int[][] arr){
        int totalValue = arr.length*arr[0].length;
        int rs = 0, re = arr.length-1, cs = 0, ce = arr[0].length-1;
        while(totalValue>0){
            for(int i = cs;i<=ce && totalValue>0;i++){
                System.out.print(arr[rs][i] + " ");
                --totalValue;
            }
            ++rs;

            for(int i = rs; i<=re && totalValue>0;i++){
                System.out.print(arr[i][ce] + " ");
                --totalValue;
            }
            --ce;

            for(int i= ce;i>=cs && totalValue>0;i-- ){
                System.out.print(arr[re][i] + " ");
                --totalValue;
            }
            --re;

            for(int i=re;i>=rs && totalValue>0;i--){
                System.out.print(arr[i][cs] + " ");
                --totalValue;
            }
            cs++;
        }
    }
}
