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

    
}
