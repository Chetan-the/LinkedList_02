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

public class nodeofcycle {
    //we have to find the node from that where the cycle starts
    public node detectingcycle(node head){
        HashMap<node,Integer> mp=new HashMap<>();
        node temp=head;
        while(temp!=null){
            if(mp.containsKey(temp)){
                return temp;
            }
            mp.put(temp,1);
            temp=temp.next;
        }
        return null;

    }

    //optimal solution was using slow and fast pointer
    public node startcycle(node head){
        if(head==null || head.next==null){
            return null;
        }
        node entry=head;
        node slow=head;
        node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            if(slow==fast)
        {
            while(slow!=entry){
                entry=entry.next;
                slow=slow.next;
            }
            return entry;

        }   
             slow=slow.next;
            fast=fast.next.next;
        }
        return null;
    }

    
}
