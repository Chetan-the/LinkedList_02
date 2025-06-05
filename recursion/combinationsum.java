package recursion;
import java.util.*;
public class combinationsum {
    //given an array of elements and the target and we pick the same element any times and after 
    //and return the combinations
    //this type of problems we do using recursion with pick and not pick approach
    public ArrayList<ArrayList<Integer>> subset(int ind,int[]arr,int target,ArrayList<Integer> temp){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return ans;
        }
            if(arr[ind]<=target){
                temp.add(arr[ind]);
                subset(ind,arr,target-arr[ind],temp);
                temp.remove(temp.size()-1); 
            }
            subset(ind+1,arr,target,temp);

            return ans;

        }


    
    public ArrayList<ArrayList<Integer>> combsum(int[]arr,int target){
    
        ArrayList<ArrayList<Integer>> ans=subset(0,arr,target,new ArrayList<>());
        return ans;
    } 
}
