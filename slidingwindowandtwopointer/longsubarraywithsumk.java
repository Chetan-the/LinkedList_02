package slidingwindowandtwopointer;
import java.util.*;
public class longsubarraywithsumk {
    //we have to find the longest sub array with sum k
     public int longestsub(int[]arr,long k){
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int prefixsum=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            prefixsum+=arr[i];
            if(prefixsum==k){
                maxlen=Math.max(maxlen,i+1);
            }
            long rem=prefixsum-k;
            if(mp.containsKey(rem)){
                int len=i-mp.get(rem);
                maxlen=Math.max(maxlen,len);



            }
            else{
                mp.put(prefixsum,i);
            }


        }
        return maxlen;
     }
    //optimal soln was simply by using two pointer approach
    public int maxsubsum(int[]arr,int k){
        int n=arr.length;
        int sum=0;
        int l=0,r=0;
        int maxlen=0;
        while(r<n){
            while(l<=r && sum>k){
                sum-=arr[l];
                l++;
            }
           if(sum==k){
            maxlen=Math.max(maxlen,r-l+1);
           }
            r++;
           if(r<n){
           
            sum+=arr[r];
           }
        }
        return maxlen;
    }
}
