public class allocatebooks{
    //we have to allocate book to atleast one student
    //search space range is high of the array bcz so atleast every student can hold one book
    //and max is sum of array bcz if all the books allocated to only one student so
    public int canweplace(int[]arr,int pages){
        int student=1;
        int presentpages=0;
        for(int i=0;i<arr.length;i++){
            if(presentpages+arr[i]<=pages){
                presentpages+=arr[i];
            }
            else{
                student++;
                presentpages=arr[i];

            }
        }
        return student;
    }
    public int maxallocate(int[]arr,int students){
        int n=arr.length;
        int sum=0;
     int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(arr[i],max);
        }
    int low=max;
    int high=sum;

    for(int i=low;i<=high;i++){
        if(canweplace(arr,i)==students){
            return i;
        }
    }
    return -1;

    }
    //optimal was by using binarysearch
    public int maxiumallocate(int[]arr,int students){
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(canweplace(arr,mid)==students){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
        //the same logic to the painter partions and splitting as well
    }
   
}