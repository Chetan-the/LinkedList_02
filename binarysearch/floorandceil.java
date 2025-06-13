public class floorandceil {
    //in here the ceil is simply lower bound
    //floor is the greatest index not the smallest index
    //floor is arr[mid]<=x
    //and the ceil is arr[mid]>=x
    public int floor(int[]arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
}
