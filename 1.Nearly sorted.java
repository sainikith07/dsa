class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=arr.length;
        if(k>=n)  Arrays.sort(arr);
        else{
            for(int i=0;i<=k;i++){
                pq.add(arr[i]);
            }
            int idx=0;
            for(int i=k+1;i<n;i++){
                arr[idx++]=pq.poll();
                pq.add(arr[i]);
            
            }
            while(!pq.isEmpty()){
                arr[idx++]=pq.poll();
            }
        }
        
    }
}
