class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid < high && arr[mid] == arr[mid + 1]) {
                int count = high - mid;
                if (count % 2 == 0) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else if (mid > low && arr[mid] == arr[mid - 1]) {
                int count = mid - low;
                if (count % 2 == 0) {
                    high = mid - 2;
                } else {
                    low = mid + 1;
                }
            } else {
                return arr[mid];
            }
        }
        return arr[low];
    }
}