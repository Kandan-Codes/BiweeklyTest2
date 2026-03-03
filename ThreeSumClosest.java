package biweekly;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int index = 0; index < nums.length; index++) {
            int startIndex = index + 1, endIndex = nums.length - 1;
            while (startIndex < endIndex) {
                int tripletSum = nums[index] + nums[startIndex] + nums[endIndex];
                if(tripletSum == target) {
                    return tripletSum;
                }

                if(Math.abs(tripletSum - target) < Math.abs(closestSum - target)) {
                    closestSum = tripletSum;
                }
                else if(tripletSum < target) {
                    startIndex++;
                }
                else if(tripletSum > target) {
                    endIndex--;
                }
            }
        }
        return closestSum;
    }
}
