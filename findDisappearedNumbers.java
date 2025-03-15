class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
        for(int i=0;i<n.length;i++){
            int idx=Math.abs(n[i])-1;
            if(n[idx]>0){
                n[idx]*=-1;
            }
        }
        List<Integer> hm=new ArrayList<>();
        for(int i=0;i<n.length;i++){
            if(n[i]>0){
                hm.add(i+1);
            }
        }
        return hm;
    }
}