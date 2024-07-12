package BinaryTree;

public class RightLeavesSum 
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
    static int sum=0;  
    
    public static void main(String[] args) {
        
        root=new Node(13);

        root.left=new Node(12);
        root.right=new Node(10);

        root.left.left=new Node(4);
        root.left.right=new Node(19);
        root.right.left=new Node(16);
        root.right.right=new Node(9);

        System.out.println("Sum of the left leaves in a binary tree is "+findRightLeavesSum(root));
    }
    
    private static int findRightLeavesSum(Node node) 
    {
       int sum=0;
       
       if(node !=null)
       {
        if(isLeaf(node.right))
        {
            sum+=node.right.key;
        }
        else
        {
            sum+=findRightLeavesSum(node.right);
        }
            sum+=findRightLeavesSum(node.left); 
       }
       
       return sum;
    }

    private static boolean isLeaf(Node node) {
        if(node == null)
        {
            return false;
        }
        if(node.left==null && node.right==null)
        {
            return true;
        }
        return false;
    }
}
