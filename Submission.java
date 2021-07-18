import java.util.*;

public class Submission 
{
    static egstack firststack = new egstack();
    static egstack secondstack = new egstack();

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String sys = scan.nextLine();
        String[] split = sys.split(" ");
        scan.close();
        
        for (int x =0; x<split.length;x++)
        {
            firststack.push(split[x]);
        }

        for(int pointer=firststack.size();pointer>=0;pointer--)
        {
            if (firststack.peek().matches("\\d+"))
            {
                secondstack.push(firststack.pop());
            }
            else
            {
                String sign = firststack.pop();
                if (secondstack.size()>0)
                {
                    int firstnum = Integer.parseInt(secondstack.pop());
                    int secondnum = Integer.parseInt(secondstack.pop());
                    secondstack.push(String.valueOf(operation(sign,firstnum,secondnum)));
                }
            }
        }
        System.out.println(secondstack.pop());
    }

    public static int operation(String operator, int num1, int num2)
    {
        if(operator.equals("+"))
        {
            return num1+num2;
        }
        else if(operator.equals("-"))
        {
            return num1-num2;
        }
        else if(operator.equals("x"))
        {
            return num1*num2;
        }
        else if(operator.equals("/"))
        {
            return num1/num2;
        }
        else
        {
            return 0;
        }

    }
}
