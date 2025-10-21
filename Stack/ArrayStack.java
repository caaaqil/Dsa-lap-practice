package Stack;

public class ArrayStack {
    public static void main(String[] args) {
        try{
            ArrayStack stack=new ArrayStack(3);

            stack.push(20);
            stack.push(30);
            stack.push(40);
            System.out.println("top element is "+stack.peek());
//            stack.push(20);

            System.out.println("popped item "+stack.pop());
            System.out.println("popped item "+stack.pop());
            System.out.println("popped item "+stack.pop());
            System.out.println("popped item "+stack.pop());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    int[]stack;
    int top;
    int maxsize;
    ArrayStack(int maxsize){
        this.maxsize=maxsize;
        top=-1;
        stack=new int[maxsize];
    }
    boolean isfull(){
        return top==maxsize-1;
    }
    void push(int item)throws Exception{
        if (isfull())
            throw new Exception("stack is full");
        stack[++top]=item;
        System.out.println("pushed item "+item);
    }
    //PEEK method
    int peek()throws Exception{
        if (top==-1)
            throw new Exception("nothing top");
        return stack[top];
    }
    //pop method
    int pop()throws Exception{
        if (top==-1)
            throw new Exception("stack is empty");
        return stack[top--];
    }
}
