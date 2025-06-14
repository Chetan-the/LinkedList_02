
//we have to find the nth root of a number
//we can solve  it by applying binary search bcz the values
/*
 1x1x1=1
 2x2x2=8
 3x3x3=27 these values are in increasing order so we can aply binary search here
 */
public class nthroot {
    //optimal solution
    public int func(int mid,int n,int m){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>mid) return 2;
        }
        if(ans==m){
            return 1;
        }

        return 0;
        

    }
    public int findnthroot(int n,int m){
        //search space is in between 1..27 bcz 1 power of 27 is 27..
        int low=1;
        int high=m;
        while(low<high){
            int mid=low+high/2;
            int midn=func(mid,n,m);
            if(midn==1){
                return mid;
            }
            else if(midn==0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
  //tc-o(logN)
  //sc-o(1)
    
}
