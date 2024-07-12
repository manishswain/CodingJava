package BinaryTree;

public class SumPerfectBinaryTree 
{   
    public static void main(String[] args) {
        int l=3;
        System.out.println(sumPerfectBinaryTree(l));
    }

    private static double sumPerfectBinaryTree(int l)
    {
        double noL=Math.pow(2, l-1);  
        
        double sumLastLevel=((noL*(noL+1))/2);
        
        double treeSum=sumLastLevel*l;

        return treeSum;
        
    }
}
