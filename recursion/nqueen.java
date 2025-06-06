package recursion;
import java.util.*;
public class nqueen {
    //we have to return that in which place we are going to place queen such that it doesnt attack another queen in nxn chess board
public void solve(int col,List<String> board,ArrayList<ArrayList<String>> ans,int n){
    if(col==n){
        ans.add(new ArrayList<>(board));
        return;

    }
    for(int row=0;row<n;row++){
        if(issafe(row,col,board,n)){
            char[] rowchars=board.get(row).toCharArray();
            rowchars[col]='Q';
            board.set(row,new String(rowchars));
            solve(col+1,board,ans,n);
            rowchars[col]='.';
            board.set(row,new String(rowchars));

        }
    }
}
public boolean issafe(int row,int col,List<String> board,int n){
    int duprow=row;
    int dupcol=col;
    while(row>=0 && col>=0){
        if(board.get(row).charAt(col)=='Q'){
            return false;
 
        }
        row--;
            col--;
    }
    col=dupcol;
    row=duprow;
    while(col>=0){
        if(board.get(row).charAt(col)=='Q'){
            return false;
            
        }
        col--;
    }
    row=duprow;
    col=dupcol;
    while(row<n && col>=0){
        if(board.get(row).charAt(col)=='Q'){
            return false;

        }
        row++;
        col--;
    }
    return true;
}
public ArrayList<ArrayList<String>> solvequeen(int n){
       List<String> board=new ArrayList<>();
       String row=".".repeat(n);
       for(int i=0;i<n;i++){
        board.add(row);
       }
       ArrayList<ArrayList<String>> ans= new ArrayList<>();
       solve(0,board,ans,n);
       return ans;



}  
}
