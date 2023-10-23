package DSA.OOPS.Support;

import java.util.stream.IntStream;

public class DynamicArray {
    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }
    public int size(){
        return nextElementIndex;
    }
    public  boolean isEmpty(){
        return nextElementIndex == 0;
    }

    public int get(int index){
        if(index >= nextElementIndex || index < 0){
            //Error
            return -1;
        }
        return data[index];
    }

    public void set(int index,int value){
        if(index >= nextElementIndex || index < 0){
            //Error
            return;
        }
        data[index] = value;
    }
    public void forceSet(int index,int value){
        if(index>=nextElementIndex){
            while (index>=data.length){
                doubleCapacity();
            }
            data[index] = value;
            nextElementIndex = index + 1;
            return;
        }
        this.set(index,value);

    }

    public void add(int value){
        if(nextElementIndex==data.length)
            doubleCapacity();
        data[nextElementIndex] = value;
        nextElementIndex++;
    }

    private void doubleCapacity(){
        int[] temp = data;
        data = new int[temp.length*2];
        for(int i =0;i<temp.length;i++){
            data[i] = temp[i];
        }
//        IntStream.range(0, temp.length).forEach(i -> data[i] = temp[i]);


    }

    public int removeLast(){
        if (nextElementIndex==0){
            //Error
            return -1;
        }
        return data[--nextElementIndex];
    }

    public void print(){
        System.out.print("[");
        for (int i = 0;i<nextElementIndex;i++){
            if(i!=nextElementIndex-1)
                System.out.print(data[i]+", ");
            else
                System.out.print(data[i]);
        }
        System.out.println("]");
    }



}
