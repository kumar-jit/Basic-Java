/*
    Code : Max Priority Queue
    Implement the class for Max Priority Queue which includes following functions -



    1. getSize -
    Return the size of priority queue i.e. number of elements present in the priority queue.



    2. isEmpty -
    Check if priority queue is empty or not. Return true or false accordingly.



    3. insert -
    Given an element, insert that element in the priority queue at the correct position.



    4. getMax -
    Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.



    5. removeMax -
    Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.
 */


package DSA.PriorityQueues;

import java.util.ArrayList;

public class PriorityQueues_L16_MaxPriorityQueue {

    ArrayList<Integer> heap;

    public PriorityQueues_L16_MaxPriorityQueue(){
        heap = new ArrayList<>();
    }
    boolean isEmpty() {
        // Implement the isEmpty() function here
        return heap.size() == 0;
    }

    int getSize() {
        // Implement the getSize() function here
        return heap.size();
    }

    int getMax() {
        // Implement the getMax() function here

        return heap.get(0);

    }

    void insert(int element) {
        // Implement the insert() function here

        heap.add(element);

        int chieldIndex = heap.size()-1;

        while(chieldIndex>0){
            int rootIndex = (chieldIndex -1)/2;
            if(rootIndex>=0 && heap.get(rootIndex) < heap.get(chieldIndex)){
                swap(rootIndex, chieldIndex);
                chieldIndex = rootIndex;
            }
            else{
                break;
            }
        }


    }

    int removeMax() {
        // Implement the removeMax() function here

        if(isEmpty())
            return -1;

        int arrayLength = heap.size()-1;
        int ans = heap.get(0);
        int rootIndex = 0;

        swap(0,arrayLength);
        heap.remove(arrayLength);
        arrayLength--;

        while(rootIndex < arrayLength){
            int maxIndex = rootIndex;
            int rightChild = rootIndex*2 + 1;
            int leftChild = rootIndex*2 + 2;

            if(rightChild < arrayLength && heap.get(rightChild) > heap.get(maxIndex)){
                maxIndex = rightChild;
            }
            if(leftChild < arrayLength && heap.get(leftChild) > heap.get(maxIndex)){
                maxIndex = leftChild;
            }

            if(rootIndex == maxIndex){
                break;
            }
            swap(rootIndex, maxIndex);
            rootIndex = maxIndex;

        }

        return ans;
    }


    private void swap(int i,int j){
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
