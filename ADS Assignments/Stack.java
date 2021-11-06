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
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        
        Stack s1= new Stack(5);
        StringBuffer str = new StringBuffer("Tushar");
        
    
        s1.push(10);
        //s1.display();
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        // s1.push(60);
        s1.display();
        System.out.println("Element popped " +s1.pop());
        s1.display();
        //s1.push(70);
        //s1.push(80);
       
    }
}
