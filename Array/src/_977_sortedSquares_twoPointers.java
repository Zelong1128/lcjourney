public class _977_sortedSquares_twoPointers {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, k = nums.length - 1;
        int[] res = new int[nums.length];
        while(i <= j){
            if(nums[i] * nums[i] > nums[j] * nums[j])
                res[k--] = nums[i] * nums[i++];
            else
                res[k--] = nums[j] * nums[j--];

        }
        return res;
    }
}
