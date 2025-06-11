package stackandqueue;
import java.util.*;
class node{
    int key;
    int val;
    node prev;
    node next;
    public node(int key,int val){
        this.key=key;
        this.val=val;
        
    }
}
public class LRUcache{
    
    //we solve this problem using doubly linkedlist and the hashmap which it keep track of all the elements
    int capacity;
    node head=new node(0,0);
    node tail=new node(0,0);
    Map<Integer,node> mp=new HashMap<>();
    public LRUcache(int capacity){
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int key(int key){
        if(mp.containsKey(key)){
            node n=mp.get(key);
            deletenode(n);
            insertafterhead(n);
            return n.val;
        }
        else{
            return -1;
        }
    }
    public void put(int  key,int Value){
        if(mp.containsKey(key)){
            deletenode(mp.get(key));

        }
        if(mp.size()==capacity){
            deletenode(tail.prev);
        }
        insertafterhead(new node(key,Value));
    }
    public void deletenode(node n){
        mp.remove(n.key);
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }
    public void insertafterhead(node n){
        mp.put(n.key,n);
        node curnode=n.next.next;
        head.next=n;
        n.prev=head;
        n.next=curnode;
        curnode.prev=n;
        



    }

}