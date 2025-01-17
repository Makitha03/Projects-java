package queue;
class Queue
{
    static int SIZE ;
    static int rear,front;
    static int arr[];

    public Queue(int size)
    {
        SIZE=size;
        rear=front=0;
        arr=new int[SIZE];
    }

    static void enqueue(int data)
    {
        if(SIZE-1==rear)
        {
            System.out.println("Queue is full");
            return;
        }
        else
        {
            arr[rear]=data;
            rear=rear+1;
        }

        return;
    }


    static void dequeue()
    {
        if(rear==front)
        {
            System.out.println("Queue is empty!");
        }
        else
        {
            for(int i=0;i<rear-1;i++)
            {
                arr[i]=arr[i+1];
            }

            if(rear<SIZE)
            {
                arr[rear]=0;
            }

            rear--;
        }
    }

    static void display()
    {
        int i;
        if(rear==front)
        {
            System.out.println("Queue is full");
            return;
        }
        else
        {
            for( i=front;i<rear;i++)
            {
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println();
        return;
    }
}
public class QueueImplementation {

    public static void main(String[] args) {
        Queue queue=new Queue(5);

        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);
        queue.enqueue(44);
        //queue.enqueue(55);
        //queue.enqueue(66);
        //queue.enqueue(66);
        queue.display();

        queue.dequeue();
        queue.display();


        queue.dequeue();
        queue.display();

        queue.enqueue(55);
        queue.display();
    }

}
