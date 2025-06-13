public class serachelementinsort {
    //we have to search the element in an sortedarray
    public int searchsorted(int[]arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]==x){
                return mid;
            }
            //check for which half is sorted 
            //check if left half is sorted
            if(arr[low]<=arr[mid] ){
                if(arr[low]<=x && x<=arr[mid] ){
                    //that means x lies on it so check on the left half and eliminate right half
                    high=mid-1;

                }
                //if it not lies
                else low=mid+1;
            }
            //check if right half is sorted

            if(arr[mid]<=arr[high]){
                if(arr[mid]<=x && x<=arr[high]){
                    
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
    
}
