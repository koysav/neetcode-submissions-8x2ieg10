class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        int left = 0;
        int raight = numbers.length-1;

        while( left < raight ) {

            if ((numbers[left] + numbers[raight] == target)) {
                return new int[]{left+1, raight+1};
            }else
            if((numbers[left] + numbers[raight])<target) {
                left++;
            }
            else {
                raight--;
            }
        }
        return null;
    }
}
