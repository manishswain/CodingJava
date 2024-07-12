package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeInBinaryTree 
{
    static class Node
    {
        int key;
        Node left,right;

        public Node(int key)
        {
            this.key=key;
            left=right=null;
        }
    }
    
    static Node root;
    static Node temp;
    
    public static void main(String[] args) {
        
        root=new Node(10);

        root.left=new Node(11);
        root.right=new Node(9);

        root.left.left=new Node(7);
        root.right.left=new Node(15);
        root.right.right=new Node(8);

        System.out.println("Inorder Traversal of the binary tree is ");
        inorderTraversal(root);System.out.println();

        insertKey(root,12);

        inorderTraversal(root);System.out.println();
        

    }

    private static void insertKey(Node root, int key) 
    {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp=queue.peek();
            queue.remove();

            if(temp.left==null)
            {
                temp.left=new Node(key);
                break;
            }
            else
            {
                queue.add(temp.left);
            }
            if(temp.right==null)
            {
                temp.right=new Node(key);
                break;
            }
            else
            {
                queue.add(temp.right);
            }
        }


    }

    private static void inorderTraversal(Node root) 
    {
        if(root==null)
        {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.key+" ");
        inorderTraversal(root.right);
    }
}
