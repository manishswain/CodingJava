package BinaryTree;
public class HeightOFBinaryTree 
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

        System.out.println("Height of binary tree "+ height(root));
    }
    private static int height(Node node) 
    {
        if(node==null)
        {
            return -1;
        } 
        else
        {
            int lDepth=height(node.left);
            int rDepth=height(node.right);
            
            if(lDepth>rDepth)
            {
                return (1+lDepth);
            }
            else
            {
                return (1+rDepth);
            }
        }
    }
}
