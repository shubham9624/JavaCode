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
public class Create_Binary_Tree_Inorde_with_postOrde {
    
    
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        getIndexofInorder(inOrder, map);
        int postStart[]={postOrder.length-1};
        return buildTree(postOrder , postStart, 0 , inOrder , 0 , inOrder.length-1 , map);
    }
    
    private static BinaryTreeNode<Integer> buildTree(int[] postOrder, int postStart[], int posEnd, int[] inOrder, int inStart, int inEnd, HashMap<Integer,Integer> map) {

        if(postStart[0] < posEnd || inStart > inEnd)
        {
            return null;
        }
        int element = postOrder[postStart[0]--];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(element);
         int pos = map.get(element);

        root.right=buildTree(postOrder , postStart , posEnd , inOrder , pos+1 , inEnd , map);
        root.left=buildTree(postOrder , postStart , posEnd , inOrder , inStart , pos-1 , map);
       
        return root;
    }
    private static void getIndexofInorder(int[] inOrder, HashMap<Integer,Integer> map) {
        for(int i=0; i<inOrder.length; i++)
        {
            map.put(inOrder[i], i);
        }
    }
}
