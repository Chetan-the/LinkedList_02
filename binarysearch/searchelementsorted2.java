public class searchelementsorted2 {
    //we have to return either yes or no
    //in ahere it contains duplicates
    //bcz of arr[0]=arr[mid]==arr[high] just bcz of this
    //not able to identify the sorted half
    public boolean findsearch(int[]arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return true;
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=x && x<=arr[mid]){
                    high=mid-1;
                    
                }
                low=mid+1;
            }
            if(arr[mid]<=x && x<=arr[high]){
                low=mid+1;
            }
            high=mid-1;
        }
        return false;
    }

    
}
