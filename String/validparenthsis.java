package String;
import java.util.*;
public class validparenthsis {
    //given a string if opening bracket has corresponding closing bracket then we can said it as a valid parenthsis
    public boolean valid(String s){
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            //if opening brackets push it into the stack
            if(ch=='(' || ch=='[' || ch=='{' ){
                st.push(ch);
            }
            //if it is closing bracket then check for corresponding closing bracket
            else{
                //that means if having closing bracket and if corresponding bracket is that is open bracket is not in st that means it is empty then return false;
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(ch==')' && top!='(' || ch==']' && top!='[' || ch=='}' && top!='{'){
                    return false;
                }

            }
        }
        return st.isEmpty();
        //after completing all if it is empty that means opening and closing brackets are equal so return true; if st is empty
    }
    
}
