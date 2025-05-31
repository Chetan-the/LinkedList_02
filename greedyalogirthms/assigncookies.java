public class assigncookies {

    public int getcookies(int[]child,int[]cookies){
        int l=0;
        int r=0;
        while(l<child.length && r<cookies.length){
            if(cookies[r]>=child[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}
