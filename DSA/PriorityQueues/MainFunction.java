package DSA.PriorityQueues;

import java.io.IOException;
import java.util.Scanner;

public class MainFunction {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws NumberFormatException, IOException {
//        _PriorityQueues_L17_RemoveMin();
        _PriorityQueues_L16_MaxPriorityQueue();
    }



    public static void _PriorityQueues_L17_RemoveMin() throws NumberFormatException, IOException {

        PriorityQueues_L17_RemoveMin pq = new PriorityQueues_L17_RemoveMin();
        int choice = sc.nextInt();

        while(choice != -1) {
            switch(choice) {
                case 1 : // insert

                    int element = sc.nextInt();
                    pq.insert(element);
                    break;
                case 2 : // getMin
                    try {
                        System.out.println(pq.getMin());
                    } catch (PriorityQueueException e) {
                        System.out.println(Integer.MIN_VALUE);
                        return;
                    }
                    break;
                case 3 : // removeMin
                    try {
                        System.out.println(pq.removeMin());
                    } catch (PriorityQueueException e) {
                        System.out.println(Integer.MIN_VALUE);
                        return;
                    }
                    break;
                case 4 : // size
                    System.out.println(pq.size());
                    break;
                case 5 : // isEmpty
                    System.out.println(pq.isEmpty());
                default :
                    return;
            }
            choice = sc.nextInt();
        }
    }

    public static void _PriorityQueues_L16_MaxPriorityQueue() throws NumberFormatException, IOException {

        PriorityQueues_L16_MaxPriorityQueue pq = new PriorityQueues_L16_MaxPriorityQueue();
        int choice = sc.nextInt();
        while(choice != -1) {
            switch(choice) {
                case 1 : // insert
                    int element = sc.nextInt();
                    pq.insert(element);
                    break;
                case 2 : // getMax
                    System.out.println(pq.getMax());
                    break;
                case 3 : // removeMax
                    System.out.println(pq.removeMax());
                    break;
                case 4 : // size
                    System.out.println(pq.getSize());
                    break;
                case 5 : // isEmpty
                    System.out.println(pq.isEmpty());
                default :
                    return;
            }
            //choice = Integer.parseInt(st.nextToken());
            choice = sc.nextInt();
        }
    }
}
