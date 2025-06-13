public class lowerboundandup {
    //we have to find the lowerindex such that arr[index]>=target
    public int lowindex(int[]arr,int target){
        //brute force was simply do ls
        //optimal was
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        //which it solve the insert search position
    }
    public int upperb(int[]arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
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
