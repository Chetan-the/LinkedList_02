import java.util.*;
class job{
    int id;
    int deadline;
    int profit;
    public job(int id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}



public class jobsequence {
    //we have to return the max profix
    //so sort it based on the profit
    public int[] maxprofit(job[]arr,int n){
        Arrays.sort(arr,(a,b)->b.profit-a.profit);

        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].deadline>maxi){
                maxi=arr[i].deadline;
            }
        }
        int[]result=new int[maxi+1];
        for(int i=0;i<result.length;i++){
            result[i]=-1;
        }
        int cntjobs=0;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(result[j]==-1){
                    result[j]=i;
                    cntjobs++;
                    maxprofit+=arr[i].profit;
                     break;

                }

            }
        }
        int[]ans=new int[2];
        ans[0]=maxprofit;
        ans[1]=cntjobs;

        return ans;
     }

    
    
}
