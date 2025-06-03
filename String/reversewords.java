package String;

public class reversewords {
    //we have to reverse the words of the string
    String reverse(String s){
       
        String[]words=s.split(" +");
       StringBuilder sb=new StringBuilder();
       for(int i=words.length-1;i>=0;i--){
        sb.append(words[i]);
        if(1!=0){
            sb.append(" ");
        }
       }
       return sb.toString();
    }
    
}
