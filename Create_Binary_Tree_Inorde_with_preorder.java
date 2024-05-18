package JavaCode;
import java.util.*;
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Create_Binary_Tree_Inorde_with_preorder {
  
    
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        getIndexofInorder(inOrder, map);
        return buildTree(preOrder,new int[]{0},preOrder.length-1,inOrder,0,inOrder.length-1,map);
    }
    
    private static BinaryTreeNode<Integer> buildTree(int[] preOrder, int preStart[], int preEnd, int[] inOrder, int inStart, int inEnd, HashMap<Integer,Integer> map) {

        if(preStart[0] > preEnd || inStart > inEnd)
        {
            return null;
        }
        int element = preOrder[preStart[0]++];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(element);
         int pos = map.get(element);

        root.left=buildTree(preOrder , preStart , preEnd , inOrder , inStart , pos-1 , map);
        root.right=buildTree(preOrder , preStart , preEnd , inOrder , pos+1 , inEnd , map);
        return root;
    }
    private static void getIndexofInorder(int[] inOrder, HashMap<Integer,Integer> map) {
        for(int i=0; i<inOrder.length; i++)
        {
            map.put(inOrder[i], i);
        }
    }
}
