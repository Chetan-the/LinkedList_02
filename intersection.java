import java.util.*;
class node{
    int data;
    node next;
    public node(int data,node next){
        this.data=data;
        this.next=next;
    }
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class intersection{
    //given two linkedlists of the two heads we have to find the intersection of the two linkedlists
    public node insertnode(node head,int val){
       node newhead=new node(val);
       if(head==null){
        head=newhead;
        return head;
       }
       node temp=head;
       while(temp.next!=null){
        temp=temp.next;
       }
       temp.next=newhead;
       return head;
    }
    public node intersectionnode(node head1,node head2){
        while(head2!=null){
            node temp=head1;
            while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    //better solution was byv using hashing 
    public node intersectionusinghash(node head1,node head2){
        Set<node> st=new HashSet<node>();
        while(head1!=null){
            st.add(head1);
            head1=head1.next;
        }
        while(head2!=null){
            if(st.contains(head2)){
                return head2;
            }
            head2=head2.next;
        }
        return null;
    }
    //optimal solution
    public node intersec(node head1,node head2){
        int cnt1=0;
        int cnt2=0;
        node dummy1=head1;
        node dummy2=head2;
        while(dummy1!=null && dummy2!=null ){
            if(dummy1!=null){
                cnt1++;
                dummy1=dummy1.next;
            }
            if(dummy2!=null){
                cnt2++;
                dummy2=dummy2.next;
            }
        }
        int diff=Math.abs(cnt1-cnt2);
        dummy1=head1;
        dummy2=head2;
        if(cnt2>cnt1){
            
        }
        else{
            for(int i=0;i<diff;i++){
                dummy1=dummy1.next;
            }

        }

        for(int i=0;i<diff;i++){
            dummy1=dummy1.next;
            dummy2=dummy2.next;
        }
        return dummy2;
    }

}