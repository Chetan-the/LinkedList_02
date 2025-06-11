package stackandqueue;
import java.util.*;
public class largestrectangle{
    //we have to find the largest rectangle in histogram
    public int[]findnse(int[]arr){
        Stack<Integer> st=new Stack<>();
        int[]rightsmall=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()) rightsmall[i]=arr.length;
            else rightsmall[i]=st.peek();
            st.push(arr[i]);

            
        }
        return rightsmall;
        

    }
    public int[] findpse(int[]arr){
        int[]leftsmall=new int[arr.length];
        Stack<Integer> st=new Stack<>();
       
        for(int i=0;i<arr.length;i++){
            
        while(!st.isEmpty() && arr[st.peek()]>arr[i]){
            st.pop();
        }
            if(st.isEmpty()) leftsmall[i]=0;
            else leftsmall[i]=st.peek();
            st.push(arr[i]);

        }
        return leftsmall;

    }
    public int findlargestrectangle(int[]arr){
        int[]nse=findnse(arr);
        int[]pse=findpse(arr);
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]*(nse[i]-pse[i]-1));
        }
        return maxi;

    }
}