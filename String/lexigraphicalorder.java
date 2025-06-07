package String;
import java.util.*;
//we have to remove the left most minimum character below the star
public class lexigraphicalorder {
    public String removestarts(String s){
        List<Character> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(char ch:s.toCharArray()){
                if(ch=='*'){
                    char minchar=Character.MAX_VALUE;
                    for(char c:ans){
                        if(c<minchar){
                            minchar=c;
                        }
                    }
                    for(int j=ans.size()-1;j>=0;j--){
                        if(ans.get(j)==minchar){
                            ans.remove(minchar);
                            break;
                        }

                    }

                }
                else{
                    ans.add(ch);
                }
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:ans){
            str.append(ch);
        }
        return str.toString();

    }
    
}
