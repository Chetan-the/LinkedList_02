public class firstandlastoccurence{
    //brute force was linear search and tell what is first index and last index of an element
    public int[] firstnlastocc(int[]arr,int x){
        int n=arr.length;
        int[]ans=new int[2];
        int start=-1,end=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(start==-1 ){
                     start=i;
                     end=i;
                }
                if(start!=-1){
                    end=i;
                }
               
            }
        }
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    //optimal soln was by simply using lowerbound which it gives smallest index
    //and upper bound -1;
    public int ub(int []arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public int lb(int[]arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
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
    public int[] findfandloccur(int[]arr,int x){
        int n=arr.length;
        int[]ans=new int[2];

        if(lb(arr,x)==n && arr[lb(arr,x)]!=x){
            ans[0]=-1;
            ans[1]=-1;
        }
        else{
            ans[0]=lb(arr,x);
            ans[1]=ub(arr,x)-1;
        }
        return ans;
//and for count occurences we haev to do the lastoccurrence-firstoccurence+1;
    }
}