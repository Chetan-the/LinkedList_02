package stackandqueue;
import java.util.*;
public class minstack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minst=new Stack<>();
    public void push(int val){
        st.push(val);
        if(minst.isEmpty()){
            minst.push(val);
        }
        else{
            minst.push(Math.min(minst.peek(),val));
        }

    }
    public void pop(){
        if(!st.isEmpty()){
            st.pop();
            minst.pop();
        }
        
    }
    public int top(){
        return st.peek();
    }
    public int getmin(){
        if(st.isEmpty()){
            return -1;
        }
        return minst.peek();
    }
    
}
