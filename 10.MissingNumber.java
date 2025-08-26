//aproach 1
class Solution {
    int missingNum(int arr[]) {
        // code here
        int xor=0;
        for(int i=1;i<=arr.length+1;i++) xor^=i;
        for(int i:arr) xor^=i;
        return xor;
    }
}
//aproach 2
class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long sum=0;
        long tot=n*(n+1)/2;
        for(int i:arr) sum+=i;
        return (int)(tot-sum);
    }
}
//aproach 3
class Solution {
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        boolean[] seen = new boolean[n + 1];
        for (int num : arr) seen[num] = true;

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) return i;
        }
        return -1; // should not happen
    }
}
//aproach 4
import java.util.*;

class Solution {
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return arr.length + 1;
    }
}
