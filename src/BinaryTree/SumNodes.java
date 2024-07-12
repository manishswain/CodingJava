package BinaryTree;

public class SumNodes 
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

        System.out.println("Sum of the binary tree is "+findSum(root));
        
        

    }

    private static int findSum(Node root) 
    {
        if(root ==null)
        {
            return 0;
        }
        return root.key + findSum(root.left) + findSum(root.right);
    }
   
}
