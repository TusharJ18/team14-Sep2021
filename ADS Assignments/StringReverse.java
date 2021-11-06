class Stack
{
    private int top;
    private int size;
    private long a[];
    
    public Stack(){}
    public Stack(int n)
    {
        size= n;
        top= -1;
        a= new long[size];
    }
    
    public boolean isEmpty()
    {
        if(top<0)
        return true;
        else
        return false;
    }
    
    public boolean isFull()
    {
        if(top >= (size-1))
        return true;
        
        else return false;
    }
    
    public void push(int x)
    {
        if(isFull())
         {
             System.out.println("Stack is Overflow ");
         }
        else
        {
        a[++top]= x;
        }
    }
    
    public long pop()
    {
        if(isEmpty())
        {
             System.out.println("Stack is Underflow ");
             return 0;
        }
        else
        {
        long x= a[top--];
        return x;
        }
    }
    
    public void display()
    {
        for(int i=0; i<= top; i++)
        {
            System.out.println(a[i]);
        }
        
    }
    
}

public class Main
{
    
    public static void  reverse(StringBuffer s)
    {
        Stack s1= new Stack(s.length());
        
        // Push the one by one char of  string onto a stack
        for(int i=0; i< s.length(); i++)
        {
           s1.push(s.charAt(i));
            
        }
        
        for(int i=0; i< s.length(); i++)
        {
           char ch= (char)s1.pop();
           s.setCharAt(i,ch);
            
        }
        
        
    }
    
    public static void main(String args[])
    {
        
        StringBuffer str= new StringBuffer("Tushar");
        
        reverse(str);
        
        System.out.println(str);
       
    }
}
