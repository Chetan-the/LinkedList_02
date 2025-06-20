class node{
    int data;
    node next;
    node bottom;
    public node(int data,node next,node bottom){
        this.data=data;
        this.next=next;
        this.bottom=bottom;

    }
    public node(int data){
        this.data=data;
        this.next=null;
        this.bottom=null;
    }
}
public class flatten{
    //using the merge two linkedlists techniques
    public node mergetwolists(node a,node b){
        node temp=new node(-1);
        node res=temp;
       while(a!=null && b!=null){
        if(a.data<b.data){
            temp.bottom=a;
            temp=temp.bottom;
            a=a.bottom;
        }
        else{
            temp.bottom=b;
            temp=temp.bottom;
            b=b.bottom;
        }


       }
       if(a!=null){
        temp.bottom=a;
       }
       else{
        temp.bottom=b;
       }
       return res.bottom;


    }
    public node flattennodes(node head){
        if(head== null || head.next==null){
            return head;
        }
        head.next=flattennodes(head.next);
        head=mergetwolists(head,head.next);

        return head;
        


    }
}