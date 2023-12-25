package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Trees_L15_PrintTreeLevelWise {

    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */

        Queue<TreeNode<Integer>> nodeStore = new LinkedList<>();

        if(root == null){
            return;
        }
        nodeStore.add(root);
        nodeStore.add(null);

        while (!nodeStore.isEmpty()){
            TreeNode<Integer> currentNode = nodeStore.poll();
            if(currentNode == null){
                nodeStore.add(null);

                if(nodeStore.size() == 1){
                    break;
                }
                System.out.println();
                continue;
            }
            else {
                System.out.print(currentNode.data + " ");
                if(!currentNode.children.isEmpty()){
                    nodeStore.addAll(currentNode.children);
                }
            }

        }

    }
}
