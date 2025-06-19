package slidingwindowandtwopointer;

public class countbinarysum {
    //we have to find the binary sum equals k which it is goal
    //we do fun(arr,k)-func(arr,k-1) which the function was to find lessthanorequal to goal
    public int fun(int[]arr,int goal){
        if(goal<0){
            return 0;
        }
        int l=0;
        int r=0;
        int sum=0;
        int cnt=0;
        int n=arr.length;
        while(r<n){
            sum+=arr[r];
            while(sum>goal){
                sum-=arr[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;

        }
        return cnt;

    }
    public int noof(int[]arr,int goal){
        int ans=fun(arr,goal)-fun(arr,goal-1);
        return ans;
    }
 //for nice subarrays simply convert into if it is odd-1 and if it is even-0 and do similar way
 //if it is subseqeunce and used once we sort and check for condiiton simply
    
}
