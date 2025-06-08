package recursion;
import java.util.*;
public class ratinmaze{
    //the rate in the 0,0 position and the final destination is in n-1,n-1 
    //we have to find the all possible ways to reach destination in lexicographical order
    public static void solve(int i,int j,int[][]arr,int n,ArrayList<String> ans,String move,int[][]vis){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return ;
        }
        //downward
        if(i+1<n && vis[i+1][j]==0 && arr[i+1][j]==1){
            vis[i][j]=1;
             solve(i+1,j,arr,n,ans,move+'D',vis);
             vis[i][j]=0;
        }
        //leftward
        if(j-1>=0 && vis[i][j-1]==0 && arr[i][j-1]==1){
            vis[i][j]=1;
            solve(i,j-1,arr,n,ans,move+'L',vis);
            vis[i][j]=0;
        }
        //right ward
        if(j+1<n && vis[i][j+1]==0 && arr[i][j+1]==1){
            vis[i][j]=1;
            solve(i,j+1,arr,n,ans,move+'R',vis);
            vis[i][j]=0;
        } 
        //upward
        if(i-1>=0 && vis[i+1][j]==0 && arr[i+1][j]==1){
            vis[i][j]=1;
            solve(i+1,j,arr,n,ans,move+'U',vis);
        }


    } 
    public static ArrayList<String> findpath(int[][]m,int n){
       
        int[][]vis=new int[n][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        String move="";
        ArrayList<String> ans=new ArrayList<>();
        solve(0,0,m,n,ans,move,vis);
        return ans;
    }

}