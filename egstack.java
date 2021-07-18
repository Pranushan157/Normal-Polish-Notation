public class egstack
{
    private String[] list;
    private int top;

    public egstack()
    {
        list = new String[1000];
        top = -1;
    }

    public void push(String j)
    {
        top = top + 1;
        list[top] = j;
    }

    public String pop()
    {
        return list[top--];
    }

    public boolean isEmpty()
    {
        return (top==-1);
    }

    public int size()
    {
        return (top);
    }

    public String peek()
    {
        return list[top];
    }

    public static void main(String[]args)
    {
        
    }

}

