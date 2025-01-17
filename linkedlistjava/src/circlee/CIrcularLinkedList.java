package circlee;




class Link
{
    public int key;
    public int data;
    public Link next;


    public Link(int key,int data)
    {
        this.data=data;
        this.key=key;
    }

    public void display()
    {
        System.out.print("{"+key+","+data+"}");
    }

}

public class CIrcularLinkedList {
    private Link first;


    public CIrcularLinkedList()
    {
        first=null;
    }

    public boolean isEmpty()
    {
        return first==null;
    }


    public void insertFirst(int key,int data)
    {
        Link link=new Link(key, data);

        if(isEmpty())
        {
            first=link;
            first.next=first;
        }
        else
        {
            //point to old first node
            link.next=first;

            //point first to new first node
            first=link;
        }
    }

    public Link deleteFirst()
    {
        Link temp=first;
        if(first.next==first)
        {
            first=null;
            return temp;
        }
        first=first.next;
        return temp;
    }


    public void display()
    {
        Link current=first;
        System.out.print("[");
        if(first!=null)
        {
            while(current.next!=current)
            {
                current.display();
                current=current.next;
            }
        }
        System.out.print("]");
    }




    public static void main(String[] args) {


        CIrcularLinkedList cIrcularLinkedList=new CIrcularLinkedList();
        cIrcularLinkedList.insertFirst(1,11);
        cIrcularLinkedList.insertFirst(2,22);
        cIrcularLinkedList.insertFirst(3,33);
        cIrcularLinkedList.insertFirst(4,44);
        cIrcularLinkedList.insertFirst(5,55);


        System.out.println();
        cIrcularLinkedList.display();

        Link node=null;

        System.out.println();
        node=cIrcularLinkedList.deleteFirst();
        node.display();


        System.out.println();
        node=cIrcularLinkedList.deleteFirst();
        node.display();


        System.out.println();
        node=cIrcularLinkedList.deleteFirst();
        node.display();


        System.out.println();
        node=cIrcularLinkedList.deleteFirst();
        node.display();


        System.out.println();
        node=cIrcularLinkedList.deleteFirst();
        node.display();


    }

}
