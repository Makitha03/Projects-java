package com.linked;
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
public class SingleLinkedList {

    private Link first;

    public SingleLinkedList()
    {
        first=null;
    }


    public void insertFirst(int key, int data)
    {
        Link link=new Link(key, data);
        link.next=first;
        first=link;

    }

    public Link deleteFirst()
    {
        Link temp=first;
        first=first.next;
        return temp;
    }

    public Link find(int key)
    {
        Link current=first;

        if(current==null)
            return null;

        while(current.key!=key)
        {
            //if it is the last node
            if(current.next==null)
            {
                return null;
            }
            else
            {
                current=current.next;
            }
        }

        return current;
    }


    public Link delete(int key)
    {
        Link current=first;
        Link previous=null;

        if(first==null)
            return null;

        while(current.key!=key)
        {
            if(current.next==null)
            {
                return null;
            }
            else
            {
                previous=current;
                current=current.next;
            }
        }

        if(current==first)
        {
            first=first.next;
        }
        else
        {
            previous.next=current.next;
        }

        return current;

    }

    public void display()
    {
        Link current=first;

        System.out.print("[");
        while(current!=null)
        {
            current.display();
            current=current.next;
        }
        System.out.print("]");
    }


    public static void main(String[] args) {


        SingleLinkedList linkedList=new SingleLinkedList();

        linkedList.insertFirst(1, 11);
        linkedList.insertFirst(2, 22);
        linkedList.insertFirst(3, 33);
        linkedList.insertFirst(4, 44);
        linkedList.display();
        System.out.println();
        linkedList.deleteFirst();
        linkedList.display();


        System.out.println();
        Link link=linkedList.find(6);
        if(link!=null)
            link.display();
        else
            System.out.println("key not found!!");


        System.out.println();
        linkedList.display();

        linkedList.delete(2);

        System.out.println();
        linkedList.display();



    }

}
