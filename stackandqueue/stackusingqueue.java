package stackandqueue;
import java.util.*;
public class stackusingqueue {
    //in here we are implement stack using queue
    //that means even that is queue but it works like a stack
    Queue<Integer> q=new LinkedList<>();
    public void push(int x){
        int n=q.size();
        q.add(x);
        for(int i=0;i<n;i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        return q.remove();
    }
    public int peek(){
        return q.peek();
    }
    
    
}
