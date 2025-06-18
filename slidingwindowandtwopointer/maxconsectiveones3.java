package slidingwindowandtwopointer;

public class maxconsectiveones3 {
    //given an array and the value of k in that here we can flip atmost 2 elements from 0 to 1 and find the maxsubarray
    //we can do this by finding the maxsubarray with atmost k zeroes
    //if we find that then that means we can simply find the answer
    public int maxones(int[]arr,int k){
        //brute force was by simply generating the all the subarrays
        int n=arr.length;
        int maxlen=0;
        for(int i=0;i<n;i++){
           int maxzeroes=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    maxzeroes++;
                }
                if(maxzeroes<=k){
                    int len=j-i+1;
                    maxlen=Math.max(maxlen,len);
                }

            }

        }
        return maxlen;
    }
    //optimal was by using 2 pointers and sliding window
    public int maximumones(int[]arr,int k){
        int n=arr.length;
        int l=0,r=0;
        int zeroes=0;
        int maxlen=0;
        while(r<n){
            if(arr[r]==0) zeroes++;
            while(zeroes>k){
                if(arr[l]==0){
                    zeroes--;
                }
                    l++;
            }
            if(zeroes<k){
                int len=r-l+1;
                maxlen=Math.max(len,maxlen);

            }
            r++;

        }
        return maxlen;
        
    }
    
}
