package LinkList;

import Person.Person;

public class ContactList {
    private Node head;

    public ContactList()
    {
        head = null;
    }

    public Node getHead()
    {
        return head;
    }

    public void setHead(Node head)
    {
        this.head = head;
    }


    private boolean isEmpty() {
        boolean response=false;
        if(head == null)
        {
            response=true;
        }
        return response;
    }
    public void insert(Person data)
    {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public boolean printList()
    {
        boolean response=false;
        if(!isEmpty()) {
            response=true;
            System.out.println("Here are all your contacts: ");
            int i = 1;
            Node temp = head;
            while (temp != null) {
                System.out.println(i + ". " + temp.getData().getFname() + " " + temp.getData().getLname());
                temp = temp.getNext();
                i++;
            }
        }
        return response;
    }
}
