package recursion;
import java.util.*;
public class subset2 {
    //we have to return the all possible subsets in increasing order by removing duplicates
public void  subset(int ind,int []arr,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> anslist){
    int n=arr.length;
anslist.add(new ArrayList<>(temp));

    for(int i=ind;i<n;i++){
        if(i>ind && arr[i]==arr[i-1]){
            continue;
        }
        temp.add(arr[i]);
        subset(ind+1,arr,temp,anslist);
     temp.remove(temp.size()-1);

    }
   
   
}
    public ArrayList<ArrayList<Integer>> generatesubsets(int[]arr){
        Arrays.sort(arr);
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
         subset(0,arr,new ArrayList<>(),ans);
         return ans;

    
       
    }
}
