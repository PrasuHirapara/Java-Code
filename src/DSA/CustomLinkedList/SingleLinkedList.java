package DSA.CustomLinkedList;

public class SingleLinkedList{

    private Node head,tail;
    private int size;
    public SingleLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // Adding new node at first place.
    public void insertFirst(int val){ // O(1)
        Node node = new Node(val); // Creating new node.
        node.next = head; // Adding new node at first.
        head = node; // Referencing new Node as head.

        if(tail == null){
            tail = head; // Adding first Node.
        }

        size++;
    }

    // Adding at last place.
    public void insertLast(int val){ // O(1)
        if(tail == null){ // If tail is null, add first elemnt.
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node = tail;

        size++;
    }

    // Adding at random position
    public void insert(int val, int index){ //O(N)
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    // Deleting at first
    public int deleteFirst(){ //O(1)
        int val = head.value;
        if(head == null){
            tail = null;
        }

        return val;
    }

    // Deleting at last
    public int deleteLast(){ // O(N)
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;

        tail = secondLast;
        tail.next = null;

        return val;
    }

    // Deleting at index
    public int delete(int index){ //O(N)
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;
        prev = prev.next.next;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }

        return node;
    }

    public Node find(int val){ // O(N)
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }

        return null;
    }
    public void display(){ // O(N)
        Node node = head;

        while(node != null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.println("End");
    }
}