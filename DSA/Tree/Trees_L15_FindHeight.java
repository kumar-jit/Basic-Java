/*
    Code : Find Height
    Given a generic tree, find and return the height of given tree. The height of a tree is defined as the longest distance from root node to any of the leaf node. Assume the height of a tree with a single node is 1.
    Input Format:
    The first line of input contains data of the nodes of the tree in level order form. The order is: data for root node, number of children to root node, data of each of child nodes and so on and so forth for each node. The data of the nodes of the tree is separated by space.

    For the above tree, height will be 3 as the leaf nodes which are present at longest distance are 40, 50.(10->20->40) or (10->20->50).
    Output Format :
    The first and only line of output prints the height of the given generic tree.
    Constraints:
    Time Limit: 1 sec
    Sample Input 1:
    10 3 20 30 40 2 40 50 0 0 0 0
    Sample Output 1:
    3
 */

package DSA.Tree;

public class Trees_L15_FindHeight {
    public static int getHeight(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        int height = 0;
        for(int i = 0;i<root.children.size();i++){
            height = Integer.max(height,getHeight(root.children.get(i)));
        }
        return height + 1;
    }
}
