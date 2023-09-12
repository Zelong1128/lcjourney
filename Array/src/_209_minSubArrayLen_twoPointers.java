public class _209_minSubArrayLen_twoPointers {
    // 解释以上代码
    public int minSubArrayLen(int target, int[] nums) {
        // 定义左指针l，右指针r，初始值为0，最小子数组长度为Integer.MAX_VALUE
        int l = 0, len = Integer.MAX_VALUE, sum = 0;
        // 遍历数组nums
        for(int r = 0; r < nums.length; r++){
            // 将当前元素加入总和
            sum += nums[r];
            // 当总和大于等于target时，更新最小子数组长度
            while(sum >= target){
                // 将当前最小子数组长度赋值给len
                len = Math.min(len, r - l + 1);
                // 将总和减去当前元素
                sum -= nums[l++];
            }
        }
        // 如果len为Integer.MAX_VALUE，则返回0，否则返回len
        return len == Integer.MAX_VALUE? 0 : len;
    }
}