package recursion;
import java.util.*;
public class combinationsum2 {
    //same as combination 1 but in here now we want unique
    /*
     Brute force was to generate all like in combination1  and using hashset and again transfer to arraylist and return the ans
     */
    public  ArrayList<ArrayList<Integer>> subset(int ind,int []arr,int target,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return ans;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            temp.add(arr[i]);
            subset(ind+1,arr,target-arr[ind],temp,ans);
            temp.remove(temp.size()-1);
        }
        return ans;

    }
    public ArrayList<ArrayList<Integer>> combsum(int[]arr,int target){
        ArrayList<ArrayList<Integer>> anslist=new ArrayList<>();
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=subset(0,arr,target,new ArrayList<>(),anslist);
        return ans;
    }
    
}
