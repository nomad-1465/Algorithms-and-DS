package LinkedLists;

import java.util.Arrays;

public class DoublyLinkedList {
    public class Node{
        private Node next;
        private Node prev;
        private int value;
        public Node(Node next,Node prev,int value){
            this.next=next;
            this.prev=prev;
            this.value=value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void add(int value){
        if(head==null){
            head = new Node(null, null, value);
            tail = head;
        }
        else{
            tail.next = new Node(null, tail, value);
            tail = tail.next;
        }
        size++;
    }
    public int get(int index) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                return temp.value;
            }
            temp = temp.next;
            i++;
        }
        throw new IndexOutOfBoundsException();
    }




    public String toString(){
        int arr[]=new int[size];
        int i=0;
        Node temp=head;
        while(temp!=null){
            arr[i]=temp.value;
            temp=temp.next;
            i++;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
