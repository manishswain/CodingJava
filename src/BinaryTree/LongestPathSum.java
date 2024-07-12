package BinaryTree;

public class LongestPathSum 
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
        
        root=new Node(4);

        root.left=new Node(2);
        root.right=new Node(5);

        root.left.left=new Node(7);
        root.left.right=new Node(1);
        root.left.right.left=new Node(6);
        root.right.left=new Node(2);
        root.right.right=new Node(3);

        System.out.println("Sum of the keys  in a longest path of the"+
                                     "binary tree is "+findSum(root));
    }
    
    private static int findSum(Node node) 
    {
        if(node ==null)
        {
            return 0;
        }    
        findSumLongPath(node,0,0);
        return maxsum;
    }

    private static void findSumLongPath(Node node, int sum, int len) 
    {
        if(node ==null)
        {
            if(maxlen<  len)
            {
                maxlen=len;
                maxsum=sum;
            }
            else if(maxlen==len && maxsum <sum)
            {
                maxsum=sum;
            }
            return ;
        }
        findSumLongPath(node.left, node.key+sum, len+1);
        findSumLongPath(node.right, node.key+sum, len+1);
    }

    static int maxsum , maxlen;

}
