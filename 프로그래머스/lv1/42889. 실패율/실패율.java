import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        PriorityQueue<Fail> pq = new PriorityQueue<Fail>();
        int[] answer = new int[N];
        int[] arr = new int[N + 1];
        
        for(int i = 0;  i < stages.length; i++)
            for(int j = 0; j < stages[i]; j++)
                    arr[j]++;
        
        
        for(int i = 0; i < N ; i++){
            double stop = arr[i] - arr[i+1];
            
            pq.add(new Fail(i + 1, stop / (double)arr[i]));
        }
        
        int arrIndex = 0;
        while(!pq.isEmpty()){
            Fail f = pq.poll();
            
            answer[arrIndex++] = f.getIndex();
            
        }
        
        return answer;
    }
    
}

class Fail implements Comparable<Fail>{
    private int index;
    private double result;
    
    public Fail(int index, double result) {
        this.index = index;
        this.result = result;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public double getResult(){
        return this.result;
    }
    
    @Override
    public int compareTo(Fail target) {
        if(this.result < target.getResult()) 
            return 1;
        else if(this.result > target.getResult()) 
            return -1;
        else{
            if(this.index < target.getIndex())
                return -1;
            else
                return 1;
        }
    }
}

