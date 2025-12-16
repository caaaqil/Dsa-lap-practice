package Queue;
import java.util.EmptyStackException;

public class queueOp {
    Node head;
    Node tail;
    int counter;
    int maxsize;
    queueOp(int maxsize){
        head=null;
        tail=null;
        counter=0;
        this.maxsize=maxsize;
    }
    //    add -enqueue
    void add(int data)throws Exception{
        if (counter>=maxsize){
            throw new Exception("queue is full");
        }
        Node newnode=new Node(data);
        if (isempty())
            head=newnode;
        else
            tail.setNext(newnode);
        tail=newnode;
        counter++;
    }
    //    offer - enqueue
    boolean offer(int data){
        if(counter>=maxsize){
            return false;
        }
        Node newnode=new Node(data);
        if (isempty())
            head=newnode;
        else
            tail.setNext(newnode);
        tail=newnode;
        counter++;
        return true;
    }
    //    remove - dequeue
    int remove(){
        int remove =head.getData();
        head=head.getNext();
        counter--;
        return remove;
    }
    int poll()throws Exception{
        if (isempty()){
            throw new EmptyStackException();
        }
        int remove =head.getData();
        head=head.getNext();
        counter--;
        return remove;
    }
    //    display
    void display(){
        Node current=head;
        while (current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }
    //    isempty
    boolean isempty(){
        return counter==0;
    }
    //    head element
    int first(){
        return head.getData();
    }
    //    size
    int size(){
        return counter;
    }
}
