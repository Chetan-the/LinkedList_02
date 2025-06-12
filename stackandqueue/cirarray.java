package stackandqueue;
public class cirarray {
    //we have to find the max difference between the adjacent elements in a circular array
    public int maxdiffincirarray(int[]arr){
        int n=arr.length;
        int diff=arr[n-1]-arr[0];
        for(int i=0;i<n-1;i++){
            int difference=Math.abs(arr[i]-arr[i+1]);
            diff=Math.min(diff,difference);

        }
        return diff;
    }

    
}
