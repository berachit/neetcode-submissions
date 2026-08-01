class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        // // t.c. -> 0(n + n)
        // int n = triplets.length;
        // for (int i = 0; i < n; i++) {
        //     if (triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2]) {
        //         triplets[i][0] = 0;
        //         triplets[i][1] = 0;
        //         triplets[i][2] = 0;
        //     }
        // }
        // int maxA = 0;
        // int maxB = 0;
        // int maxC = 0;

        // for (int i = 0; i < n; i++) {
        //     if (triplets[i][0] == 0 && triplets[i][1] == 0 && triplets[i][2] == 0)
        //         continue;
        //     maxA = Math.max(maxA, triplets[i][0]);
        //     maxB = Math.max(maxB, triplets[i][1]);
        //     maxC = Math.max(maxC, triplets[i][2]);
        // }

        // return maxA == target[0] && maxB == target[1] && maxC == target[2];

        // ==========================================

        // t.c. -> O(n)
        int n = triplets.length;
        int maxA = 0;
        int maxB = 0;
        int maxC = 0;
        for (int i = 0; i < n; i++) {
            if (triplets[i][0] <= target[0] && triplets[i][1] <= target[1] && triplets[i][2] <= target[2]) {
            maxA = Math.max(maxA, triplets[i][0]);
            maxB = Math.max(maxB, triplets[i][1]);
            maxC = Math.max(maxC, triplets[i][2]);
            }
        }
        return maxA == target[0] && maxB == target[1] && maxC == target[2];
    }
}
