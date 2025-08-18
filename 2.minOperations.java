//Forward Approach 
class Solution {
    public int minOperations(int x, int y) {
        int steps = 0;

        while (x != y) {
            if (x < y) {
                if (x * 2 <= y + 1) {
                    x *= 2;
                } else {
                    x -= 1;
                }
            } else { 
                x -= 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minOperations(4, 7)); // 2
        System.out.println(sol.minOperations(2, 5)); // 4
    }
}
