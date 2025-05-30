import java.util.*;
public class removeduplicates{
    //brute force solution was using set data structure
    public int removeduplicates(int[]arr){
        Set<Integer> st=new HashSet<Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
        int k=st.size();
        int j=0;
        for(int x:st){
            arr[j++]=x;
        }
        return k;

    }
    //optimal solution was by using the two pointer approach
    public int removingduplicates(int[]arr){
        int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    



}