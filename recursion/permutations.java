package recursion;
import java.util.*;
public class permutations {
    //we have to return the all possible permutations of a number
  //one 1st we can do it with hasharray or some other array
  public void subset(int []arr,int[]freq,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
    if(temp.size()==freq.length){
        ans.add(new ArrayList<>(temp));
        return;
    }
    for(int i=0;i<arr.length;i++){
        if(freq[i]==0){
            temp.add(freq[i]);
            freq[i]=0;
            subset(arr,freq,temp,ans);
            temp.remove(temp.size()-1);
            freq[i]=1;  
        }
    }
  
       

       

   
  }
  public ArrayList<ArrayList<Integer>> permu(int[]arr){
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    ArrayList<Integer> temp=new ArrayList<Integer>();
    int[]freq=new int[arr.length];
    for(int i=0;i<freq.length;i++){
        freq[i]=0;
    }
    subset(arr,freq,temp,ans);
    return ans;
  }
}
