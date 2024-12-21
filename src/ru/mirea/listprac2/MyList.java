package ru.mirea.listprac2;


class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
        next = null;
        prev = null;
    }
    public Node(int value, Node n,Node p){
        this.next = n;
        this.value = value;
        this.prev = p;
    }
}
class CircularLinkedList {
    private Node head;
    private Node tail;
    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }
    public void add(int data){
        Node obj = new Node(data);
        if (head == null){
            head = obj;
            tail = obj;
            obj.next = head;
            obj.prev = head;
        }
        else {
            Node curr = head;
            while (curr.next != head){
                curr = curr.next;
            }
            curr.next = obj;
            obj.next = head;
            obj.prev = curr;
            head.prev = obj;
            tail = obj;
        }
    }
    public void delete(int index){
        int i = 0;
        Node curr = head;
        Node prev = null;
        if (head == tail){
            head = tail = null;
            return;
        }
        if (index == 0){
            Node last = head;
            while(last.next != head){
                last = last.next;
            }
            last.next = head.next;
            head = head.next;
            head.prev = last;
            return;
        }
        while (i != index){
            prev = curr;
            curr = curr.next;
            i++;
        }
        curr.next.prev = prev;
        prev.next = curr.next;
    }
    public Node getNode(int index){
        int i = 0;
        Node curr = head;
        while (i != index){
            curr = curr.next;
            i++;
        }
        return curr;
    }
    public int getValue(int index){
        return this.getNode(index).value;
    }
    public int len(){
        int i = 1;
        if (head == null){
            return 0;
        }
        else {
            Node curr = head;
            while (curr.next != head){
                curr = curr.next;
                i++;
            }
            return i;
        }
    }
    public void output(){
        if (this.len() == 0){
            System.out.println();
        }
        else {
            int i = 0;
            while (i < len()){
                System.out.println(this.getValue(i));
                i++;
            }
        }
    }
    public void Bubblesort(){
        int n = len();
        for (int i = 0; i<n-1;i++){
            for (int k = 0; k<n-1;k++){
                if (this.getValue(k)>this.getValue(k+1)){
                    Node current = getNode(k);
                    Node nextcurrent = getNode(k+1);
                    if (current.value>nextcurrent.value){
                        Node prev = current.prev;
                        if (current == head){
                            head = nextcurrent;
                        }
                        if (nextcurrent == tail){
                            tail = current;
                        }
                        prev.next = nextcurrent;
                        current.next = nextcurrent.next;
                        //if (nextcurrent.next != null) {
                        nextcurrent.next.prev = current;
                        //}

                        nextcurrent.prev = prev;
                        nextcurrent.next = current;
                        current.prev = nextcurrent;
                    }
                }
            }
        }
    }
}
public class MyList {
    public static void main(String[] args){
        CircularLinkedList List = new CircularLinkedList();
        List.add(8);
        List.add(4);
        List.add(6);
        List.add(7);
        List.add(10);
        List.add(15);
        List.add(9);
        List.add(6);
        List.output();
        System.out.println(" ");
        List.Bubblesort();
        List.output();
        System.out.println();
        System.out.println(List.len());
        System.out.println();
        System.out.println(List.getNode(3).prev.value);
        System.out.println(List.getValue(3));
        System.out.println(List.getNode(3).next.value);
    }
}