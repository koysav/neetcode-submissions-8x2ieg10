class Solution {
public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();

    Arrays.sort(nums); // 🔥 ключовий крок

    for (int i = 0; i < nums.length - 2; i++) {

        // ⚠️ skip duplicates для i
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {

                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // ⚠️ skip duplicates для left
                while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                }

                // ⚠️ skip duplicates для right
                while (left < right && nums[right] == nums[right - 1]) {
                    right--;
                }

                left++;
                right--;

            } else if (sum < 0) {
                left++;   // треба більшу суму
            } else {
                right--;  // треба меншу суму
            }
        }
    }

    return result;
}
}
