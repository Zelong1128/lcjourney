public class _704_binaray_search_closeLR {
    // 左右都闭合
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length - 1])    return -1;
        // 左边右边都要闭合，右侧取能取到的右端点
        int l = 0, r = nums.length - 1, mid = l + r >> 1;
        // 左闭合右闭合指的是判定区间
        while(l  <=r  ){
            mid = l + r >> 1;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
}
