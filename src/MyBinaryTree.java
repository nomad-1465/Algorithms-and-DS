import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MyBinaryTree {
    public static class Node{
        public int value;
        public Node left, right;
        public Node(int value){
            this.value=value;
            left=right=null;
        }
    }

    Node root;
    public MyBinaryTree(){
        root=null;
    }
    public MyBinaryTree(int value){
        root = new Node(value);
    }

    public void traverseInOrder(Node node){
        if(node!=null){
            traverseInOrder(node.left);
            System.out.print(node.value+" ");
            traverseInOrder(node.right);
        }

    }

    public void traversePostOrder(Node node){
        if(node!=null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value+" ");
        }

    }
    public void traversePreOrder(Node node){
        if(node!=null){
            System.out.print(node.value+" ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }
    public List<Integer> iterative_in_order(Node root){
        Stack<Node> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current=stack.pop();
            if(current.left!=null){
                stack.push(current.left);
            }
            list.add(current.value);
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MyBinaryTree tree=new MyBinaryTree();
        tree.root=new Node(1);                               //  1
        tree.root.left=new Node(2);                         //  2  3
        tree.root.right=new Node(3);                        // 4 5
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
//        tree.traversePreOrder(tree.root); //  1=>2=>4=>5=>3
//        System.out.println();
//        tree.traverseInOrder(tree.root);  //  4=>5=>2=>1=>3
//        System.out.println();
//        tree.traversePostOrder(tree.root);  //  4=>5=>2=>3=>1
//        System.out.println("------------------------------");

        System.out.println(tree.iterative_in_order(tree.root));

    }
}
