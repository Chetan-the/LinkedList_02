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
public class palindrome {
    //given the linkedlist we have to find that whether the linkedlists is palindrome or not
    //brute force solution was keeping all the elements in a data strucuture and then check for palindrome
    public boolean checkpalindrome(node head){
        Stack<Integer> st=new Stack<Integer>();
        node temp=head;
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.data!=st.peek()){
                return false;
            }
            st.pop();
            temp=temp.next;
        }
        return true;

    }
    //optimal solution was by using the middle+then reverse the right half
    public node reverse(node head){
        if(head==null || head.next==null){
            return head;
        }
        node pre=null;
       node temp=head;
       
        while(temp!=null){
            node front=temp.next;
            temp.next=pre;
            pre=temp;
            temp=front;
          
        }
        return pre;

    }
    public boolean checkpal(node head){
        if(head==null || head.next==null){
            return true;
        }

        //finding middle node if it is even using slow and fast pointers approach
       
            node slow=head;
            node fast=head;
            while(fast.next!=null || fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            slow.next=reverse(slow.next);
            slow=slow.next;
            while(slow!=null){
                if(head.data==slow.data){
                    head=head.next;
                    slow=slow.next;
                }
                else{
                    return false;
                }
            }
            return true;
        
        //after finding the middle then reverse the right half of the linked lists

        
    }

    
}
