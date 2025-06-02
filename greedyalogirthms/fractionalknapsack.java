import java.util.*;
class item{
    int value;
    int weight;
    public item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }
}
class itemComparator implements Comparator<item>{
    public int compare(item i1,item i2){
        double r1=(double)(i1.value)/(double)(i1.weight);
         double r2=(double)(i2.value)/(double)(i2.weight);
        if(r1>r2){
            return -1;
        }
        else if(r1<r2){
            return 1;
        }
        return 0;
    }
}
public class fractionalknapsack{
    public double maxvalue(item[]arr,int n,int wt){
        double finalvalue=0;
        int curwt=0;
        for(int i=0;i<n;i++){
            if(curwt+arr[i].weight<=wt){
                finalvalue+=arr[i].value;
                curwt+=arr[i].weight; 
            }
            else{
                int remain=wt-curwt;
                finalvalue+=(double)(arr[i].value)/(double)(arr[i].weight)*(double)(remain);

            }
        }
        return finalvalue;
    }


}