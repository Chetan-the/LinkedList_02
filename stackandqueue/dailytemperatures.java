package stackandqueue;
import java.util.*;
public class dailytemperatures {
    public int[] getdailytemperatures(int[]arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[]ans=new int[n+1];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=0;
            else ans[i]=st.peek()-i;
            st.push(i);
        }
        return ans;
    }
    
}
