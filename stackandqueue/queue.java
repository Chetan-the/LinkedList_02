package stackandqueue;

public class queue {
    //implementing queue using the array
    int[]arr;
    int start,end,cursize,maxsize;
    queue(){
        arr=new int[16];
        start=-1;
        end=-1;
        cursize=0;

    }
    queue(int maxsize){
        this.maxsize=maxsize;
        arr=new int[maxsize];
        start=-1;
        end=-1;
        cursize=0;

    }
    public void push(int x){
        if(cursize==maxsize){
            System.out.println("sorry queue is full");
        }
        if(end==-1){
            start=0;
            end=0;
        }
        end=(end+1)%maxsize;
        arr[end]=x;
        cursize++;

    }
    public int pop(){
        if(start==-1){
           System.out.println("queue is empty");
        }
        if(cursize==-1){
            start=-1;
            end=-1;
        }
        int pop=arr[start];
        start=(start+1)%maxsize;
         cursize--;
        return pop;
       

    }
    public int top(){
        if(start==-1){
            System.out.println("queue is filled");
        }
        return arr[start];
    }
    public int size(){
        return cursize;
    }

    
}
