public class kokoeating {
    //we have to find the  minimal time required to eat the whole bananas
    public int func(int[]arr,int target){
        int n=arr.length;
        int tar=0;
        for(int i=0;i<n;i++){
            tar+=Math.ceil(arr[i]/target);

        }
        return tar;
    }
    public int kokoeating(int[]arr,int target){
        //that means we have to find that how many bananas that koko can eat then the target time
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(func(arr,mid)<=target){
                ans=mid;
                high=mid-1;
            }
            low=mid+1;
        }
        return ans;
    }

    
}
