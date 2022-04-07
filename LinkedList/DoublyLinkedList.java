package LinkedList;

public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data)
        {
            this.data=data;
            next = null;
            previous = null;
        }
    }
    public void InsertAtFirst(int data)
    {
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }
        else{
        newnode.next = head;
        head.previous = newnode;
        head = newnode;
        }
        
        
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp  =temp.next;
        }
    }
    void InsertLast(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head = newnode;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.previous = temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.InsertAtFirst(20);
        obj.InsertAtFirst(20);
        obj.InsertAtFirst(3);
        obj.InsertAtFirst(9);
        obj.InsertLast(15);
        obj.InsertAtFirst(98);
        obj.display();
    }
    
}

