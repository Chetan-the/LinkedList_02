import java.util.*;
public class aggressivecow {
    public boolean canweplace(int[]arr,int dist,int cows){
        int n=arr.length;
        int lastcow=arr[0];
        int totalcows=0;
        for(int i=1;i<n;i++){
            if(arr[i]-lastcow>=dist){
                lastcow=arr[i];
                totalcows++;
            }
        }
        if(totalcows>=cows) return true;
        else return false;
    }
    public int findaggrresive(int[]arr,int cows){
        //we have to place all these cows in the array with min distance of max
        Arrays.sort(arr);
        int n=arr.length;
      int min=arr[0];
      int max=arr[n-1];
        for(int i=min;i<=max;i++){
            if(canweplace(arr,i,cows)==true){
                continue;
            }
            else return i-1;
            
        }
        return -1;
        
    }
    //optimal soln was using binary search
    public int findcows(int[]arr,int cows){
        int n=arr.length;
        int ans=-1;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];

        while(low<=high){
            int mid=(low+high)/2;
            if(canweplace(arr,mid,cows)==true) {
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
