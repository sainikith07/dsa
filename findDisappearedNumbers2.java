class Solution {
    public List<Integer> findDisappearedNumbers(int[] n) {
        Arrays.sort(n);
        List<Integer> hm=new ArrayList<>();
        int l=0,h=n.length-1;
            for(int j=1;j<=n.length;j++){
                if(!binSearch(j,l,h,n)){
                    hm.add(j);
                }
            }
            
        return hm;
        }
    
    boolean binSearch(int tar,int l,int h,int[] n){
        while(l<=h){
            int m=h+(l-h)/2;
            if(n[m]==tar){
                return true;
            }
            else if(n[m]<tar){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }

        return false ;
    }
}
