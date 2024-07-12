package Stack;

public class StackImpl 
{
    int capacity;
    int top=-1;
    int arr[]=new int[capacity];
    
    public StackImpl(int capacity)
    {
        this.capacity=capacity;
        //this.top=top;
        this.arr=new int[capacity];
    }

    public void push(int n)
    {
        if(isFull())
        {
            throw new RuntimeException("Stack Overflow Occurred");
        }
        arr[++top]=n;
    }
    public void pop()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack Underflow Occurred");
        }
        --top;
    }
    public void  peek()
    {
        System.out.println(arr[top]);
    }   
    private boolean isEmpty() 
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    private boolean isFull() 
    {
        if(top==capacity-1)
        {
            return true;
        }
        return false;
    }
    public void display() 
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
class StackTest
{
    public static void main(String[] args) 
    {
        StackImpl st=new StackImpl(5);
        
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();

        st.pop();

        st.display();

        st.peek();

        st.pop();

        st.display();

        st.push(6);

        st.display();

    }
}