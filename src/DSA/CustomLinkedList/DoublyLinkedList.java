package DSA.CustomLinkedList;

public class DoublyLinkedList {

    private int size;
    private Node head;

    public DoublyLinkedList(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next,prev;

        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){ // O(1)
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){ // Checking for null point exception.
            head.prev = node;
        }
        head = node;

        size++;
    }

//    public void insertLast(int val){
//        Node nodeInsert = new Node(val);
//        if(size == 0){
//            insertFirst(val);
//            return;
//        }
//
//        Node node = head;
//        int ref = 0;
//        while (ref == size-1) {
//            node = node.next;
//            ref++;
//        }
//
//        node.next = nodeInsert;
//        nodeInsert.next = null;
//        nodeInsert.prev = node;
//
//        size++;
//    }

    public void display(){ // O(N)
        Node node = head;
        while(node != null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void displayReverse() { // O(N)
        Node node = head;
        Node last = null;

        while (node != null) {
            last = node;
            node = node.next;
        }

        while (last != null) {
            System.out.print(last.value +" -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
}
