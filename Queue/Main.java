package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        try{
            queueOp test=new queueOp(3);
            test.offer(20);
            test.offer(30);
            test.display();
            System.out.println("top "+test.first());
            System.out.println("size "+test.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
