package com.doubly;



class Link
{
    public int key;
    public int data;
    public Link next;
    public Link pre;

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
public class DoubleLinkedList {

    //This link always point to the first link
    private Link first;

    //This link always point to the last link
    private Link last;


    public boolean isEmpty()
    {
        return first==null;
    }

    //creating empty linkedlist
    public DoubleLinkedList()
    {
        first=null;
        last=null;
    }

    public void insertFirst(int key, int data)
    {
        //create a new link or node
        Link link=new Link(key, data);

        if(isEmpty())
        {
            //make it the last node
            last=link;
        }
        else
        {
            //update first prev link
            first.pre=link;
        }

        //pointing it to old first link
        link.next=first;

        //pointing first to new first link
        first=link;

    }


    public void displayForward()
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

        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        doubleLinkedList.insertFirst(1, 11);
        doubleLinkedList.insertFirst(2, 22);
        doubleLinkedList.insertFirst(3, 33);
        doubleLinkedList.insertFirst(4, 44);
        doubleLinkedList.insertFirst(5, 55);

        doubleLinkedList.displayForward();

    }

}

