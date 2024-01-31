package DSA.Rercursion3;

public class Recursion3_A_ReturnSubsetsSumToK {
    // Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        return subsetsSumK(input,k,0);
    }

    public static int[][] subsetsSumK(int arr[], int k,int low){

        if(low >= arr.length && k>0 || k < 0){
            return new int[0][0];
        }

        if(k == 0){
            return new int[1][0];
        }

        int[][] smallCase1 = subsetsSumK(arr, k - arr[low], low+1);
        int[][] smallCase2 = subsetsSumK(arr, k, low+1);
        int[][] newAns = new int[smallCase1.length + smallCase2.length][];


        int count = 0;
        for(int i = 0; i< smallCase1.length; i++){
            int[] temp = new int[smallCase1[i].length + 1];
            temp[0] = arr[low];
            for(int j = 1;j<temp.length; j++){
                temp[j] = smallCase1[i][j-1];
            }
            newAns[count++] = temp;
        }

        for(int i = 0;i < smallCase2.length; i++){
            newAns[count++] = smallCase2[i];
        }

        return newAns;
    }
}
