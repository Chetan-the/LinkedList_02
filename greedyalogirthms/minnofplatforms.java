import java.util.*;
public class minnofplatforms {
    //we have to find the min no of platforms required while travelling in a train
    //brute force solution was taking an element and checks if it has an intersection in between the other elements with four cases
    public int findminplatforms(int[]arr,int []dep){
        int maxcnt=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int cnt=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j] && arr[i]<=dep[j] || arr[j]>=arr[i] && dep[i]>=arr[j]){
                    cnt++;
                }
                maxcnt=Math.max(maxcnt,cnt);
            }
        }
        return maxcnt;
    }
    //optimal soln was by sorting
    public int minnofplatform(int[]arr,int[]dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int platforms=1;
        int maxplatforms=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                platforms++;
                i++;    
            }
            else{
                platforms--;
                j++;
            }
            maxplatforms=Math.max(maxplatforms,platforms);   
        }
        return maxplatforms;


    }
    
}
