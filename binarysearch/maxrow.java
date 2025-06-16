public class maxrow{
    //we have to find the maximum number of rows
    public int lb(int[]arr,int index,int n){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=index){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public int maxone(int[][]arr){
       int  m=arr.length;
        int n=arr[0].length;
         int maxcnt=0;
    int index=-1;
    for(int i=0;i<n;i++){
        int cntones=n-lb(arr[i],1,n);
        if(cntones>maxcnt){
            maxcnt=cntones;
            index=i;
        }
    }
    return index;

    }
   
}