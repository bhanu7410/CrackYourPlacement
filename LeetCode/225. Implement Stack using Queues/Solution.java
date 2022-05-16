import java.util.LinkedList;
import java.util.Queue;

class Solution {   
    Queue<Integer> queue;

    public Solution() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        int n = queue.size();
        queue.add(x);
        while(n != 0) {
            int val = queue.poll();
            queue.add(val);
            n--;
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}