/*
     Code : Remove Min

    Implement the function RemoveMin for the min priority queue class.

    For a minimum priority queue, write the function for removing the minimum element present. Remove and return the minimum element.
 */

package DSA.PriorityQueues;

import java.util.ArrayList;

public class PriorityQueues_L17_RemoveMin {
    private ArrayList<Integer> heap;

    public PriorityQueues_L17_RemoveMin() {
        heap = new ArrayList<Integer>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMin() throws PriorityQueueException  {
        if(isEmpty())
            throw new PriorityQueueException();

        int arrayLength = heap.size()-1;
        int ans = heap.get(0);
        int rootIndex = 0;

        swap(0,arrayLength);
        heap.remove(arrayLength);
        arrayLength--;

        while(rootIndex < arrayLength){
            int minIndex = rootIndex;
            int rightChild = rootIndex*2 + 1;
            int leftChild = rootIndex*2 + 2;

            if(rightChild < arrayLength && heap.get(rightChild) < heap.get(minIndex)){
                minIndex = rightChild;
            }
            if(leftChild < arrayLength && heap.get(leftChild) < heap.get(minIndex)){
                minIndex = leftChild;
            }

            if(rootIndex == minIndex){
                break;
            }
            swap(rootIndex, minIndex);
            rootIndex = minIndex;

        }

        return ans;
    }

    private void swap(int i,int j){
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}

class PriorityQueueException extends Exception {

}
