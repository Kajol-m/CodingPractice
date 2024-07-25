import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
        return q.poll();
    }
    
    public int top() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
        int top = q.poll();
        q.add(top);
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
