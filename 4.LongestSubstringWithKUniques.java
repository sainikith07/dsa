class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int l=0,n=s.length(),maxi=-1;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.size()>k){
                char lefchar=s.charAt(l);
                hm.put(lefchar,hm.get(lefchar)-1);
                if(hm.get(lefchar)==0) hm.remove(lefchar);
                l++;
            }
            if(hm.size()==k){
                maxi=Math.max(maxi,i-l+1);
            }
        }
        return maxi;
    }
}
