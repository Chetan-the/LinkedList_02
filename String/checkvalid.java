package String;
//checking all possile ways through recurssion if it is astrekis
//to check for to make it validate string or not
public class checkvalid{
    public boolean checking(String s,int ind,int cnt){
        int n=s.length();
       
        if(cnt<0){
            return false;
        }
        if(cnt==n){
            return false;
        }
        char ch=s.charAt(ind);
        if(ch=='('){
            return checking(s,ind+1,cnt+1);
        }
        else if(ch==')'){
            return checking(s,ind+1,cnt-1);
        }
        else{
            return checking(s,ind+1,cnt+1) || checking(s,ind+1,cnt-1) || checking(s,ind+1,cnt);
        }
    }
    //in here we have it has opening and closing with asterik if we change asterik and check after checking can we make it as a valid or not
    //try out all possible and check and return the answer
    public  boolean check(String s){
        
        return checking(s,0,0);

    }
    

}