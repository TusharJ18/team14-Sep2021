import java.util.*;
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

public class ChckBrcktMain
{
    
    public static int chkBrckt(StringBuffer s)
    {
	int count=0;
        Stack s1= new Stack(s.length());
        
        // Push the one by one char of  string onto a stack
        for(int i=0; i< s.length(); i++)
        {
           s1.push(s.charAt(i));
            
        }
        
        for(int i=0; i< s.length(); i++)
        {
           char ch= (char)s1.pop();
            if(ch=='(' || ch== '{' || ch=='[')
		{
		count++;
		}
            else if(ch==')' || ch=='}' || ch==']')
		count--;
        }
        
         	return count;
	
    }
    
    public static void main(String args[])
    {
	Scanner sc= new Scanner(System.in);
        System.out.println("Enter Expression  : ");
        StringBuffer str= new StringBuffer(sc.nextLine());
          
	if(chkBrckt(str)== 0)
        System.out.println("Balanced");
	else
	System.out.println("Not Balanced");
       
    }
}
