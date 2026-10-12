class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] arr = score.clone();
        Arrays.sort(arr);
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            int rank = n - i;
            int index = -1;
            for (int j = 0; j < n; j++) {
                if (score[j] == arr[i]) {
                    index = j;
                    break;
                }
            }
            if (rank == 1)
                result[index] = "Gold Medal";
            else if (rank == 2)
                result[index] = "Silver Medal";
            else if (rank == 3)
                result[index] = "Bronze Medal";
            else
                result[index] = String.valueOf(rank);
        }
        return result;
    }
}
