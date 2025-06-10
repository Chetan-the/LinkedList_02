package stackandqueue;
import java.util.*;
public class queueusingstack{
    //we have to do queue using stack that means if it is stack but we have to make that it works like queue
    //as we know first stack we need only one pointer and for queue we need both two pointers
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    //s1-->s2
    //n-->s1
    //s2-->s1
    public void push(int x){
         while(!st1.isEmpty()){
        st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

    }
    public int pop(){
        if(st1.isEmpty()){
            return -1;
        }
        return st1.pop();
    }
    public int peek(){
        if(st1.isEmpty()){
            return -1;
        }
        return st1.peek();
    }

   
}