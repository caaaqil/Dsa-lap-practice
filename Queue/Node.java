package Queue;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
    int getData(){
        return data;
    }
    void setData(int data){
        this.data=data;
    }
    Node getNext(){
        return next;
    }
    void setNext(Node next){
        this.next=next;
    }
}
