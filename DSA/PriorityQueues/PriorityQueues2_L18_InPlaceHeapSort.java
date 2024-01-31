package DSA.PriorityQueues;
/*
    Inplace Heap sort
    Send feedback
    Given an integer array of size N. Sort this array (in decreasing order) using heap sort.

    Note: Space complexity should be O(1).

    Detailed explanation ( Input/output format, Notes, Images )
    Constraints :
    1 <= n <= 10^6
    Time Limit: 1 sec
    Sample Input 1:
    6
    2 6 8 5 4 3
    Sample Output 1:
    8 6 5 4 3 2
 */
public class PriorityQueues2_L18_InPlaceHeapSort {
    public static void upHippyfy(int[] arr,int startingIndex){
        int childIndex = startingIndex;

        while(childIndex > 0){
            int rootIndex = (childIndex-1)/2;
            if(arr[childIndex] < arr[rootIndex]){
                swap(arr, childIndex, rootIndex);
                childIndex = rootIndex;
            }
            else{
                break;
            }
        }
    }

    public static void downHipiffy(int[] arr, int lastIndex){
        int rootindex = 0;
        while(rootindex < lastIndex){
            int rightIndex = (rootindex*2) + 1;
            int leftIndex = (rootindex*2) + 2;

            int minIndex = rootindex;
            if(rightIndex <= lastIndex && arr[minIndex] > arr[rightIndex] ){
                minIndex = rightIndex;
            }
            if(leftIndex <= lastIndex && arr[minIndex] > arr[leftIndex]){
                minIndex = leftIndex;
            }

            if(rootindex == minIndex){
                break;
            }
            swap(arr, minIndex, rootindex);
            rootindex = minIndex;
        }
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void inplaceHeapSort(int arr[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Change in the given input itself.
         * Taking input and printing output is handled automatically.
         */

        for(int i = 0;i<arr.length;i++){
            upHippyfy(arr, i);
        }

        for(int i = arr.length - 1; i >0 ; i--){
            swap(arr, 0, i);
            downHipiffy(arr, i-1);
        }

    }
}
