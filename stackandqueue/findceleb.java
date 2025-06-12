package stackandqueue;
public class findceleb {
    //we have to find the who is celebrity
    //basically the celebrity is he doesnt know anyone and everyone knows him
    public int findceleb(int[][]mat){
        int n=mat.length;
        int[]knowme=new int[n];
        int[]iknow=new int[n];
        for(int i=0;i<n;i++){
                knowme[i]=0;
                iknow[i]=0;     
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    knowme[i]++;
                    iknow[j]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(knowme[i]==n-1 && iknow[i]==0){
                return i;
            }
        }
        return -1;
    }
    //tc-o(n^2)+o(n)
    //sc-o(2n)

    //optimal solution was 
    public int findcel(int[][]arr){
        int n=arr.length;
        int top=0;
        int bottom=n-1;
        while(top<=bottom){
             if(arr[top][bottom]==1){
            top++;
        }
        else if(arr[bottom][top]==1){
            bottom--;
        }
        else{
            top--;
            bottom--;
        }

        }
       if(top>bottom) return -1;
       for(int i=0;i<n-1;i++){
        if(i==top) continue;
        if(arr[top][i]==1 && arr[i][top]==0);
        else return -1;
       }
       return top;
    }
    
}
