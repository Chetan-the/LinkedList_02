package stackandqueue;
import java.util.*;
public class LCUcache{
    int capacity;
    HashMap<Integer,Integer> freqmap=new HashMap<>();
    HashMap<Integer,Integer> mp=new HashMap<>();
    public LCUcache(int capacity){
        this.capacity=capacity;
    }
    public int getkey(int key){
        if(!mp.containsKey(key)){
            return -1;
        }
        freqmap.put(key,freqmap.get(key)+1);
        return freqmap.get(key);
    }
    public void put(int key,int value){
        if(capacity==0){
            return;
        }
        if(mp.containsKey(key)){
            mp.put(key,value);
            freqmap.put(key,freqmap.get(key)+1);
            return;

        }
        if(freqmap.size()==capacity){
            int lfukey=-1;
            int minfreq=Integer.MAX_VALUE;
            for(int k:mp.keySet()){
                int freq=freqmap.get(k);
                if(freq<minfreq){
                    minfreq=freq;
                    lfukey=k;
                }
            }
            mp.remove(lfukey);
            freqmap.remove(lfukey);
        }
        mp.put(key,value);
        freqmap.put(key,1);
    }

}