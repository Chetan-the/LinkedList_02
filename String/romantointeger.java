package String;
import java.util.*;
public class romantointeger {
    //we have to convert from roman to integer
    //we can do this using hashmap
    public int romantoint(String s){
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int ans=0;
        for(int i=0;i<n-1;i++){
            int val=s.charAt(i);
            if(i<n-1 && val<s.charAt(i+1)){
                ans-=val;
            }
            else{
                ans+=val;
            }

        }
        return ans;

        
    }
    
}
