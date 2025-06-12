package stackandqueue;
import java.util.*;
class stock{
    int value;
    int index;
    public stock(int value,int index){
        this.value=value;
        this.index=index;
    }
}
public class stockspanner {
    //max consecutive days which is lesser than that of the current day
    ArrayList<Integer> ans=new ArrayList<>();
    public int max(int val){
        ans.add(val);
        int n=ans.size();
        int cnt=0;
        for(int i=n-2;i>=0;i--){
            if(ans.get(i)<=val){
                cnt++;
            }
        }
        return cnt;
    }
    //optimal soln was
    public int maxstock(int val){
        Stack<stock> st=new Stack<>();
        int cnt=1;
        while(!st.isEmpty() && st.peek().value<=val){
            cnt+=st.pop().index;    
        }
        st.push(new stock(val,cnt));
        return cnt;

    }
   

    
        

}
    

