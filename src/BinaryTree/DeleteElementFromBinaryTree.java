package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteElementFromBinaryTree 
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
        
        root=new Node(13);

        root.left=new Node(12);
        root.right=new Node(10);

        root.left.left=new Node(4);
        root.left.right=new Node(19);
        root.right.left=new Node(16);
        root.right.right=new Node(9);

        System.out.println("Inorder Traversal of the binary tree is ");
        inorderTraversal(root);System.out.println();

        deleteKey(root,12);
        

        inorderTraversal(root);System.out.println();
        

    }

    private static void deleteKey(Node root, int key) 
    {
        /* if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            if(root.key==key)
            {
                return;
            }
            return;
        } */
        Node temp=null,keyNode=null;

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            temp=queue.peek();
            queue.remove();

            if(temp.key==key)
            {
                keyNode=temp;
            }
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
        if(keyNode!=null)
        {
            int x=temp.key;
            deleteDeepestNode(root,temp);
            keyNode.key=x;
        }
    }

    private static void deleteDeepestNode(Node root, Node delNode) 
    {
        Node temp=null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            temp=queue.peek();
            queue.remove();

            if(temp==delNode)
            {
                temp=null;
                return;
            }
            if(temp.right!=null)
            {
                if(temp.right==delNode)
                {
                    temp.right=null;
                    return;
                }
                queue.add(temp.right);
            }
            if(temp.left!=null)
            {
                if(temp.left==delNode)
                {
                    temp.left=null;
                    return;
                }
                queue.add(temp.left);
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
