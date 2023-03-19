package DSA.CustomLinkedList;
/*
    // Node are not at continuous memory location.
*/
public class main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(234);
        list.insert(4);
        list.insert(26);
        list.insert(66);
        list.insert(24);
        list.display();
        list.delete(234);
        list.display();
    }
}
