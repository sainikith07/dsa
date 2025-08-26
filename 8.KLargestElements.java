//approach 1
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=n-k;i--){
            a.add(arr[i]);
        }
        return a;
    }
}
//approach 2
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        int n=arr.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
            if(pq.size()>k) pq.poll();
        }
        ArrayList<Integer> a=new ArrayList<>(pq);
        a.sort(Collections.reverseOrder());
      
        return a;
    }
}

//approach 3
class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        int n=arr.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            pq.add(i);
           
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<k;i++){
            a.add(pq.poll());
        }
      
        return a;
    }
}
