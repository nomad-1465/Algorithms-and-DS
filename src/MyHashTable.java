import java.util.*;

public class MyHashTable {


    private int size;
    private LinkedList<Node>[]table;

    private class Node{
        private Object key;
        private Object value;
        public Node(Object key,Object value){
            this.key=key;
            this.value=value;
        }
    }
    public MyHashTable(int size){
        this.size=size;
        table=new LinkedList[size];
        for(int i=0;i<size;i++){
            table[i]=new LinkedList<>();
        }
    }

    private int hash_function(Object key){
        int hash=key.hashCode()%size;
        if (hash < 0) {
            hash += size;
        }
        return hash;
    }

    public void insert(Object key, Object value){
        int index=hash_function(key);
        LinkedList<Node>list=table[index];
        for(Node node:list){
            if(node.key.equals(key)){
                node.value=value;
                return;
            }
        }
        list.add(new Node(key,value));
    }
    public Object get(Object key){
        int index=hash_function(key);
        LinkedList<Node>list=table[index];
        for(Node node:list){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return "Nothing found with this key";
    }

    public void delete(Object key){
        int index=hash_function(key);
        LinkedList<Node>list=table[index];
        for(Node node:list){
            if(node.key.equals(key)){
                list.remove(node);
                return;
            }
        }
    }

}
