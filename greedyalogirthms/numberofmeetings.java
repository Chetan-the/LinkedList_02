import java.util.*;
class meeting{
    int start;
    int end;
    int position;
    public meeting(int start,int end,int position){
        this.start=start;
        this.end=end;
        this.position=position;
    }
}
class meetingComparator implements Comparator<meeting>{
    public int compare(meeting o1,meeting o2){
        if(o1.end<o2.end){
            return -1;
        }
        else if(o1.end>o2.end){
            return 1;
        }
        else if(o1.position<o2.position){
            return -1;
        }
        return 1;
    }
}
public class numberofmeetings{
    public void maxnoofmeetings(int[]start,int[]end){
    ArrayList<meeting> ls=new ArrayList<meeting>();
    for(int i=0;i<start.length;i++){
        ls.add(new meeting(start[i],end[i],i));
    }
    meetingComparator mc=new meetingComparator();
    Collections.sort(ls,mc);
    ArrayList<Integer> ans=new ArrayList<Integer>();
    ans.add(ls.get(0).position);
    int limit=ls.get(0).end;
    for(int i=1;i<end.length;i++){
        if(ls.get(i).start>limit){
            limit=ls.get(i).end;
            ans.add(ls.get(i).position);

        }
    }
}

}
