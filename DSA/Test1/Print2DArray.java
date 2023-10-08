package DSA.Test1;

import java.util.Scanner;

public class Print2DArray {
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
        print2DArray(take2DArrayInput());
    }

    public static void print2DArray(int arr[][]) {
        // Write your code here
        int n = arr.length;
        if(n==0)
            return;
        for(int i = 0;i<n;i++){
            printRow(arr,i,n-i);
        }

    }
    public static void printRow(int[][] arr,int rowNo,int repeat){
        String s = "";
        for(int i = 0;i<arr[rowNo].length;i++){
            s += arr[rowNo][i] + " ";
            System.out.print(arr[rowNo][i] + " ");
        }
        System.out.println();
        for(int i=1;i<repeat;i++){
            System.out.println(s);
        }
    }
}
