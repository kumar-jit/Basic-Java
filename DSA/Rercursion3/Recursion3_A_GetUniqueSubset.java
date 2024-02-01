package DSA.Rercursion3;

public class Recursion3_A_GetUniqueSubset {
    public static void printSubsets(int input[]) {
        // Write your code here
        printSubsets(input,new int[0],0);

    }

    public static void printSubsets(int[] arr,int[] oldSet,int startIndex){
        if(startIndex >= arr.length){
            for(int i : oldSet){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        // taking the current element in set
        int[] newSet = new int[oldSet.length + 1];
        for(int i = 0; i < oldSet.length; i++ ){
            newSet[i] = oldSet[i];
        }
        newSet[oldSet.length] = arr[startIndex];
        printSubsets(arr,newSet,startIndex + 1);

        // Not in including the current  element to the set
        // skiping all element which match with current
        while(startIndex+1 < arr.length && arr[startIndex+1] == arr[startIndex]){
            startIndex++;
        }
        printSubsets(arr,oldSet,startIndex + 1);
    }
}
