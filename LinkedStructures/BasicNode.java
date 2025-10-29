package LinkedStructures;

public class BasicNode {
    public static void main(String[] args) {
        //creating nodes
        node first = new node(10);
        node second = new node(20);
        node third = new node(30);
        //link nodes together
        first.next = second;
        second.next = third;

        //point head node
        node head = first;
        //traversing
        node current = head;
        while (current !=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

