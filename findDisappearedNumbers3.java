class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
        
        List<Integer> hm=new ArrayList<>();
        
            for(int j=0;j<n.length;j++){
                while(n[n[j]-1]!=n[j]){
                    int temp=n[j];
                    n[j]=n[n[j]-1];
                    n[temp-1]=temp;
                }
                
            }
            for(int i=0;i<n.length;i++){
                if(n[i]!=i+1){
                    hm.add(i+1);
                }
            }
            
        return hm;
        }

}
