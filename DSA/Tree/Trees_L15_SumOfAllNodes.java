/*
    Sum of all nodes
    Given a generic tree, count and return the sum of all nodes present in the given tree.

    For the above tree , total sum of all nodes is 10 + 30 + 50 + 25 + 5 + 45 + 56 + 34 = 225
    Input format :
    Elements in level order form separated by space (as per done in class). Order is -
    Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
    Output Format :
    Sum of all nodes
    Sample Input :
    10 3 20 30 40 2 40 50 0 0 0 0
    Sample Output :
    190
    Explanation
    For 10, 3 children are there : 20, 30, 40
    For 20. 2 children are there : 40, 50
    For 30, 40, 40, 50 no child is there , so the answer for this is 10+20+30+40+40+50 = 190
 */


package DSA.Tree;

public class Trees_L15_SumOfAllNodes {
    public static int sumOfAllNode(TreeNode<Integer> root){

        int count = 0;
        for(int i = 0;i<root.children.size();i++){
            count += sumOfAllNode(root.children.get(i));
        }
        return count + root.data;
    }
}
