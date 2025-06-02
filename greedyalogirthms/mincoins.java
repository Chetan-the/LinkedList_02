import java.util.*;
public class mincoins {
    public static void main (String[]args){
        int[]coins={1,2,5,10,20,100,500,1000};
        int value=49;
        int n=coins.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            while(value>=coins[i]){
                value-=coins[i];
                ans.add(coins[i]);
            }
        }
        
    }
    
}
