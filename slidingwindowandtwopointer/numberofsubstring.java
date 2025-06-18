package slidingwindowandtwopointer;
public class numberofsubstring{
    //we have to find the number of substrings which it contains all the three characters
    //brute folrce was by generating the all possible substring
    public int noofsubstring(String s){
        int cnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[]hash=new int[3];
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+hash[1]+hash[2]==3){
                    cnt++;
                }

            }
        }
        return cnt;
    }
    //optimal was using sliding window
    public int findnoof(String s){
        int n=s.length();
        int[]lastseen=new int[3];
        int cnt=0;
        for(int i=0;i<n;i++){
            lastseen[s.charAt(i)-'a']=i;
            int val=Math.min(lastseen[0],lastseen[1]);
            cnt+=1+Math.min(val,lastseen[2]);


        }
        return cnt;
        }
}