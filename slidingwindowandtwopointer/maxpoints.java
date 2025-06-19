package slidingwindowandtwopointer;
public class maxpoints {
    //we have to return the max points which they given the value of k
    //intution was using take four elements from front if the value of k is 4
    //removing one element from back and add element from right keep pn doing this
    //using the leftsum,right sum and maxsum
    public int maxsum(int[]arr,int k){
        int n=arr.length;
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k;i++){
            lsum+=arr[i];
        }
        maxsum=lsum;
        int rind=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-arr[i];
            rsum=rsum+arr[rind];
            rind--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }


    
}
