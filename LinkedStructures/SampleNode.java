package LinkedStructures;

public class SampleNode {
    public static void main(String[] args) {
        SampleNode test=new SampleNode();
        test.push(30);
        test.push(40);
        test.push(60);
        test.display();
        System.out.println("after remove");
        test.remove(40);
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
    //remove or pop

    boolean remove(int data){
        if (head==null){
            return false;
        }

        if (head.data==data){
            head=head.next;
            return true;
        }

        // searching then remove
        node prev=head;
        node current=head.next;
        while (current!=null){
            if (current.data==data){
                prev.next=current.next;
            }
            prev=current;
            current=current.next;
        }
        return false;
    }

    void display(){
        node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
