class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int low = 1;
        int high = maxElement(arr);
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int total = totalHour(arr, mid);
            
            if (total <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }

    public static int maxElement(int arr[]) {
        int max = -1;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int totalHour(int arr[], int mid) {
        int total = 0;
        for (int i : arr) {
            total += (i + mid - 1) / mid;
        }
        return total;
    }
}