package DSA.CustomLinkedList;

public class CircularLinkedList {
    private Node head,tail;

    private class Node{
        private int value;
        private Node next;

        private Node(int val){
            this.value = val;
        }
        private Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){ // O(1)
        Node node = new Node(val);

        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){ // O(N)
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value+"->");
                node = node.next;
            }while(node != head);
        }
        System.out.println("Head");
    }

    public void delete(int val){ // O(1)
        Node node = head;
        if(head == null){
            return;
        }
        if(head.value == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
        }while(node != head);
    }
}
