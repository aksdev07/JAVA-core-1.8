package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();


        //adding people in queue
        queue.add("Anuj");
        queue.add("Suraj");
        queue.add("Saurav");
        System.out.println(queue);
        String nextInItem = queue.peek();
        System.out.println("nextInItem = " + nextInItem);

        for (int i=0;i<queue.size();i++){
            System.out.println("queue = " + queue);

           String recentlyRemoved = queue.remove();
            System.out.println("recentlyRemoved = " + recentlyRemoved);
        }
        System.out.println("queue = " + queue);



    }
}
