package slidingwindowandtwopointer;

public class longestrepeating {
    //we have to find the longest repeating character by replacing them
    //brute force was by generating all the sub arrays and have to find the maxlen 
    //we can change wherever it is in having low frequency characters
    //by doing len-maxfreq we have to change the remaininf if it is less than given k
    //then we can simply find the maxlen
    public int maxrepeat(String s,int k){
        int maxlen=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[]hash=new int[26];
            int maxfreq=0;
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'A']++;
             maxfreq=Math.max(maxfreq,hash[s.charAt(j)-'A']);
             int change=j-i+1-maxfreq;
             if(change<=k){
                int len=j-i+1;
                maxlen=Math.max(maxlen,len);
             }
             else break;
            }
            

        }
        return maxlen;
    }
    //optimal soln was by using two pointers and sliding window
    public int maxcons(String s,int k){
        int n=s.length();
        int l=0;
        int r=n-1;
        int maxlen=0;
        int maxfreq=0;
        int[]hash=new int[26];
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'A']);
          int change=r-l+1-maxfreq;
          while(change>k){
            hash[s.charAt(l)-'A']--;
            maxfreq=0;
            for(int i=0;i<25;i++){
                maxfreq=Math.max(maxfreq,hash[i]);
            }
            l++;
          }
          if(change<=k){
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
          }


        }
        return maxlen;
    }
    
}
