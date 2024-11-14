import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }
        
        List<Integer> ans = new ArrayList<>();
        int check = arr.length / 3;
        
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > check) {
                ans.add(element);
            }
        }
        
        return ans;
    }
}
