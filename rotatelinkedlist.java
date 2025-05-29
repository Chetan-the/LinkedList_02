public class rotatelinkedlist {
    //we have to rotate the linkedlist by k places
    //if we see in here if length = 5 and we have to do any multiplies of 5 rotations we get the original positions
    //so instead of that we have to do length%k and do that much rotations
    //brute force solution was go to the last node and last.next=head;
    public node rotatebykplaces(node head,int k){
        if(head==null || head.next==null){
            return head;
        }
        
        for(int i=0;i<k;i++){
            node temp=head;

            while(temp.next.next!=null){

                temp=temp.next;
            }
            node end=temp.next;
            temp.next=null;
            end.next=head;
            head=end;      
        }
        return head;

    }
    public node rotate(node head,int k){
        //optimal solution 
        //we have  to do k rotations
        if(head==null || head.next==null){
            return head;
        }
        int len=1;
        node temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%len;
        k=len-k;
        
        while(k-- >0){
            temp=temp.next;

        }
        head=temp.next;
        temp.next=null;

        return head;

        



    }
    
}
