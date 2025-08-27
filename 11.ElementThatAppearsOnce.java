// approach 1

class Solution {
    public int getSingle(int[] arr) {
        // code here
        int ones=0,twos=0;
        for(int i:arr){
            ones=(ones^i)& ~twos;
            twos=(twos^i)& ~ones;
        }
        return ones;
    }
}
// approach 2
class Solution {
    public static int singleNumber(int[] arr) {
        int result = 0;
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int num : arr) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }
        return result;
    }
}

// approach 3
class Solution {
    public int getSingle(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int j:arr){
            hm.put(j,(hm.getOrDefault(j,0)+1));
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==1) return i;
        }
        
        return -1;
    }
}
