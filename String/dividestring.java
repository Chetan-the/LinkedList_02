package String;
public class dividestring{
    public String[] divide(String s,int k,String fill){
        int n=s.length();
        int val=(n+k-1)/k;
        String[]ans=new String[val];
        int index=0;
        for(int i=0;i<n;i+=k){
            StringBuilder word=new StringBuilder();
            for(int j=i;j<i+k;j++){
                if(j<n){
                    word.append(s.charAt(j));
                }else{
                    word.append(fill);
                }

            }
            ans[index++]=word.toString();

        }
        return ans;
    }
}