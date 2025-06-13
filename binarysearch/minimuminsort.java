public class minimuminsort {
    //we have to find the minimum valuee in the sorted array
    public int minvalue(int[]arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            //if left half is sorted
            //if it sorted may or may not have minimum
            if(arr[low]<=arr[mid]){
               min=Math.min(min,arr[low]);
                high=mid-1;
            }
            

            
             else{
                min=Math.min(min,arr[mid]);
                low=mid+1;
             }
                

            
        }
        return min;
    } 
    
}
//to find the no of times the array is sorted we have to find the min value  index that is answer;