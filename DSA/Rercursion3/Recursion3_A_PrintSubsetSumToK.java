package DSA.Rercursion3;

public class Recursion3_A_PrintSubsetSumToK {
    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        printSubsetsSumTok(input,k,new int[0],0);
    }

    public static void printSubsetsSumTok(int[] arr,int k,int[] previousSet,int startIndex){
        if(k == 0){
            for(int i : previousSet){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        if(startIndex >= arr.length || k < 0){
            return;
        }
        // current element not include int the set
        printSubsetsSumTok(arr,k,previousSet,startIndex+1);

        // adding current element to the set
        int[] currentSet = new int[previousSet.length + 1];
        for(int i = 0; i <previousSet.length; i++ ){
            currentSet[i] = previousSet[i];
        }
        currentSet[previousSet.length] = arr[startIndex];
        printSubsetsSumTok(arr,k - arr[startIndex],currentSet,startIndex+1);

    }
}
