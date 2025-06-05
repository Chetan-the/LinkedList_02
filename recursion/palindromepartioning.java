package recursion;
import java.util.*;
public class palindromepartioning {
    //have to generate the all the possible string and return he palindrome ans
    public ArrayList<ArrayList<String>> subset(int ind,String s,ArrayList<String> temp,ArrayList<ArrayList<String>> ans){
        int n=s.length();
        if(ind==n){
            ans.add(new ArrayList<>(temp));
            return ans;
        }
        for(int i=ind;i<n;i++){
            if(ispalindrome(s,ind,i)){
                temp.add(s.substring(ind,i+1));
                subset(ind+1,s,temp,ans);
                temp.remove(temp.size()-1);

                
            }
        }
        
                return ans;

    }
    public boolean ispalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;   
            }
             
           
        }
        return true;
        
    }
    public ArrayList<ArrayList<String>> palindromeset(String s){
        ArrayList<ArrayList<String>> anslist=new ArrayList<>();
        ArrayList<ArrayList<String>> ans=subset(0,s,new ArrayList<>(),anslist);
        return ans; 
    }
    
}
