import java.util.*;


class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n + 1];
        ArrayList<Integer>[] listArr = new ArrayList[n+1];
        Queue<Integer> queue = new LinkedList();
        int[] arr = new int[n+1];
        
        for(int i = 1;  i <= n; i++)
            listArr[i] = new ArrayList();
        
        for(int i = 0; i < edge.length; i++){
            int n1 = edge[i][0];
            int n2 = edge[i][1];
            
            listArr[n1].add(n2);
            listArr[n2].add(n1);
        }
        
        queue.add(1);
        visited[1] = true;
        
        while(queue.size() != 0){
            int a = queue.poll();
            
            for(int b : listArr[a]){
                if(!visited[b]){
                    queue.add(b);
                    visited[b] = true;
                    
                    arr[b] = arr[a] + 1;
                }
            }
        }
        
        
        Arrays.sort(arr);
        
        int max = arr[n];
        for(int i = n; i > 0; i--){
            if(max == arr[i])
                answer++;
            else
                break;
        }
        
        return answer;
    }
}