public class sqrt{
    //we have to find the sqrt of a number 
    //brute force was using Math.sqrt(n) and by o(n)
    //optimal was by using binary search
    public int findsqrt(int n){
        int low=1;
        int high=n;
        int ans=-1;
        while(low<=high){
            int mid=low+high/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}