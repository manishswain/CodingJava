package BinaryTree;

public class CountNoOfNodes 
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
    
    public static void main(String[] args) 
    {
        
        root=new Node(13);

        root.left=new Node(12);
        root.right=new Node(10);

        root.left.left=new Node(4);
        root.left.right=new Node(19);
        root.right.left=new Node(16);
        root.right.right=new Node(9);

        System.out.println("Number of Nodes in the binary tree "+ countNodes(root));
    }
    static int sum=0;
    private static int countNodes(Node node) 
    {
        if(node == null)
        {
            return 0;
        }
        sum=1+countNodes(node.left)+countNodes(node.right);
        return sum;
    }
}
