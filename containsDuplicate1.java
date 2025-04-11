class Solution {
    public boolean containsDuplicate(int[] n) {
      
        for (int i=0;i<n.length;i++) {
            for(int j=i+1;j<n.length;j++)
            if (n[i]==n[j]) {
                return true;
            }
            
        }
        return false;
    }
}
//1.n^2 2.sort n compare nlogn+n  3.ordered set nlogn 4 unordered n
