import java.util.*;
class SkipList<T extends Comparable<? super T>, U>{
    private class Node{
        T key;
        U value;
        Node next, down;
        int level;
        Node(T key, U value, int level, Node next, Node down){
            this.key = key;
            this.value = value;
            this.level = level;
            this.next = next;
            this.down = down;
        }
        @Override
        public String toString(){
            return "key=" + this.key +
                    ", value=" + this.value +
                    ", level=" + this.level;
        }
    }
    private Node head;
    private int size;
    private Random random;
    private double _p;

    public SkipList(){
        this.head = new Node(null, null, 0, null, null);
        this._p = 0.5;
        this.random = new Random();
        this.size = 0;
    }

    public int level(){
        int level = 0;
        while(level <= this.size && random.nextDouble() < this._p){
            level++;
        }
        return level;
    }
    public void add(T key, U value){
        int level = level();
        if(level > this.head.level){
            head = new Node(null, null, level, null, this.head);
        }
        Node curr = this.head;
        Node last = null;
        while(curr != null){
            if(curr.next == null || curr.next.key.compareTo(key) > 0){
                if(level >= curr.level){
                    Node n = new Node(key, value, curr.level, curr.next, null);
                    curr.next = n;
                    if(last != null)
                        last.down = n;
                    last = n;
                }
                curr = curr.down;
                continue;
            }
            else if(curr.next.key.equals(key)){
                curr.next.key = key;
                return;
            }
            curr = curr.next;
        }
        this.size++;
    }
    public boolean contains(T key){
        return get(key) == null;
    }
    public U get(T key){
        Node curr = this.head;
        while(curr != null){
            if(curr.next == null || curr.next.key.compareTo(key) > 0){
                curr = curr.down;
                continue;
            }
            else if(curr.next.key.equals(key)) return curr.next.value;
            curr = curr.next;
        }
        return null;
    }
    public Node remove(T key){
        Node curr = this.head;
        Node deleteNode = null;
        while(curr != null){
            if(curr.next == null || curr.next.key.compareTo(key) >= 0){
                if(curr.next.key.equals(key)){
                    deleteNode = curr.next;
                    curr.next = deleteNode.next;
                    deleteNode.next = null;
                }
                curr = curr.down;
                continue;
            }
            curr = curr.next;
        }
        return deleteNode;
    }

    @Override
    public String toString(){
        StringBuilder outer = new StringBuilder();
        Node curr = head.down;
        while(curr != null){
            Node temp = curr.next;
            StringBuilder inner = new StringBuilder();
            while(temp != null){
                inner.append(temp).append("---->");
                temp = temp.next;
            }
            outer.append(inner).append("\n");
            curr = curr.down;
        }
        return outer.toString().trim();
    }
}
public class Main{
    public static void main(String[] args) {
        SkipList<Integer, Integer> arr = new SkipList<>();
        arr.add(1, 2);
        arr.add(2, 3);
        arr.add(3, 4);
        System.out.println(arr);
        System.out.println(arr.remove(2));
        System.out.println(arr);
    }
}
