package DSA.Rercursion3;

public class Recursion3_A_ReturnSubsetsOfAnArray {
    public static int[][] subsets(int input[]) {
        // Write your code here
        return subsets(input,0);
    }
    public static int[][] subsets(int[] arr,int startIndex){
        if (startIndex >= arr.length)
        {
            return new int[1][0];
        }

        int[][] smallcase1 = subsets(arr,startIndex + 1);
        int[][] ans = new int[smallcase1.length * 2][];
        int count = 0;
        for(int i = 0;i< smallcase1.length;i++){
            int[] temp = new int[smallcase1[i].length + 1];
            temp[0] = arr[startIndex];

            for(int j = 1;j<temp.length;j++){
                temp[j] = smallcase1[i][j-1];
            }

            ans[count++] = temp;
        }

        for(int i = 0;i<smallcase1.length;i++){
            ans[count++] = smallcase1[i];
        }
        return ans;
    }
}
