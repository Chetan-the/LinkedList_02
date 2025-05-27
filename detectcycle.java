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
public class detectcycle{
    //given the head of the linkedlists we have to find if it is exists a cycle or not
    //using hashing
    public boolean hascycle(node head){
        Set<node> st=new HashSet<>();
        node temp=head;
        while(temp!=null){
            if(st.contains(temp)){
                return true;
            }
                        st.add(temp);
            temp=temp.next;

        }
        return false;
    }
    //optimal solution was using slow and fast pointer 
    //both will meets bcz of having cycle
    public boolean havecycle(node head){
        node slow=head;
        node fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }

}