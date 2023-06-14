package LinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class SingleLinkedList {
    private static class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
    }
    private Node head;
    private int size;

    public void add(int value){
        if (head == null) {
            this.head=new Node(value);
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(value);
        }
        size++;
    }
    public int get(int index){
        Node temp=head;
        int curInd=0;
        while(temp!=null){
            if(curInd==index){
                return temp.value;
            }
            curInd++;
            temp=temp.next;
        }
        throw new IndexOutOfBoundsException();
    }
    public void remove(int index){
        Node temp=head;
        int curInd=0;
        if(index==0){
            head=temp.next;
            size--;
            return;
        }
        while(temp!=null){
            if(curInd==index-1){
                temp.next=temp.next.next;
                size--;
                return;
            }
            temp=temp.next;
            curInd++;
        }
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        Node temp=head;
        int arr[]=new int[size];
        int i=0;
        while(temp!=null){
            arr[i++]=temp.value;
            temp=temp.next;
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.add(1);
        list.add(3);
        list.add(90);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        list.remove(0);
        list.remove(1);
        System.out.println(list);
        LinkedList<Integer>list1=new LinkedList<>();
    }
}
