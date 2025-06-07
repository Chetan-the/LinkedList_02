package recursion;

public class sudokusolver{
    public  boolean sudokusolver(char[][]board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<'9';ch++){
                        if(iscorrect(i,j,board,ch)){
                            board[i][j]=ch;
                            if(sudokusolver(board)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                }
            }
          


        }
          return false;

    }
   public boolean iscorrect(int row,int col,char[][]board,char ch){
    for(int i=0;i<9;i++){
        if(board[row][i]==ch){
            return false;
            
        }
        if(board[i][col]==ch){
            return false;
        }
        int boxrow=3*(row/3)+i/3;
        int boxcol=3*(col/3)+i%3;
        if(board[boxrow][boxcol]==ch){
            return false;
        }

    }
    return true;
   }
}
