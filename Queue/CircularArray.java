package Queue;

public class CircularArray {
    public static void main(String[] args) {
        try{
            CircularArray test=new CircularArray(3);
            test.enqueue(20);
            test.enqueue(30);
            test.enqueue(40);
            test.dequeue();
            test.display();
            test.search(90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    int [] queue;
    int front,rear,maxsize,counter;
    CircularArray(int size){
        maxsize=size;
        front=rear-1;
        counter=0;
        queue=new int[maxsize];
    }
    //    add-enqueue
    void enqueue(int data)throws Exception{
        if (isfull()){
            expand();
        }
        if (isempty()){
            front=rear=0;
        }else {
            rear=(rear+1)%maxsize;
        }
        queue[rear]=data;
        counter++;
    }
    //    dequeue
    int dequeue()throws Exception{
        if (isempty()){
            throw new Exception("queue is empty");
        }
        int remove=queue[front];
        front=(front+1)%maxsize;
        counter--;
        return remove;
    }
    //    expend
    void expand(){
        int [] newqueue=new int[maxsize*2];
        int index=front;
        for(int i=0;i<counter;i++){
            newqueue[i]=queue[index];
            index=(index+1)%maxsize;
        }
        queue=newqueue;
        front=0;
        rear=counter-1;
        maxsize=maxsize*2;
    }
    //    searching
    void search(int element) {
        if (isempty()) {
            System.out.println("Queue is empty");
            return;
        }

        int index = front;
        boolean found = false;

        for (int i = 0; i < counter; i++) {
            if (queue[index] == element) {
                System.out.println(element + " found at index " + index);
                found = true;
            }
            index = (index + 1) % maxsize;
        }

        if (!found) {
            System.out.println(element + " not found");
        }
    }
    //    display
    void display()throws Exception{
        if (isempty()){
            throw new Exception("queue is empty");
        }
        int index=front;
        for (int i=0; i<counter;i++){
            System.out.println(queue[index]);
            index=(index+1)%maxsize;
        }
        System.out.println();
    }
    //    isempty
    boolean isempty(){
        return counter==0;
    }
    //    isfull
    boolean isfull(){
        return counter==maxsize;
    }
//    size
    int size(){
        return counter;
    }
}

