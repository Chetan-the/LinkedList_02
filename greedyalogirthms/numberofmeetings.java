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
public class numberofmeetings {
    //if the meetings numbers are not in range then we can get the answer
    public void maxnoofmeetings(int[]start,int[]end){
        //sort it based on end and then we return the answer
       //here we are using custom class and sorting based on the end timings
       ArrayList<meeting> ls=new ArrayList<>();
       for(int i=0;i<start.length;i++){
        ls.add(new meeting(start[i],end[i],i));
       }
       meetingComparator ms=new meetingComparator();
       Collections.sort(ls,ms);
       ArrayList<Integer> ans=new ArrayList<Integer>();
       ans.add(ls.get(0).position);
       int limit=ls.get(0).end;
       for(int i=1;i<start.length;i++){
        if(ls.get(i).start>limit){
            limit=ls.get(i).end;
            ans.add(ls.get(i).position);
        }
       }
    }
    
}
