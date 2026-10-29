package BasicLinkedList;

public class Student2 {
    public static void main(String[] args) {

        Node a = new Node(10);

        a.next = new Node(20);
        a.next.next = new Node(30);
        a.next.next.next = new Node(40);
        a.next.next.next.next = new Node(50);

        System.out.print(a.data + " -> ");
        System.out.print(a.next.data + " -> ");
        System.out.print(a.next.next.data + " -> ");
        System.out.print(a.next.next.next.data + " -> ");
        System.out.print(a.next.next.next.next.data + " -> ");
        System.out.println("null");
    }
}