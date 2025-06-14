public class bloomboquee {
    public boolean possible(int[]arr,int day,int m,int k){
        int n=arr.length;
        int cnt=0;
        int bloomday=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                bloomday+=cnt/k;
                cnt=0;
            }
        }
        bloomday+=cnt/k;
        if(bloomday>=k) return true;
        return false;
    }
    public int mindays(int[]arr,int m,int k){
        //possible days to bloom was from mini to max number in an array
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(n<m*k) return -1;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.min(max,arr[i]);
        }
        for(int i=min;i<=max;i++){
            if(possible(arr,i,m,k)==true){
                return i;
            }
        }
        return -1;
    }
    //optimal soln was
    public int minposdays(int[]arr,int m,int k){
int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.min(max,arr[i]);
        }  
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,mid,m,k)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }  
        return ans;    
    }
    
}
