package stck;


class Stack
{
    static final int SIZE=100;
    int tos;
    int arr[]=new int[SIZE];

    public Stack()
    {
        tos=-1;
    }

    boolean isEmpty()
    {
        return tos<0;
    }

    boolean push(int data)
    {
        if(tos>=(SIZE-1))
        {
            System.out.println("Overflow condition!!");
            return false;
        }
        else
        {
            arr[++tos]=data;
            System.out.println(data+" pushed into the stack!!");
            return true;
        }
    }


    int pop()
    {
        if(tos<0)
        {
            System.out.println("Underflow condition!!");
            return 0;
        }
        else
        {
            int temp=arr[tos];
            tos=tos-1;
            return temp;
        }
    }


    int peek()
    {
        if(tos<0)
        {
            System.out.println("Underflow condition!!");
            return 0;
        }
        else
        {
            int temp=arr[tos];
            return temp;
        }
    }

    void display()
    {
        for(int i=tos;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
public class StackImplementation {

    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        stack.push(66);

        stack.display();


        stack.pop();
        stack.display();
        stack.pop();
        stack.display();

        System.out.println(stack.peek());
    }

}

