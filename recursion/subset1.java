package recursion;
import java.util.*;
public class subset1 {
    public ArrayList<Integer> subsets(int[] arr,int ind,int sum){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int n=arr.length;
        if(ind==n){
            temp.add(sum);
        }
        //if picked move the index pointer and increase the sum
        subsets(arr,ind+1,sum+arr[ind]);
        //if didnt pick move the index pointer and sum stills the same
      subsets(arr,ind+1,sum);
      return temp;
        

    }
    //we have to generate all the subsets and return it on the ascending order for returing we can use merge sort as well
    public ArrayList<Integer> generatesubsets(int[]arr){
       
        ArrayList<Integer> ans=subsets(arr,0,0);
        Collections.sort(ans);
        return ans;

        
    }
    
}

