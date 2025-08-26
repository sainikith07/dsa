class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        if(a.length!=b.length) return false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:a){
           hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:b){
            if(!hm.containsKey(i)) return false; 
            hm.put(i, hm.get(i) - 1);
            if (hm.get(i) == 0) {
                hm.remove(i); 
            }
        }
    
        return hm.isEmpty();
    }
}
