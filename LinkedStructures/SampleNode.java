package LinkedStructures;

public class SampleNode {
    public static void main(String[] args) {
        SampleNode test=new SampleNode();
        test.push(30);
        test.push(40);
        test.display();

    }
    //push
    node head;
    void push(int data){
        node newnode=new node(data);
        if (head==null){
            head=newnode;
        }

        else {
            node Current=head;
            while (Current.next!=null){
                Current=Current.next;
            }
            Current.next=newnode;
        }

    }

    void display(){
        node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
