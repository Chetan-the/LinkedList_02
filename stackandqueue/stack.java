package stackandqueue;
class stack{
    int size=10;

    int[]st=new int[size];
    int top=-1;
    public void push(int x){
        top=top+1;
        st[top]=x;
    }
    public int pop(){
        int x=st[top];
        top=top-1;
        return x;

    }
    public int top(){
     return st[top];  
    }
    int size(){
        return top+1;
    }

}