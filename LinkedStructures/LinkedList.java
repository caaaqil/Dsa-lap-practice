package LinkedStructures;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println(list.isempty());
        list.push(20);
        list.push(30);
        list.push(40);
        list.display();
        System.out.println(list.searching(60));
        System.out.println("after remove ");
        list.pop();
        list.display();


    }
    int count;
    Node top;
    LinkedList(){
        count=0;
        top=null;
    }
    void push(int data){
        Node newnode=new Node(data);
        newnode.setNext(top);
        top=newnode;
        count++;
    }
    //is empty
    boolean isempty(){
        return count==0;
    }
    //pop method
    int pop(){
        int removed=top.getData();
        top=top.getNext();
        count--;
        return removed;
    }
    //searching
    boolean searching(int searchdata){
        boolean found=false;
        Node current=top;
        while (current!=null){
            if (searchdata == current.getData()) {
                found = true;
                return found;
            }
            current=current.getNext();
        }
        return false;
    }
    void display(){
        Node current=top;
        while (current!=null){
            System.out.println(current.getData());
            current=current.getNext();
        }
    }
}
