import java.util.ArrayList;
import java.util.List;

public class WindowsMax {

    public List<Integer> updateDeque(List<Integer> deque) {

        if(deque.size() < 2) {
            return deque;
        }

        int max = deque.get(0);

        for(Integer num: deque){
            if(max < num) {
                max = num;
            }
        }


        while(deque.get(0) != max) {
            deque.remove(0);
        }

        return deque;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        int outLen = nums.length - k + 1;
        int[] windowsMax = new int[outLen];

        List<Integer> deque = new ArrayList<>();

        for(int i = 0; i < k; i++) {

            deque.add(nums[i]);

        }

        updateDeque(deque);

        int currentMax = deque.get(0);

        int j = 1;
        windowsMax[0] = currentMax;

        for(int i = k; i < nums.length; i++) {
            if(nums[i] > currentMax) {
                while(!deque.isEmpty()) {
                    deque.remove(0);
                }

                deque.add(nums[i]);
                currentMax = deque.get(0);

            }
            else{
                if(deque.size() < k) {
                    deque.add(nums[i]);
                }
                else {
                    deque.remove(0);
                    deque.add(nums[i]);
                    updateDeque(deque);
                }
            }

            windowsMax[j] = deque.get(0);
        }
        j++;
        return windowsMax;
    }
}
