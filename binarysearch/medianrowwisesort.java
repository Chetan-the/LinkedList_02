package binarysearch;
public class medianrowwisesort{
  public int ub(int[]arr,int x,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;

            }

        }
        return ans;
    }
    public int countsmallequal(int [][]arr,int m,int n,int x){
       int cnt=0;
       for(int i=0;i<m;i++){
        cnt+=ub(arr[i],x,n);
       }
       return cnt;

    }
    public int median(int[][]arr){
       
        int m=arr.length;
        int n=arr[0].length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low=Math.min(arr[i][0],low);
            high=Math.max(arr[n-1][0],high);
        }
        int req=(m*n)/2;
        while(low<=high){
            int mid=low+high/2;
            int smallequal=countsmallequal(arr,m,n,mid);
            if(smallequal<mid){
                low=mid+1;

            }
            high=mid-1;


        }
        return low;


    
    
    }
}
