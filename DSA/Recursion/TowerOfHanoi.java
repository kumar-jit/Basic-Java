/*
 * @link : https://classroom.codingninjas.com/app/classroom/me/24059/content/576830/offering/8915462/problem/173
 * @title : Tower Of Hanoi
 * @referenceLink : https://www.youtube.com/watch?v=CfUmdjJwxL4
 */

package DSA.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        towerOfHanoi(sc.nextInt(),'a','b','c');
    }

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        // Write your code here
        if(disks>0){
            towerOfHanoi(disks-1,source,destination,auxiliary);
            System.out.println(source+" "+destination);
            towerOfHanoi(disks-1,auxiliary,source,destination);
        }

    }

}
