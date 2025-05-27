public class reverselinkedlistbyk {
    //given the head of the linkedlists we have to reverse the linkedlists exactly by k size
    public node reversebyk(node head,int k){
        if(head==null || k==1){
            return head;
        }
        //we solve this using pre ,cur and nex nodes
        node dummy=new node(-1);
        dummy.next=head;
        node cur=dummy,nex=dummy,pre=dummy;
        //pattern was cur node was always the firstnode
        //and the nex node was always the second node
        //and the prenode was stand at the dummynode
        int cnt=0;
        while(cur.next!=null){
            cur=cur.next;
              cnt++;
        }
        while(cnt>=k){
            cur=pre.next;
            nex=cur.next;
            for(int i=1;i<k;i++){
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            pre=cur;
            cnt-=k;
        }
        return dummy.next;
    }
    
}
