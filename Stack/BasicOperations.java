package Stack;

import java.util.Stack;

public class BasicOperations {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        //push operator to add elements in stack
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1);
        // Peek operator to display top element
        System.out.println(s1.peek());
        // pop operator to remove last element added
        s1.pop();
        System.out.println(s1);
        // isempty operator to chech if stack is empty or not & returns boolean
        System.out.println(s1.empty());
        //size oprator to display number of items inside stack
        System.out.println(s1.size());
    }

}
