class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
        List<Integer> hm=new ArrayList<>();
        for(int i=1;i<=n.length;i++){
            int f=0;
            for(int j=0;j<n.length;j++){
                if(n[j]==i){
                    f=1;
                    break;
                }
            }
            if(f==0){
                hm.add(i);
            }
        }
        return hm;
    }
}
