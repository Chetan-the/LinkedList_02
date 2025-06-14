public class maxtomin {
    //in here given two numbers we have to replace the number to max and min and find 
    //the difference of those two max-min numbers;
    public int findmaxtomin(int n){
        //intution was to conver into string and by replace character may be solve the problem
        String s=Integer.toString(n);
        char firstplace=' ';
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!='9'){
                firstplace=s.charAt(i);
            }

        }
        String maxstr=s.replace(firstplace,'9');
        //for minimum
        //we just have to change the firstplace to 0
        char val=s.charAt(0);
        String minstr=s.replace(val,'0');

        int max=Integer.parseInt(maxstr);
        int min=Integer.parseInt(minstr);
        return max-min;

    }
    
}
