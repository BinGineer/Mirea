package ru.mirea.listPrac.task2;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    public CircularLinkedList(){
        head = null;
        tail = null;
    }
    public void addNode(Computer value){
        Node newnode = new Node(value);
        if (head == null){
            head = newnode;
            tail = newnode;
            newnode.nextnode = head;
        }
        else {
            newnode.nextnode = head;
            tail.nextnode = newnode;
            tail = newnode;
        }
    }
    public void deleteNode(Computer key){
        if (head == null){
            return;
        }
        Node curr = head;
        Node prev = null;
        while (curr.nextnode != head) {
            if (curr.data == key) {
                if (prev == null) {
                    Node last = head;
                    while (last.nextnode != head) {
                        last = last.nextnode;
                    }
                    head = curr.nextnode;
                    last.nextnode = head;
                    return;
                } else {
                    prev.nextnode = curr.nextnode;
                    if (curr == tail) {
                        tail = prev;
                    }
                    return;
                }
            }
            prev = curr;
            curr = curr.nextnode;
        }
        if (curr == head && curr.data == key) {
            if (prev != null){
                prev.nextnode = head;

                tail = prev;
            }
            else {
                tail = null;
                head = null;
            }
        }

    }
    public Computer getObjectByNumder(int number){
        int i = 0;
        Node curr = head;
        while (i<this.GetLen()){
            if (curr.data.number == number){
                return curr.data;
            }
            curr = curr.nextnode;
            i++;
        }
        return null;
    }
    public Computer getObjectByIndex(int ind){
        int i = 0;
        Node curr = head;
        while (i < ind){
            curr = curr.nextnode;
            i++;
        }
        return curr.data;
    }
    public void readNodeByNumber(int numb){
        if (this.getObjectByNumder(numb) != null){
            this.getObjectByNumder(numb).GetAtributes();
            return;
        }
        System.out.println("Нет компьютера с таким номером");
    }
    public int GetLen(){
        if (head.nextnode == head){
            return 1;
        }
        else {
            Node curr = head;
            int i = 1;
            while (curr.nextnode != head){
                curr = curr.nextnode;
                i++;
            }
            return i;
        }
    }
    public void AlltoList(){
        Node curr = head;
        if (curr.nextnode == head){
            head.data.GetAtributes();
            return;
        }
        while (curr.nextnode != head){
            curr.data.GetAtributes();
            curr = curr.nextnode;
        }
        curr.data.GetAtributes();
    }
    public boolean isEmpty(){
        return head == null;
    }

}

