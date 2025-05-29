public class trappingrainwater {
    //given an array we have to find where the water can be trapped in here the water is going to trapped only when if left and right are greater than arr[i]
    //we have to find the leftmax and rightmax to compute how much amount of water stored in it 
    public int[] leftmax( int []arr){
        int n=arr.length;
        int[]prefixmax=new int[n];
         prefixmax[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],arr[i]);
        }
        return prefixmax;
    }
    public int[] rightmax(int[]arr){
        int n=arr.length;
        int[]suffixmax=new int[n];
        suffixmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmax[i]=Math.max(arr[i],suffixmax[i+1]);
        }
        return suffixmax;
    }
    public int noofunits(int[]arr){
        int cnt=0;
        int[]prefixmax=leftmax(arr);
        int[]suffixmax=rightmax(arr);
        for(int i=0;i<arr.length;i++){
            int leftmax=prefixmax[i]; 
            int rightmax=suffixmax[i];

            if(arr[i]<leftmax && arr[i]<rightmax){
                cnt+=Math.min(leftmax,rightmax)-arr[i];
            }

        }
        return cnt;
    }

    
}
