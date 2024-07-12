package BinaryTree;

public class NoOfLeafNode 
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

        System.out.println("Number of leaf nodes  "+ countNoOfLeafNodes(root));
    }
    static int count=0;
    private static int countNoOfLeafNodes(Node node) 
    {
        if(node == null)
        {
            return 0;
        }
        count += isLeafNode(node);
        countNoOfLeafNodes(node.left);
        countNoOfLeafNodes(node.right); 
        return count ;
    }

    private static int isLeafNode(Node node) 
    {
        if(node.left==null && node.right==null)
        {
            return 1;
        }
        return 0;
    }
}
