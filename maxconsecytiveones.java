public class maxconsecytiveones{
    public int findmaxconsones(int[]arr){
        int cnt=0;
        int max=0;
        for(int x:arr){
            if(x==1){
                cnt++;
                max=Math.max(max,cnt);
                
            }else{
                cnt=0;
            }
        }
        return max;
    }
}