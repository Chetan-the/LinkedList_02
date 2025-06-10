package stackandqueue;
import java.util.*;
public class nextgreaterelement {

    public int[] findnextgreater(int[]nums1,int[]nums2){
        //where nums1 is subset of nums2
        //we can do this by using the hashmap
        int[]nge=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        //where hashmap stores the element and next greatest element
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                mp.put(nums2[i],-1);
            }
            else{
                mp.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            nge[i]=mp.get(nums1[i]);
        }
         return nge;
    }
   
}
